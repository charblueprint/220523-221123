/* ���빮�� #4 (0524)
 * [�α��� ���α׷�]
 ȸ�� ���� ���̵�� jung, su 3����
 �н������ 
 jung:j1234
 su:ssh
�ش� ���̵� �ܿ� �������� "���� ���� ���� ������Դϴ�." ��� ����մϴ�.
���� �佺���尡 Ʋ�� ���, "ȸ�������� �ٽ� Ȯ���ϼ���."��� ����մϴ�.
���̵� �� �н����尡 ��� ���� ��� "�α��� �Ǽ̽��ϴ�."��� ����Ͻʽÿ�.
 */

package Questions0524;

import java.util.Scanner;

public class Scan6_1 {

	public static void main(String[] args) {
		Scanner ID = new Scanner(System.in);
		System.out.print("������ ���̵� �Է��ϼ���. >> ");
		String m = ID.next();

		Scanner pass = new Scanner(System.in);
		System.out.print("�н����带 �Է��ϼ���. >> ");
		String p = pass.next();

		if (m.equals("jung") || m.equals("su")) {
			if ((m.equals("jung") && p.equals("j1234")) || (m.equals("su") && p.equals("ssh"))) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
				/*
				 * [���� �̷��� �Ͻ�] 
				 * if (m.equals("jung") || m.equals("su")) { 
				 * 		if ((m.equals("jung") && p.equals("j1234")) {
				 *  		System.out.println("�α��� �Ǽ̽��ϴ�."); 
				 *  	} else if (m.equals("su") && p.equals("ssh")) {
				 * 			System.out.println("�α��� �Ǽ̽��ϴ�.");
				 *   	}
				 */
			} else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���.");
			}
		} else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		ID.close();
		pass.close();
	}

}