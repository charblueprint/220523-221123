/*���빮�� #1
 * 3���� ��ǰ
 * "���ڵ� ��ǰ�� �Է½����ּ���?" �ݾ��� �Է��ϰ� ����
 * "���� %�� �Է��� �ּ���."��� ������ �Բ� 
 * �ش� ���� ���ڸ� �Է��ϸ�
 * �����ݾ��� ����Ǿ� ��µǵ��� �մϴ�.
 * */
package Questions0527;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		DecimalFormat dot = new DecimalFormat("##,###.00");
		Scanner recepit = new Scanner(System.in);
		System.out.println("���ڵ� ��ǰ�� �Է½����ּ���? >> ");
		int item = recepit.nextInt();
		int coupon = recepit.nextInt();
		double A = coupon * item;
		System.out.println(A);
		double B = m*A;
		System.out.println(B);
		double C = money-B;
		System.out.println(C);
	}

}
