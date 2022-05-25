/*응용문제 #10
 * Scanner와 함께 While문으로 사용자가 입력하는 값으로 구구단 결과가 출력되는 프로그램을 제작하시오*/
package Questions0525;

import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 구구단을 입력해주세요^_^ (1단~18단, 숫자만 입력) : ");
		int num1 = sc.nextInt();
		int i=1;
		int j;
		System.out.println("구구단을 외자! 구구단을 외자! \n");
 		while (i<=9) {
 			j= num1*i;
 			System.out.printf("%d*%d=%d \t",num1,i,j);
 			i++;
 		}
 		sc.close();
	}

}
