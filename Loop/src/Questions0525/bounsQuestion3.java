/*응용문제 #3
 * 구구단 2단 2*1~2*9까지의 총 합계를 출력하시오.
 * 정답 합계 '90'*/
package Questions0525;

public class bounsQuestion3 {

	public static void main(String... args) {
		int b;
		int c; 
		int total=0;
		while(b<=9) {
			c = 2*b;
			total = total + c;
			System.out.printf("%d",total);
		}
	}
		

}
