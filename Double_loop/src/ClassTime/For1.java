package ClassTime;

public class For1 {

	public static void main(String... args) {
		/* 구구단 2~3단 출력하기 */
		int F, FF; // 반복문에 사용할 변수 선언을 미리 하였음
		for(F=2;F<=3;F++) { //큰 for문 2~3까지만 회전함
			for(FF=1;FF<=9;FF++) {//작은 for문 1~9까지 회전
				//System.out.print(F+"*"+FF+" ");
			}
			
		}
		
		/* 응용문제 #12
		 * 구구단 5~7단 출력을 하되 4까지만 연속적으로 나오는 수식구를 출력하시오 */
		int i,j;
		int total=0;
		for(i=5;i<=7;i++) {
			for(j=1;j<=4;j++) {
				total+=(i*j);
			}	
		}
		System.out.printf("%d ",total);
	}

}
