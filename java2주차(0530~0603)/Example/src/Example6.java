import java.util.Scanner;

/*#6
 * <2�� �迭 + �⺻(Ŭ����)�޼ҵ� ����>
 * user_list : ȫ�浿, �̼���, ������, ������,�������, ������, ����屺
 * user_point : 3000 1000 25000 19800 5750 3630 0
 ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ��� >> "
 �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ���� �Ű������� �̿��Ͽ� ���� �� �ش� ������� ����Ͻø� �˴ϴ�.
 */
public class Example6 {

	public static void main(String[] args) {
		System.out.print("����Ʈ�� �˻��� ������ �Է��ϼ��� >> ");
		Scanner sc = new Scanner (System.in);
		String Input = sc.next();
		Data.O(Input);
		sc.close();
		Input = null;
		
	}

}

class Data{
	public void List() {
		
	
	}
	public static void O(String customer){ //�˻� �� ����� �����Ͱ� �� ����� �Ѿ�;�..
		String user_list[][] = { { "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺" }, {"3000", "1000", "25000", "19800", "5750", "3630", "0"} };
		
		int i = 0;
		do {
			int j = 0;
			do {
				if(customer.equals(user_list[i][j])) {
					System.out.printf("%s���� ����Ʈ�� %s�� �Դϴ�.",customer,user_list[1][j]);
				}
				j++;
			}while(j<user_list[0].length);
			i++;
		}while (i<user_list.length);
		
	}

}