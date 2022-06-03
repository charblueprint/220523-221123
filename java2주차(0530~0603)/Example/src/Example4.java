import java.util.Arrays;
import java.util.Scanner;

/*응용문제 #4
 <배열 + 기본(클래스) 메소드 문제>
 사용자가 다음 질문에 값을 입력하게 됩니다.
"학급 학생 이름을 입력해 주세요?"
총 배열 데이터는 5개가 생성되어 집니다.
별도의 메소드에서 해당 사용자가 입력한 값을 리스트로 구성하여
출력하시오
예시) 사용자가 입력한 형태 : hong kim park lee jang
출력 : [hong, kim, park, lee, jang]
 
 */
public class Example4 {

	public static void main(String[] args) {

		int i;
		String list= "";
		for (i = 0; i <= 4; i++) {
			System.out.print("학급 학생 이름을 입력해 주세요?>> ");
			Scanner sc = new Scanner(System.in);
			String st = sc.next();
			list += (st + " ");
		}
			Example4 E = new Example4();
			E.student(list);
			
	}

	public void student(String R) {
		R = R.trim(); 
		/* (변수명) = (변수명).trim => 가장자리의 공백제거해줌 */
		//중앙의 공백을 제거하려면 =>(변수명) =  (변수명).replace
		String user [] = R.split("\\s+");
		//split : 문자열 또는 숫자열을 특정문자 기준으로 배열을 만들 수 있는 명령어 입니다.
		System.out.println(Arrays.toString(user));
	}

}
