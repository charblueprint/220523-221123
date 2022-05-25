//응용문제 #3 (0524)
/*Q. 1~45까지 숫자 하나를 입력하세요.
 error  문구 : 0 투입시 - 숫자 입력이 잘못되었습니다.
 45 >인 숫자 입력시 : 숫자는 1~45까지 입력 가능합니다.
 +) 1~45 숫자를 입력하였을 경우 : 7,12,14를 입력시 당첨입니다.를 출력 / 그외의 숫자는 다음기회에 참여하세요라고 출력
 */
package Questions0524;

import java.util.Scanner;

public class Scan5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~45까지 숫자 하나를 입력하세요 >> ");
		int num = sc.nextInt();

		if ((num >= 1) && (num <= 45)) {
			if ((num == 7) || (num == 12) || (num == 14)) {
				System.out.println("당첨입니다!! ^_^");
			} else {
				System.out.println("다음기회에 참여하세요~");
			}
		} else if (num == 0) {
			System.out.println("경고) 숫자 입력이 잘못되었습니다!");
		} else {
			System.out.println("경고) 숫자는 1~45까지 입력 가능합니다!");
		}
		
		// 쌤은 이렇게 푸심
		/* if (n==0) {
		 	System.out.println("경고) 숫자 입력이 잘못되었습니다!");
		 } else if (n>5) {
		 	System.out.println("경고) 숫자는 1~45까지 입력 가능합니다!");
		 } else {
		 	if ((num == 7) || (num == 12) || (num == 14)) {
				System.out.println("당첨입니다!! ^_^");
		 	} 
		 	else {
				System.out.println("다음기회에 참여하세요~");
		 	}
		 }
		 필요한 조건에 맞춰 먼저 만들고 나머지는 else로 돌려서 나중에라도 부가적인 거 추가할 수 있게 하는게 나음.
		 */
		sc.close();
	}

}
