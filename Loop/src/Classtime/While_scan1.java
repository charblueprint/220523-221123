/*응용문제 #3
 * 총 2번의 질문을 하게 됩니다.
 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 Scanner 제작하십시오
 * */

package Classtime;

import java.util.Scanner;

public class While_scan1 {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int grade; 
		int f = 1;
		int total = 0; 
		while( f<=2 ) {
			System.out.println(f+"번째 숫자를 입력하세요");
			grade=sc.nextInt(); 
			total+=grade;//사용자가 입력한 값을 합계변수 이관
			f++;
		}
		System.out.println("총 점수의 합은 : "+total);
		sc.close();
	}

}
