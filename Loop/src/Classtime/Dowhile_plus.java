package Classtime;

public class Dowhile_plus {

	public static void main(String[] args) {
		/* Do~While : 30~35까지 합계를 출력하시오 */
		int A = 30;
		int total = 0;
		do {
			total += A;
			A++;
		} while (A <= 35);
		System.out.println("합계 : " + total);
	
	/*응용문제 #2
	 * 합계숫자 189가 있습니다. 
	 * 단, 1~10까지 합계치와 현재 189를 뺀 총 합계를 출력하시오
	 */
		int init = 189;
		int Z = 1;
		int total2 = 0;
		do {
			total2+=Z;
			Z++;
		}while (Z<=10);
		System.out.println("Total : " + (init - total2));
	
	}
	

}
