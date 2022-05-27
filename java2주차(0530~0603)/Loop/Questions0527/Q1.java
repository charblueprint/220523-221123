/*응용문제 #1
 * 3개의 상품
 * "바코드 상품을 입력시켜주세요?" 금액을 입력하고 나서
 * "할인 %를 입력해 주세요."라는 문구와 함께 
 * 해당 할인 숫자를 입력하면
 * 최종금액이 변경되어 출력되도록 합니다.
 * */
package Questions0527;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		DecimalFormat dot = new DecimalFormat("##,###.00");
		Scanner recepit = new Scanner(System.in);
		System.out.println("바코드 상품을 입력시켜주세요? >> ");
		int item = recepit.nextInt();
		int coupon = recepit.nextInt();
		double A = coupon * item;
		System.out.println(A);
		double B = m*A;
		System.out.println(B);
		double C = money-B;
		System.out.println(C);
	}

}
