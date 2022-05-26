package Classtime;

public class While_plus {

	public static void main(String[] args) {
		/* 5~10까지 더한 합계 수를 출력 */

		int w = 5; // 초기값
		int total = 0; // 합계치를 누적시키기위한 변수값
		while (w < 11) {
			// total = total + w;
			total += w;
			w++;
		}
		System.out.println("합계 : " + total);
		/*응용문제 #1 (0526)
		 3~8까지 곱한 총 합계 수를 출력하시오 */
		
		int N = 4;
		int total2 = 3;
		while (N <= 8 ) {
			total2*=N;
			N++;
		}
		/*int N = 3;
		 *int total2 = 1; */
		//AA:이걸 우리는 추가할당이라고 부릅니다.. 더하기연산등을 추가하는것,.,
		
		System.out.println("합계 : "+ total2);
	}

}
