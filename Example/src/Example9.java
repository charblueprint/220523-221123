import java.util.Scanner;

/*���빮�� #9
 * A�л��� ���� ������ �Է¹ް� ��� ������ ������ ���α׷��� �����մϴ�.
 * "������ �Է��ϼ���?' ��� ������ ��  5���� ������ �Ǹ�, ��� ������ �ջ� �� �� 5���� ������ ���� ��հ��� ���
 * ��� �޼����� "�ش� ������ ������:" ���
 * ��, ���� ������ 40�� ���� �� ��� "������Դϴ�."��� �޼����� 
 * ����� ���μ����� �����մϴ�. 40�� �̻��� ��� "�հ�"�̶�� �޼����� ����Ͻʽÿ�.
 * do~while������ ���� 
 * 
 * [�߰���ȹ]
 * "�Է��Ͻ� ���� ���� �����ּ���:" ��� ���� ���� ��� ��
 * �ش� ���� �� ��ŭ �ݺ����� ������ �Ǹ�, ���� �� ��ŭ ��հ��� ���� �Ǿ�� �մϴ�.
 * */

public class Example9 {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);

		System.out.println("�Է��Ͻ� ���� ���� �����ּ��� : ");
		int subject = grade.nextInt();

		int ownG;
		int i = 1;
		int total = 0;
		do {
			System.out.println("������ �Է��ϼ���?");
			ownG = grade.nextInt();
			total += ownG;
			i++;
		} while (i <= subject);
		int average = total / subject;
		
		System.out.println("�ش� ������ ������ : " + average+ "��");
		if (average <= 40) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("�հ�");
		}
		
		/* ���� �̷��� �Ͻ�! �ǰ� �����ϳ�
		 * String msg;
			if (average <= 40) {
				msg = "�����";
			} else {
				msg = "�հ�";
			}
			System.out.printf("�ش� ������ ������ %d���̰�, %s�Դϴ�.",average,msg);*/
		
		// System.out.println("�� ������ " + total + "�Դϴ�.");
	}

}
