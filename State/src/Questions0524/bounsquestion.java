/*응용문제 #6 (0524)
 사용자가 입력하여 조건에 맞는 메세지를 출력하시오.
 
 첫번째 숫자값을 입력하세요?
 두번쨰 숫자값을 입력하세요?
 
 (첫번째 숫자값)*(두번째 숫자값)에 대한 결과를 출력하십시오.
 단,해당 결과값이 100 이하인 경우 출력메세지 "해당값은 100이하 결과값입니다"라고 설정하고
 100이상일 경우 "해당값은 100이상 결과값입니다."라고 출력합니다.
 */
package Questions0524;

import java.util.Scanner;

public class bounsquestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자값을 입력하세요?");
		int first = sc.nextInt();

		System.out.print("두번째 숫자값을 입력하세요?");
		int second = sc.nextInt();

		int C = first * second;
		if (C <= 100) {
			System.out.println("해당값은 100이하 결과값입니다");
		} else {
			System.out.println("해당값은 100이상 결과값입니다.");
		}
		sc.close();
	}

}
