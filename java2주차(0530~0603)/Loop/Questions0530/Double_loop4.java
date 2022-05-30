/*응용문제 복합반복문 for,do~while*/
/*응용문제 #4
 * 구구단 7~9단까지
 * 단, 각 구구단 곱셈값은 5까지만 나오도록 합니다.
 * 7*1=7~7*5=35...9*5=45
 * 제약 ; 큰 do~while문 작은 while문*/
/* #5
 * 다음 결과 값을 확인하여 코드를 작성합니다.
 * 단, for문 ~ while문으로 제작되어야 합니다.*/
/*#6
 *다음 해당 결과값처럼 출력이 되도록 더블 반복문을 이용하시오. (while ~ do~while)
 * 1+1=2
 * 2+1=3 2+2=4
 * ...
 * 4+1=5 .... 4+4=8
 */
package Questions0530;

public class Double_loop4 {

	public static void main(String[] args) {
		// 응용문제
		int f;
		for (f = 2; f <= 3; f++) {
			int w = 1;
			do {
				// System.out.println(f + "*" + w + "=" + (f * w));
				w++;
			} while (w <= 9);
		}

		// 응용문제 #4
		int A = 7;
		do {
			int B = 1;
			// System.out.printf("<%s단> \n",A);
			while (B <= 5) {
				// System.out.println(A + "*" + B + "=" + (A * B));
				B++;
			}
			A++;
		} while (A <= 9);

		// 응용문제 #5
		int x;
		for (x = 1; x <= 9; x++) {
			int y = x;
			while (y <= x) {
				System.out.println(x + "*" + y + "=" + (x * y));
				y++;
			}
		}
		//응용문제 #6
		

	}

}
