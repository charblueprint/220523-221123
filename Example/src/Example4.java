
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 #2 다음결과값에 맞춰서 코드가 출력 되도록 하시오. 해당코드는 for문으로 작성합니다.
		 * 
		 * 45 35 25 15 10
		 */
		int N, M, FinalP;
		for (N = 1; N <= 4; N++) {
			M = 55 - (10 * N);
			System.out.print(M + " ");
			if (M <= 15) {
				FinalP = M - 5;
				System.out.println(FinalP);
			}
		}
		
		/* 쌤은...
		 * int f;
		 * int v;
		 * for(f=9;f>0;f--) {
		 * 		v=5*f;
		 * 		if(f%2==1||f>=2) {
		 * 			if(f!=1){
		 * 				System.out.println(v+" "); 
		 * 			}
		 * 		}
		 * }
		 */
	}

}
