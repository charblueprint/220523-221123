import java.util.Scanner;

/*���빮�� #7
 * ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է��� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
 * "ù��° �Է°� (��,1~10���� �Դϴ�.) : "
 * "�ι�° �Է°� (��,1~10���� �Դϴ�.) : "
 * "����° �Է°� (��,1~10���� �Դϴ�.) : "
 * "������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�(+,-,*,/)"
 * */
public class Example7 {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		System.out.print("	<���ڰ���>	\n");
		System.out.print("1��° �Է°� (��,1~10���� �Դϴ�.) : ");
		int Num1 = cal.nextInt();
		System.out.print("2��° �Է°� (��,1~10���� �Դϴ�.) : ");
		int Num2 = cal.nextInt();
		System.out.print("3��° �Է°� (��,1~10���� �Դϴ�.) : ");
		int Num3 = cal.nextInt();

		System.out.print("������ ���� �Դϴ�. �ش� ������ ���� ���� �����ȣ�� �����ÿ�(+,-,*,/) : ");
		String signal = cal.next();
		if (signal.equals("+")) {
			System.out.print(Num1 + Num2 + Num3);
		} else if (signal.equals("-")) {
			System.out.print(Num1 - Num2 - Num3);
		} else if (signal.equals("*")) {
			System.out.print(Num1 * Num2 * Num3);
		} else if (signal.equals("/")) {
			System.out.print((double)Num1 / Num2 / Num3);
		}
		
		System.out.println("\n������Ͻðڽ��ϱ�? \nyes / no");
		cal.close();
	}
}
