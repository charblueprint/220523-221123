package Questions0524;
/* 응용문제#1(0524) */
/*<문제>
 * 합산 계산공식 중 작은 값을 출력하시오.
 * 공식1 25+31*4+12
 * 공식2 15*3+9+14
 */

public class App {

	public static void main(String[] args) {
		short a = 25+31*4+12;
		short b = 15*3+9+14;
		String A = "25+31*4+12";
		String B = "15*3+9+14";
		
		if(a>b) {
			System.out.println(B+" 값이 작습니다.");
		}
		else if (a<b) {
			System.out.println(A+" 값이 작습니다.");
		}
		else {
			System.out.println("같겠냐!!");
		}
		
		/* 해당값을 2진수로 짝수, 홀수로 확인하기 */
		int x = b%2;
		// % 기호로 사용시 0 또는 1로 나머지 값이 출력이 됩니다.
		if(x==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
	}

}
