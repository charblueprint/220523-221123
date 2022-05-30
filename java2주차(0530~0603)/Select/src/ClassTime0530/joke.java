package ClassTime0530;

import java.util.Scanner;

public class joke {

	public static void main(String[] args) {
		System.out.println("인원수를 선택하세요");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("옵션 1을 선택하셨습니다.");
		case 2:
			System.out.println("옵션 2을 선택하셨습니다.");
		case 3:
			System.out.println("옵션 3을 선택하셨습니다.");
		}
	}

}
