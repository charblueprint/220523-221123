/* 1~10까지 모든 숫자를 합한 결과값을 출력하시오 */
package Classtime;

public class For_plus {

	public static void main(String[] args) {
		int f;
		int total = 0;
		for(f=1;f<11;f++) { // total변수 값에 반복값을 지속적으로 증가시킴
			total = total + f; //이거 한달 사용량등 총값을 구하는데 사용됨
			//total += f; 이건 단축버전
		}
		//System.out.printf("총합계: %d",total);
		//+=(더하기 할당) -=(빼기 할당) *=(곱하기 할당) /=(나누기 할당)
		//b = b-f;-> b -= f;
		
/*응용문제 #11
 전체값은 500이 있습니다. 총 8회동안 반복되면서 한번 반복할때마다 12씩 감소하도록 하여 최종 값을 출력하시오
 * 
 */
		int M;
		int H = 12;
		int total2 = 500;
		for(M=1;M<9;M++) {
			total2 = total2 - H;
		}
		System.out.printf("총합계: %d",total2);
	}

}
