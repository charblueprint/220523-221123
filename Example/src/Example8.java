import java.util.Scanner;

/*���빮�� #8
 * ����� �н������ a1234�Դϴ�.
 * ����ڰ� �н����带 �Է��մϴ�. ��, 3ȸ �̻� ���н� ������ ���� ��� �ǵ��� �մϴ�.
 * "�н����� Ƚ���������� ����� ������ �湮�ϼž� �մϴ�."
 * ��, �н����尡 ���� ��� "�α��� �Ǿ����ϴ�."��� ��� �Ǿ�� �մϴ�.*/
public class Example8 {

	public static void main(String[] args) {
		Scanner correct = new Scanner(System.in);
		System.out.print("�н����带 �Է��ϼ��� >> ");
		String password = correct.next();

		int i = 1;
		while (i <= 3) {
			if (password.equals("a1234")) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				break;
			} else {
				System.out.printf("�н����带 �ٽ� �Է����ּ���.(%dȸ �����ϼ̽��ϴ�.) \n", i);
				password = correct.next();
				i++;
				if (i == 3) {
					System.out.println("�н����� Ƚ���������� ����� ������ �湮�ϼž� �մϴ�.");
					break;
				}
			}
		}
		correct.close();
	}
}