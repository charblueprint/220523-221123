//���빮�� #3 (0524)
/*Q. 1~45���� ���� �ϳ��� �Է��ϼ���.
 error  ���� : 0 ���Խ� - ���� �Է��� �߸��Ǿ����ϴ�.
 45 >�� ���� �Է½� : ���ڴ� 1~45���� �Է� �����մϴ�.
 +) 1~45 ���ڸ� �Է��Ͽ��� ��� : 7,12,14�� �Է½� ��÷�Դϴ�.�� ��� / �׿��� ���ڴ� ������ȸ�� �����ϼ����� ���
 */
package Questions0524;

import java.util.Scanner;

public class Scan5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~45���� ���� �ϳ��� �Է��ϼ��� >> ");
		int num = sc.nextInt();

		if ((num >= 1) && (num <= 45)) {
			if ((num == 7) || (num == 12) || (num == 14)) {
				System.out.println("��÷�Դϴ�!! ^_^");
			} else {
				System.out.println("������ȸ�� �����ϼ���~");
			}
		} else if (num == 0) {
			System.out.println("���) ���� �Է��� �߸��Ǿ����ϴ�!");
		} else {
			System.out.println("���) ���ڴ� 1~45���� �Է� �����մϴ�!");
		}
		
		// ���� �̷��� Ǫ��
		/* if (n==0) {
		 	System.out.println("���) ���� �Է��� �߸��Ǿ����ϴ�!");
		 } else if (n>5) {
		 	System.out.println("���) ���ڴ� 1~45���� �Է� �����մϴ�!");
		 } else {
		 	if ((num == 7) || (num == 12) || (num == 14)) {
				System.out.println("��÷�Դϴ�!! ^_^");
		 	} 
		 	else {
				System.out.println("������ȸ�� �����ϼ���~");
		 	}
		 }
		 �ʿ��� ���ǿ� ���� ���� ����� �������� else�� ������ ���߿��� �ΰ����� �� �߰��� �� �ְ� �ϴ°� ����.
		 */
		sc.close();
	}

}