/*응용문제 #8(0530) 
 * hong kim park lee jang jung
 * 해당 사용자 리스트 배열이 있습니다. 해당 배열값중 사용자 아이디 3단어 이상만 출력시키시오.*/
/*응용문제 #9
 * 배열 데이터 다음과 같음
 * 15 60 11 14 27 
 * 데이터 값을 모두 더해서 최종 결과값을 출력하시오.*/
package ClassTime0530;

public class Array2 {

	public static void main(String[] args) {
		//#8
		String N[] = {"hong","kim","park","lee","jang","jung"};
		int word= N.length;//전체회원수를 파악하기 위함
		int init = 0;
		int three;//각각의 배열 데이터의 문자갯수파악
		while (init<word) {
			three = N[init].length();//문자갯수 파악
			if(three>3) {
				//System.out.println(N[init]);//세단어 이상(포함)의 데이터만 출력
			}
			init++;
		}
		//#9
		int A[] = {15,60,11,14,27}; // 배열부터 먼저 찍고 1
		int B = A.length; // 그룹의 전체 갯수알고 2
		int Z = 0; // 배열 첫번째 것 3
		int total = 0;//
		do { //반복 6
			total+=A[Z]; //총합을 표시하고 4
			Z++; // 증가하면서 6
		} while(Z<B); //첫번째 ~ 전체갯수까지 지정 5
		System.out.println(total); //총합 표시 7
		
		
	}

}
