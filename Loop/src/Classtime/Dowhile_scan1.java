package Classtime;

import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 #4 
		 * 사용자가 총 3번의 숫자를 입력합니다. 3개 숫자를 모두 곱하여 총 합계 수를 출력하시오.
		 */
		Scanner Num = new Scanner(System.in);
		int User;
		int i = 1;
		long total = 1; //long을 입력시 최종결과에서 음수가 발생
		do {
			System.out.print(i + "번째 숫자를 입력하세요. >> ");
			User = Num.nextInt();
			total *= User;
			i++;
		} while (i <= 3);
		System.out.printf("3개의 곱의 총합은 %d입니다", total);
		Num.close();

	}

}
