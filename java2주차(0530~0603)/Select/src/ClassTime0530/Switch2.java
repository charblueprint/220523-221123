/*응용문제 #7
 * 사용자가 다음과 같은 질문을받습니다.
 * Q. "1~5번 까지 숫자를 하나 입력해 주시길 바랍니다." 
 * 결과 내용 
 * 1: 5% 할인 쿠폰
 * 2: 10% 할인 쿠폰
 * 3~4: 택배비 무료
 * 5: 다음 기회에
 * */

package ClassTime0530;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner lotto = new Scanner(System.in);
		System.out.print("1~5번까지 숫자를 하나 입력해주세요. >> ");
		System.out.print("\n쿠폰 당첨시 내 정보 > 쿠폰함 에서 확인하실 수 있습니다.");
		int Num = lotto.nextInt();
		String msg;
		
		switch(Num) {
		case 1:
			msg = "5% 할인 쿠폰";
			//System.out.println("<5% 할인 쿠폰>이 당첨되셨습니다.");
			break;
		case 2:
			msg = "10% 할인 쿠폰";
			//System.out.println("<10% 할인 쿠폰>이 당첨되셨습니다.");
			break;
		case 3:
		case 4:
			msg = "택배비 무료";
			//System.out.println("<택배비 무료>가 당첨되셨습니다.");
			break;
		default:
			System.out.println("<꽝!> \n다음기회에..");
			break;
		}
		System.out.println(msg);
		lotto.close();
	}

}
