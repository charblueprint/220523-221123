/*���빮�� #3
 * �� 2���� ������ �ϰ� �˴ϴ�.
 * ����ڰ� ���ڸ� �Է��Ͽ� �� ���� ���� ���ϴ� Scanner �����Ͻʽÿ�
 * */

package Classtime;

import java.util.Scanner;

public class While_scan1 {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int grade; 
		int f = 1;
		int total = 0; 
		while( f<=2 ) {
			System.out.println(f+"��° ���ڸ� �Է��ϼ���");
			grade=sc.nextInt(); 
			total+=grade;//����ڰ� �Է��� ���� �հ躯�� �̰�
			f++;
		}
		System.out.println("�� ������ ���� : "+total);
		sc.close();
	}

}
