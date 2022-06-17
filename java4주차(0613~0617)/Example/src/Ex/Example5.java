package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 직접 숫자를 입력합니다. 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야합니다. 총 숫자 입력은 7번이며,사용자가
		 * 입력한 숫자를 오름차 순으로 정렬 합니다. "숫자를 하나 입력해 주시길 바랍니다 : " 7번
		 * 추가옵션 : 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ARR = new ArrayList<Integer>();
		int I = 0;
		do {
			System.out.printf("숫자를 하나 입력해 주시기 바랍니다.(%d번째) : ",(I+1));
			try {
				Integer check = Integer.parseInt(sc.next()); //들어가서 검수를 받고 바꾸는것임. 
				ARR.add(check);
			} catch (Exception e) {
				System.out.println("숫자로 다시 입력하시기 바랍니다.");
			} 
			I++;
		} while (I < 7); //무조건 7개받으라고 하면 그때는 무한루프 돌려야했음!
		Collections.sort(ARR);
		
		
		
		

	}
}
