import java.util.Scanner;

/*���빮��#4
 * �������� �迭 ������ ���� �ֽ��ϴ�.
 * a1 : ȫ�浿 �̼��� ������ ������ ������
 * a2 : 100 80 39 60 55
 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���" ���
 * �˻�� �̼����̶�� �˻��� �ϰ� �Ǹ�
 * �̼��Ŵ��� 80�� �Դϴ�. ��� ����� �Ǿ�� �մϴ�.
 * msg = "�̼���"+���� +"80��"+" �Դϴ�." */

public class Class_Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��ϰ��� �ϴ� �̸��� �����ּ��� >> ");
		String N = sc.next();
		String Search[][] = {{"ȫ�浿", "�̼���", "������", "������", "������" }, { "100", "80", "39", "60", "55" }} ;
		List.thing(Search,N); //������� �����Ͻ�
		
	}
}

class List {
	public static void thing(String A[][], String B) {
		int I = A.length; //���°��������
		int J = A[0].length; // ������ �� ������ ����ִ°�.
		String result []= new String[J]; //�� �迭 ����.
		int i = 0; //I ������
		int j = 0; //J ������
		do {
			do {
				if (B.equals(A[0][j]) || B.equals(A[1][j])) {
					System.out.printf("%s���� %s�� �Դϴ�.", B, A[i][j]);
					break;
				}
				j++;
			} while (j < J);
		 i++;
		} while (i < I);
			

	}
}
