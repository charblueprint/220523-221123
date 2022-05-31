//		응용문제 #5
//		 * 해당 두개의 배열 데이터가 있습니다. 각 배열 별로 인덱스가 같은 번호를 더해서 짝수,홀수인지를 배열 결과 데이터로 
//		 * 재설정하시오.
//		 * 
//		 * A data = 5 17 19 22 33
//		 * B data = 1 2 3 4 5
//		 * result = ["짝수","홀수", "짝수","짝수","짝수"]
//	
package ClassTime0531;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		int A1[][] = {{5, 17, 19, 22, 33}, {1, 2, 3, 4, 5}};
		//A1[0][0]+A1[1][0]
		int ea = A1[0].length; // 배열에 있는 데이터 객체 수
		int ea2 = A1.length;	//배열 그룹 수
		
		int newdata[] = new int[ea]; //새로운 배열 객체생성
		int w=0; //큰 반복문 인덱스 값
		
		while(w<ea) { //큰 반복문은 데이터 넣은 만큼 돌아감(배열 데이터 객체수)
			int total1=0;//각각의 값을 이관받는 변수
			int total2=0;
			int ww=0;
			
			while(ww<ea2) { //작은 반복문 2바퀴(배열 그룹)
				if(ww==0) {
					total1=A1[ww][w];
				} else {
					total2=A1[ww][w];
				}
				ww++;
			} //작은 반복문 밖으로 나와서 첫번쨰 배열 값 + 두번쨰 배열값
			newdata[w] = total1+total2; // 새로운 배열 객체로 등록
			
			if(newdata[w]%2==0) {
			System.out.print("짝수");
			} else {
			System.out.print("홀수");
			}
		w++;
		} 
		
		
	
	
	
	}

}
