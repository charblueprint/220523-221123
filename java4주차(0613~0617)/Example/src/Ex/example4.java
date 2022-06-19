import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/* 응용문제 사용자가 직접 숫자를 입력합니다. 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야합니다. 
* 총 숫자 입력은 7번이며,사용자가 입력한 숫자를 오름차 순으로 정렬 합니다. 
* "숫자를 하나 입력해 주시길 바랍니다 : " 7번
* 추가옵션 : 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
 */
public class example4 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		ArrayList<Integer> ODD = new ArrayList<Integer>();
		ArrayList<Integer> Even = new ArrayList<Integer>();
		int I = 0;
		do {
			System.out.printf("숫자를 하나 입력해 주시길 바랍니다(%d번째 입력) : ",(I+1));
			try { //숫자입력했을 때
				int number = Integer.parseInt(SC.next());
				if(number%2==0) {
					Even.add(number);
					} else {
					ODD.add(number);
					}
			} catch (Exception e) { //아닐 때
				System.out.println("숫자를 입력하세요 >> ");
			}
			I++;
		} while(I<7);
		ODD.sort(Comparator.reverseOrder()); 
		//Comparator.naturalOrder()=> 오름차순  | Comparator.reverseOrder() => 내림차순
		Even.sort(Comparator.naturalOrder());
		System.out.println(ODD+"\n"+Even);
		SC.close();
		
		
	}

}
