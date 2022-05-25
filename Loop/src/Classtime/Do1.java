package Classtime;

public class Do1 {

	public static void main(String... args) { // 실무에서 []대신 ...을 쓰기도 한다~ 시스템 오류 날까봐..
		int a = 1; // 초기값
		do {
			System.out.println(a + " ");
			a++; // 증감값
		} while (a < 11); // 범위값,종료값
		/*
		 * 응용문제 5~0까지 출력되는 do~while문 작성하시오
		 */
		int b = 5;
		do {
			System.out.printf("%d ", b);
			b--;
		} while (b >= 0);
		
		int c = 50;
		int d = 60;
		do {
			System.out.printf("%d ", c);
			c++;
		} while (c <= d);

	}

}
