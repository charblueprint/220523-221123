/*응용문제 #3
 해당 데이터 배열에 있는 모든 값중 짝수값만 모두 더하시오.
 1번 데이터 : 11, 42, 22, 16
 2번 데이터 : 7, 33, 10, 29
 결과값 : 90
 */




package ClassTime0531;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*
		 * 정적 배열 
		 * int a[] = new int[2]; 
		 * a[0]=22; 
		 * a[1]=32;
		 */

		/*
		 * 동적 배열 
		 * int b[] = {1,2,3,4}; 
		 * int[] c = {1,2,3,4}; 
		 * int[] d = new int[] {1,2,3,4};*/

		/* 2차 배열 [][] */
		/*
		 * 2차 정적 배열 String member2[][] = new String[3][3]
		 */
		String member[][] = { { "홍길동", "김유신", "유관순" }, { "25", "31", "22" } };
		// 데이터가 빌 경우 ""의 형태로 들어옴.
		int L = member.length;// 배열 갯수가 몇개 있는 지를 확인
		int L1 = member[0].length;
		int L2 = member[1].length;
		// 해당 배열에서(member[0]이면 0번째 인덱스에서 나오는 자료들의미함.) 데이터 객체가 몇개있는지 확인
		// System.out.println(L2);

		// System.out.println(member[0][1]);
		int f, ff;
		for (f = 0; f < L; f++) { // 큰 반복문은 배열 갯수만큼 loop
			// System.out.println(Arrays.toString(member[f]));
			for (ff = 0; ff < L1; ff++) { // 작은 반복문은 배열에 있는 데이터 갯수만큼 loop가 돕니다.
				// System.out.println(member[f][ff]);
			}
		}
		int[][] data = { { 1, 3, 5 }, { 2, 4, 6 } };
		int A = data.length;
		int B = data[0].length;// []안에는 아무거나 넣어도 됨. 어차피 층끼리 데이터 갯수는 동일하기 떄문에..

		int i, ii;
		int total = 0;
		for (i = 0; i < A; i++) {
			// System.out.println(Arrays.toString(data[i]));
			for (ii = 0; ii < B; ii++) {
				// System.out.print(data[i][ii]);
				total += data[i][ii];
			}
		}
		//System.out.println("총 합계는: " + total);
	
		/* #3 */
		int [][] Num = {{11, 42, 22, 16}, {7, 33, 10, 29}};
		
		int j=0;
		int k=0;
		int total1 = 0;
		do{
			do {
				if (Num[j][k] % 2 == 0) {
					total1 += Num[j][k];
				}
				k++;
			} while(k < Num[0].length);
			j++;
		}while(j < Num.length);
		System.out.println("결과값 : " + total1);
	
	
	}

}
