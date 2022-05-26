import java.util.Scanner;

/*응용문제 #13 (0526)
 * while문으로 코드를 작성해야 하며, 프로세서는 다음과 같다.
 * 사용자가 상품을 전체 선택하였습니다.
 * 질문은 "7000 결제하시겠습니다?'라고 출력되며, 숫자 1이라고 입력하며
 * 최종결제 금액에 추가되어집니다. 단, 2라고 입력시 최종결제 금액에 추가되어지면 안됩니다.
 * 총 질문 횟수는 4번 입니다.
 * 마지막에 최종결제 금액이 나오도록 코드를 작성하시오.
 * */
public class Example1 {

	public static void main(String[] args) {
		Scanner recepit = new Scanner(System.in);
		
		final int money = 7000;
		int Try=1;
		int total=0;
		
		while(Try<=4) {
			System.out.print("7000원을 결제하시겠습니까?(결제시 숫자로 1,취소시 숫자로 2 입력) >> ");
			int answer = recepit.nextInt();
			if(answer==1) {
				total+=money;
			} 			
			Try++;
		}
		System.out.printf("최종 금액 : %d원",total);
		
		
		
		
	}

}
