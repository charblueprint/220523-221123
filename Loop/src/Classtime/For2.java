package Classtime;

public class For2 {

	public static void main(String[] args) {
		int a; // for문 초기값
		// int b=2; // 연산에 사용할 변수
		// int c; //연산할 결과값 사용
		for (a = 1; a <= 9; a++) {
			// c=b*a; // 산술 연산 작업
			// System.out.print(c+" ");
		}

		/* 응용문제 #5 다음 결과값을 보고 코드를 작성하시오
		 * 45,40,35,30,25,20,
		 */
		int A;
		int B = 5;
		int C;
		for (A = 9; A >= 4; A--) {
			C = A * B;
			// System.out.print(C + ",");
		}

		/* 응용문제 #6 다음 결과값을 보고 코드를 작성하시오
		 * 11,22,33,44,55,66,77,88,99,
		 */
		int D;
		int E = 11;
		int F;
		for (D = 1; D <= 9; D++) {
			F = D * E;
			System.out.print(F + ",");
		}
		/*샘은 이렇게도 하심
		 * int z;
		 * int x;
		 * for (z=1;z<10;z++){
		 * 		x = (10+z)+10;
		 * 혹은  x = (10*z)+z;
		 * 		System.out.print(x+",");
		 */

	}

}
