/*���빮�� #1 (0525)
	���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ����� �����ؾ� �մϴ�.
	���� �⺻ �ڻ� �ݾ� = 100,000won 
	"1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�." �ϴ� �޼����� ���� ���� ����Ǿ�� �մϴ�.
		1�� �Է½� "�ش� �ݾ��� �Է��ϼ���"
		����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.	
		2���� �Է½� "����� �ݾ��� �Է��ϼ���"
		����ڰ� �Է��� �ݾ� - �⺻�ڻ�ݾ��� ����Ͽ� �� �ڻ�ݾ��� ����Ͻø� �˴ϴ�.
		�������� �־� �� �� : 1. ������ ��ȣ 2.�Ա� �ݾ� 3. ��� �ݾ�
*/
package Questions0525;

import java.util.Scanner;

public class bounsQuestion1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("1�� �Է½� �Ա�, 2�� �Է½� ����Դϴ�."); // �ʼ� �޼���
		String press = num.next();

		int UserAccount = 100000; // �⺻ �ڻ� ����

		if (press.equals("1��")) {// �޴�����
			System.out.println("�ش� �ݾ��� �Է��ϼ���. >> "); // �ְ���,�������ϴ� �ݾ� �Է�
			Scanner bill = new Scanner(System.in);
			int PutMoney = bill.nextInt();
			System.out.printf("�� �ݾ��� %s���Դϴ�.", (UserAccount + PutMoney)); //�Աݽ� �� �ڻ�ݾ�
			bill.close();
		} else if (press.equals("2��")) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
			Scanner want = new Scanner(System.in);
			int OutMoney = want.nextInt();
			System.out.printf("�� �ݾ��� %s���Դϴ�.", (UserAccount - OutMoney));//��ݽ� �� �ڻ�ݾ�
			want.close();
		} else { // �߸� �Է½�
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���ø����̼��� �����մϴ�.");
			System.exit(0);
		}
		num.close();
	}

}
