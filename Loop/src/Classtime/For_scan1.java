package Classtime;

import java.util.Scanner;

public class For_scan1 {

	public static void main(String... args) {
		/* int a = 5;
		 * System.out.println(a++);
		 * System.out.println(++a); 
		 int b = 10;
		 int c = 10;
		 int d = b+(++c);
		 System.out.println(d);*/
		Scanner sc = new Scanner(System.in); // 입력 엔진
		int grade; // 사용자 입력
		int f; //반복문
		int total = 0; //입력된 값에 대한 합계
		for(f=1;f<4;f++) {
			System.out.println("점수를 입력하세요.");
			grade=sc.nextInt(); //사용자가 입력한 값
			total+=grade;//사용자가 입력한 값을 합계변수 이관
		}
		System.out.println("총 점수의 합은 : "+total);
		sc.close();
	}

}
