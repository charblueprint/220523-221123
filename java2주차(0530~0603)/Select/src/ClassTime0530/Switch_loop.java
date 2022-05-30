package ClassTime0530;

public class Switch_loop {

	public static void main(String[] args) {
		String sign = "*";
		String msg = "총 1~5까지 계산된 값은 ";
		int total;
		/* case 안에 각각의 반복문을 사용할 수 있습니다.
		 * 또한 동일한 변수 명을 사용해도 가능하며, case가 각각의 다르게 작동하기 때문에
		 * 문제가 되는 사항은 없습니다. 
		 * 단, case는 하나의 조건이 맞을 경우 나머지 case는 정대 작동하지 않음*/

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
