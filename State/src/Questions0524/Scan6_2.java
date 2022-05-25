/* 응용문제 #5 (0524)
 * Q. 인증받은 번호를 입력하세요
 * 숫자 220524
 * 사용자가 숫자 220524 외에 입력시 "인증번호가 틀립니다." 라고 출력하시고
 * 동일한 인증번호 숫자를 입력시 "인증확인 되셨습니다."라고 출력합니다.
 * 단, 220524는 java 실행시 가장 먼저 실행되는 변수로 처리하세요.
 * -이건 그 자료형 먼저 쓰라는 의미임.
 */
package Questions0524;

import java.util.Scanner;

public class Scan6_2 {

	public static void main(String[] args) {
		int valid = 220524;
		System.out.print("인증받은 번호를 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (valid == num) {
			System.out.println("인증확인 되셨습니다.");
		} else {
			System.out.println("인증번호가 틀립니다.");
		}
		sc.close();
	}
}
/* +) 마무리
 * [scanner 주의사항]
 * 1.scanner을 import 사용
 * 2.문구출력(사용자가 어떤값을 입력하는지에 대한 문구)
 * 3.해당 사용자가 입력한 값을 받는 변수를 지정
 */
