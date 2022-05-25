/*응용문제 #1 (0525)
	고객이 자신의 통장에서 입,출금을 하는 프로세서를 제작해야 합니다.
	고객의 기본 자산 금액 = 100,000won 
	"1번 입력시 입금, 2번 입력시 출금입니다." 하는 메세지가 제일 먼저 실행되어야 합니다.
		1번 입력시 "해당 금액을 입력하세요"
		사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액을 출력하시면 됩니다.	
		2번을 입력시 "출금할 금액을 입력하세요"
		사용자가 입력한 금액 - 기본자산금액을 계산하여 총 자산금액을 출력하시면 됩니다.
*/
package Questions0525;

import java.util.Scanner;

public class bounsQuestion {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("1번 입력시 입금, 2번 입력시 출금입니다.");
		String press = num.next();
		int UserAccount = 100000;
		
		Scanner bill = new Scanner(System.in);
		int PutMoney = bill.nextInt(); // 넣고자,빼고자하는 금액 입력
		
		if(press.equals("1번")) {
			System.out.println("해당 금액을 입력하세요. >> ");
			System.out.printf("총 금액은 %s원입니다.",(UserAccount+PutMoney));
		} else if (press.equals("2번")) {
			System.out.println("출금할 금액을 입력하세요");
			System.out.printf("총 금액은 %s원입니다.",(UserAccount-PutMoney));
		} else {
			System.out.println("잘못 입력하셨습니다. 어플리케이션을 종료합니다.");
			System.exit(0);
		}
		num.close();
		bill.close();
		
	}

}
