package Classtime;

public class Do2 {

	public static void main(String... args) {
		int a = 1; // 반복문 기초값
		int b = 9; // 산술 고정값
		int c;
		do {
			c = a * b;
			System.out.println(c + " ");
			a++;
		} while (a < 10);

/*
 응용문제
 다음 결과값을 보고 do~while문으로 코드를 작성하시오.
 35 45 55 65 75		
 */

		int d = 0;
		int e = 10;
		int f;
		do {
			f = 35 + (e * d);
			System.out.print(f + " ");
			d++;
		} while (d <= 4);
		
		
		

	}

}
