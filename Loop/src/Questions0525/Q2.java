/*응용문제 #7 (0525)
 * 다음사항을 while문으로 작성하시오.
 * 22~16까지 숫자를 출력하시오
 */
package Questions0525;

public class Q2 {

	public static void main(String[] args) {
		int A = 22;
		while (A >= 16) {
			//System.out.print(A + ",");
			A--;
			}
/* 응용문제 #8 (0525)
 * 변수2개를 이용하여 범위에 맞게 값을 출력하시오.
 * 99~47까지
 * 
 */
		int x = 99;
		int y = 47;
		while (x >= y) {
			System.out.printf("%d ",x);
			x--;
		}
	}		
}

