import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*#8
 ������ ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
 ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
 "1~46�� ������ ���ڸ� �Է��� �ּ��� >>"
 ����ڰ� �Է��� 5���� ���ڸ� �迭�� �����մϴ�.<<�̰��� main �޼ҵ忡�� ó��
 
 �ܺ� class�� �̿��Ͽ� pc�� ���� ��÷ ��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
 PC�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� class method�� ����)
 
 ������ ��� method�� �ϳ� �� �����Ͽ� 
 ����ڰ� �Է��� 5���� �迭�����Ϳ� PC�� ���� �迭 �����͸�
 �ش� method�� �����Ͽ�,����Ͻø� �˴ϴ�.
 
 ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��մϴ�.
*/
public class Example8 {

	public static void main(String[] args) { // �����
		Scanner lotto = new Scanner(System.in);
		int N = 0;
		String choose[] = new String[5];//
		do {
			System.out.printf("1~46�� ������ ���ڸ� �Է��� �ּ���(%s��° ���� �Է�) >> ", N);
			choose[N] = lotto.next();
			N++;
		} while (N <= 4);

		Number A = new Number();
		A.rd(choose);
		A = null;
		lotto.close();

	}

}

class Number {
	public void rd(String Nums[]) {// Pc
		int P[] = new int[5];
		Random PC = new Random();
		int i = 0;
		do {
			P[i] = PC.nextInt(45) + 1;
			i++;
		} while (i < 5);
		B(Nums, P);

	}

	public static void B(String Nums1[], int Nums2[]) {
		System.out.println(Arrays.toString(Nums1) + "\n" + Arrays.toString(Nums2));
	}
}
