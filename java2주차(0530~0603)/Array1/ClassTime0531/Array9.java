/*응용문제#4
 * 2개의 데이터 배열이 있습니다. 해당 데이터 배열을 다음 결과처럼 값을 출력하시오.
 * 1번 데이터 : 대한민국 일본 중국 베트남 태국
 * 2번 데이터 : 40 35 70 55 32
 * 결과 데이터 : 
 * ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"
 * 
 * 응용문제 #5
 * 해당 두개의 배열 데이터가 있습니다. 각 배열 별로 인덱스가 같은 번호를 더해서 짝수,홀수인지를 배열 결과 데이터로 
 * 재설정하시오.
 * 
 * A data = 5 17 19 22 33
 * B data = 1 2 3 4 5
 * result = ["짝수","홀수", "짝수","짝수","짝수"]
 * */

package ClassTime0531;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		String inform [][]= {{"대한민국", "일본", "중국", "베트남", "태국"},{"40", "35", "70", "55", "32"}};
		int i = 0;
	
		int ar2 = inform[0].length;
		String Stress[] = new String[ar2];
		int j = 0;
			do {
				Stress[i] = inform[0][j] +"("+inform[1][j]+")";
				j++;
			} while(j<ar2);
			
		System.out.println(Arrays.toString(Stress));
	
		int A [][] = {{5, 17, 19, 22, 33}, {1, 2, 3, 4, 5}};
		
		int jj = A[0].length;
		int a = 0;
		int b = 0;
		int total;
		String result;
		String result_data [] = new String[jj]; 
			
		while(b<5) {
			
			total = A [0][b] + A [1][b];
			if(total%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			b++;
			}
		}
		

	
	}
