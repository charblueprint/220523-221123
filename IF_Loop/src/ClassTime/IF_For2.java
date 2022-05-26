package ClassTime;

public class IF_For2 {

	public static void main(String... args) {
		// 1~100까지 숫자 중 80이상의 숫자만 출력
		int F;
		for (F = 1; F <= 100; F++) {
			if ((F >= 80) && (F % 2 == 0)) {
				// System.out.print(F+" ");
			}
		}
		/*
		 * 응용문제 #5 (0526) 200~300까지의 숫자중 240이하의 숫자만 출력하시오
		 */
		int O;
		for (O = 200; O <= 300; O++) {
			if (O <= 240) {
				// System.out.print(O + " ");
			}
		}
		
		final int a = 2;
		int w;
		for (w = 1; w < 11; w++) {
			if (w % a == 0) {
				//System.out.print(w + " ");
			}
		}
		/*응용문제 #6 (0526)
		 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10 이상 숫자만 출력합니다.*/
		final int A=2;
		int B;
		int C;
		for (B=1;B<=9;B++) {
			C=A*B;
			if (C>10) {
				//System.out.printf("%d ",C);
			}
		}
		
		/*응용문제 #7 
		 다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		 18 36 54 72 
		 9단 짝수들만 골라내도록!
		 */
		final int AA=9;
		int BB;
		for (BB=1;BB<=9;BB++) {
			if (BB%2==0) {
				System.out.printf("%d ",AA*BB);
			}
		}
		/*응용문제 #8 <<못풀었어.... 어이없음
		 * 다음 결과값을 보고 해당값이 출력되도록 코드를 제작하시오.
		 * 1~20사이의 숫자 입니다
		 * 6 14 17 19 */
		int Num;
		for(Num=1; Num<=20; Num++) {
			if(Num==6||Num==14||Num==17||Num==19) {
				System.out.print(Num+" ");
			}
			
		}
	
	}
	
	

}
