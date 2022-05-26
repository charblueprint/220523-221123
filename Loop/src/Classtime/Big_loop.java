package Classtime;

import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*int i;
		int total = 0;
		for(i=1;i<=100;i++) {
			total*=i;
		}
		System.out.println(total);*/
		
		/*1~100까지 곱한 결과값*/
		int Input;
		BigInteger Mega = new BigInteger("1"); // 합계치에 사용할 자료형 변수 1을 최초값으로 설정. 단, ""를 무조건 적용해야 합니다.
		//BigInteger : java에서 모든 무한의 값을 저장 할 수 있는 유일한 자료형입니다.
		//사용처 - 게시판 이용, 첨부파일
		for(Input=1;Input<=10;Input++) {
			/*multiply : 사칙연산 곱하기를 담당함.
			 *add: 사칙연산 더하기를 담당함
			 *subtract : 사칙연산 빼기를 담당함
			 *divide : 사칙연산 나누기를 담당함 */
			Mega = Mega.multiply(BigInteger.valueOf(Input));
		}
		System.out.println(Mega);
	}
}
