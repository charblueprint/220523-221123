package Classtime;

import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String... args) {
		//for문 + Scanner
		
		Scanner sc = new Scanner(System.in);// 입력엔진 로드
		System.out.print("원하시는 구구단 숫자를 입력하세요.(1단~9단) : "); //질문사항
		int num= sc.nextInt(); //사용자가 입력한 내용
		int i;//반복문에 사용하는 변수
		int j;//반복문에 산술연산 결과값
		for(i=1;i<=9;i++) {
			j = num*i;//산술연산
			System.out.printf("%d ",j);//출력
		}
		sc.close();//종료
		
	}

}

