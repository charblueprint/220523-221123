package ClassTime0530;

import java.util.Scanner;

public class Switch2_1 {

	public static void main(String[] args) {
		Scanner lotto = new Scanner(System.in);
		System.out.print("1~5������ ���ڸ� �ϳ� �Է����ּ���. >> ");
		System.out.print("\n���� ��÷�� �� ���� > ������ ���� Ȯ���Ͻ� �� �ֽ��ϴ�.");
		int Num = lotto.nextInt();
		String msg;

		switch (Num) {
		case 1 -> {
			msg = "5% ���� ����";
		}
		case 2 -> {
			msg = "10% ���� ����";
		}
		case 3, 4 -> {
			msg = "�ù�� ����";
		}
		default -> {
			msg = "���� ��ȸ��";
		}
		}

		System.out.println(msg);
		lotto.close();
	}

}
