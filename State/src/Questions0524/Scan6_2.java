/* ���빮�� #5 (0524)
 * Q. �������� ��ȣ�� �Է��ϼ���
 * ���� 220524
 * ����ڰ� ���� 220524 �ܿ� �Է½� "������ȣ�� Ʋ���ϴ�." ��� ����Ͻð�
 * ������ ������ȣ ���ڸ� �Է½� "����Ȯ�� �Ǽ̽��ϴ�."��� ����մϴ�.
 * ��, 220524�� java ����� ���� ���� ����Ǵ� ������ ó���ϼ���.
 * -�̰� �� �ڷ��� ���� ����� �ǹ���.
 */
package Questions0524;

import java.util.Scanner;

public class Scan6_2 {

	public static void main(String[] args) {
		int valid = 220524;
		System.out.print("�������� ��ȣ�� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (valid == num) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		} else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		sc.close();
	}
}
/* +) ������
 * [scanner ���ǻ���]
 * 1.scanner�� import ���
 * 2.�������(����ڰ� ����� �Է��ϴ����� ���� ����)
 * 3.�ش� ����ڰ� �Է��� ���� �޴� ������ ����
 */