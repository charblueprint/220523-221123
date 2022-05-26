
package ClassTime;

public class If_while1 {

	public static void main(String... args) {
		/*응용문제 #9
		 * while문으로 10~30까지 숫자중에서 홀수값만 출력하시오. */
		int A = 10;
		while (A <= 30) {
			if ((A % 2 != 0) && (A >= 20)) {
				System.out.print(A + " ");
			}
			A++;
		}
		
		// 카운터 값으로 갯수 확인하기
		/*1~10까지 숫자 중에 짝수 값이 몇개 있는지 갯수를 출력하세요*/
		int Input = 1;
		int count = 0; // 카운터 변수값
		while(Input<=10) {
			if(Input%2==0) { //짝수일 경우 
				count++;	//해당 조건이 맞을 경우 +1씩 증가함
			}
			Input++;
		}
		System.out.printf("1~10까지 숫자 중 짝수 개수는 %d입니다.",count); 
		//반복문 종료시 최종 카운터 값을 출력하게 됩니다.
		
	
	}

}
