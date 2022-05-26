package ClassTime;

public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 #10 (0526) 구구단6단 중에서 35이상 결과 숫자만 출력하시오.
		 */
		int B = 1;
		int C;
		do {
			C = 6 * B;
			if (C >= 35) {
				// System.out.print(C + " ");
			}
			B++;
		} while (B <= 9);
		
		/*
		 * 응용문제 #11
		 * 14~27까지 숫자중 짝수 값을 모두 더하여 최종 결과값을 출력하시오.
		 */
		int Num = 14;
		int total = 0;
		do {
			if (Num % 2 == 0) {
				total+=Num;
			}
			Num++;
		} while (Num < 28);
		System.out.print(total+" ");
	}

}
