/*���빮�� #7
 * ����ڰ� ������ ���� �������޽��ϴ�.
 * Q. "1~5�� ���� ���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�." 
 * ��� ���� 
 * 1: 5% ���� ����
 * 2: 10% ���� ����
 * 3~4: �ù�� ����
 * 5: ���� ��ȸ��
 * */

package ClassTime0530;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner lotto = new Scanner(System.in);
		System.out.print("1~5������ ���ڸ� �ϳ� �Է����ּ���. >> ");
		System.out.print("\n���� ��÷�� �� ���� > ������ ���� Ȯ���Ͻ� �� �ֽ��ϴ�.");
		int Num = lotto.nextInt();
		String msg;
		
		switch(Num) {
		case 1:
			msg = "5% ���� ����";
			//System.out.println("<5% ���� ����>�� ��÷�Ǽ̽��ϴ�.");
			break;
		case 2:
			msg = "10% ���� ����";
			//System.out.println("<10% ���� ����>�� ��÷�Ǽ̽��ϴ�.");
			break;
		case 3:
		case 4:
			msg = "�ù�� ����";
			//System.out.println("<�ù�� ����>�� ��÷�Ǽ̽��ϴ�.");
			break;
		default:
			System.out.println("<��!> \n������ȸ��..");
			break;
		}
		System.out.println(msg);
		lotto.close();
	}

}
