package ClassTime0530;

public class Switch_loop {

	public static void main(String[] args) {
		String sign = "*";
		String msg = "�� 1~5���� ���� ���� ";
		int total;
		/* case �ȿ� ������ �ݺ����� ����� �� �ֽ��ϴ�.
		 * ���� ������ ���� ���� ����ص� �����ϸ�, case�� ������ �ٸ��� �۵��ϱ� ������
		 * ������ �Ǵ� ������ �����ϴ�. 
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����*/

		switch (sign) {
		case "+" -> {
			int f;
			total = 0;
			for (f = 1; f <= 5; f++) {
				total += f;
			}
			System.out.printf("%s %d ",msg,total);
		}
		case "-" -> {
			total = 0;
		}
		case "*" -> {
			total = 1;
			int f = 1;
			do {
				total *= f;
				f++;
			} while (f <= 9);
			System.out.printf("%s %d", msg, total);
		}
		case "/" -> {
			total = 0;
		}
		}

	}
}
