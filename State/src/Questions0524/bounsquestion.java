/*���빮�� #6 (0524)
 ����ڰ� �Է��Ͽ� ���ǿ� �´� �޼����� ����Ͻÿ�.
 
 ù��° ���ڰ��� �Է��ϼ���?
 �ι��� ���ڰ��� �Է��ϼ���?
 
 (ù��° ���ڰ�)*(�ι�° ���ڰ�)�� ���� ����� ����Ͻʽÿ�.
 ��,�ش� ������� 100 ������ ��� ��¸޼��� "�ش簪�� 100���� ������Դϴ�"��� �����ϰ�
 100�̻��� ��� "�ش簪�� 100�̻� ������Դϴ�."��� ����մϴ�.
 */
package Questions0524;

import java.util.Scanner;

public class bounsquestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڰ��� �Է��ϼ���?");
		int first = sc.nextInt();

		System.out.print("�ι�° ���ڰ��� �Է��ϼ���?");
		int second = sc.nextInt();

		int C = first * second;
		if (C <= 100) {
			System.out.println("�ش簪�� 100���� ������Դϴ�");
		} else {
			System.out.println("�ش簪�� 100�̻� ������Դϴ�.");
		}
		sc.close();
	}

}