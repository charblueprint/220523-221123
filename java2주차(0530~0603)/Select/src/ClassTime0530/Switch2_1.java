package ClassTime0530;

import java.util.Scanner;

public class Switch2_1 {

	public static void main(String[] args) {
		Scanner lotto = new Scanner(System.in);
		System.out.print("1~5번까지 숫자를 하나 입력해주세요. >> ");
		System.out.print("\n쿠폰 당첨시 내 정보 > 쿠폰함 에서 확인하실 수 있습니다.");
		int Num = lotto.nextInt();
		String msg;

		switch (Num) {
		case 1 -> {
			msg = "5% 할인 쿠폰";
		}
		case 2 -> {
			msg = "10% 할인 쿠폰";
		}
		case 3, 4 -> {
			msg = "택배비 무료";
		}
		default -> {
			msg = "다음 기회에";
		}
		}

		System.out.println(msg);
		lotto.close();
	}

}
