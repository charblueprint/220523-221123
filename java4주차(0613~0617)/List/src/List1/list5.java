package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*응용문제 #5*/
		/*사용자가 숫자금액을 입력합니다.
		 해당 숫자 금액횟수는 총 8번입니다.
		 0~n까지 입력 가능하며 해당입력이 모두 끝나면 최종합계 금액을 출력하시오.
		 예시) 입금할 금액을 입력하세요
		 500 600 500 400 200 100 50 50
		 결과) 총 입금 금액은 : 2400입니다.
		 */
		String msg[]= {"입금할 금액을 입력하세요>> ","'원'을 제외하여 다시 입력해주세요\n"
				+ "(숫자만 입력)","총 입금 금액은 ","원입니다."};
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data= new LinkedList<>();
		String input;
		
		int total = 0;
		do {
			System.out.println(msg[0]);
			input = sc.next();
			try {
				int i = data.size();
				int input2 = Integer.parseInt(input);
				data.add(input2);
				total+= data.get(i); 
				if(i>=8) {
					System.out.println(data+"\n"+msg[2]+total+msg[3]); 
					break;
				}
				}
			catch (Exception e) {
				System.out.println(msg[1]);
			}
		} while (true); 
		
			
	}
}

