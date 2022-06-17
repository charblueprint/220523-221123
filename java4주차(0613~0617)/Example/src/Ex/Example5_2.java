package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5_2 {

	public static void main(String[] args) {
			/*
			 * 응용문제 Example5 연계
			 * 추가옵션 : 짝수와 홀수값을 별도로 배열을 관리하도록 합니다.
			 */
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> ODD = new ArrayList<Integer>();
			ArrayList<Integer> even  = new ArrayList<Integer>();
			int I = 0;
			do {
				System.out.printf("숫자를 하나 입력해 주시기 바랍니다.(%d번째) : ",(I+1));
				try {
					Integer check = Integer.parseInt(sc.next()); //들어가서 검수를 받고 바꾸는것임.
					if(check%2==0) {
						even.add(check);
					} else {
						ODD.add(check);
					}
				} catch (Exception e) {
					System.out.println("숫자로 다시 입력하시기 바랍니다.");
				} 
				I++;
			} while (I < 7); //무조건 7개받으라고 하면 그때는 무한루프 돌려야했음!
			Collections.sort(even);
			Collections.sort(ODD);
			System.out.println("짝수 : "+even+"\n"+"홀수 : "+ODD);
			sc.close();
			System.gc();
			
			
			



	}

}
