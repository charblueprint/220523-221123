package Javaclass;

public class Etc220523 {
		//덤으로 변환에 대해서..
			int k=3;
			int j=9;
			double aw= (double) k/j; 
			/*쌤왈 ; 연산형태의 자료형 또한 있는 코드다.
			 *원래 double aw = k/j;라고 입력하면 결과값이 분수, 즉 소수점 결과값으로 도출되기 때문에
			 *0.0으로 나옴. 그래서 그것을 막기 위해 
			 *32번째 줄처럼 앞에 (자료형)을 붙여 선언하면 그 자료형으로 변환됨.
			 */
			System.out.println(aw);

			/*정리*/
			/*public static void main(String[] args) {
			 * 변수선언 + 데이터 할당
			 *변수선언시 주의사항 자료형을 명확하세 구분하여 사용해야함
			 *사칙연산자 +두가지의미 : 숫자 +숫자(계산) 문자+문자 or 문자+숫자(연결)
			 *double로 나누기 할 경우 소수점 결과값을 출력해야 할 경우 
			 *연산에 (double) 자료형을 기입해야 합니다.
			 *+) java 코드 정렬 : ctrl+ shift + f
			 */
			

}
