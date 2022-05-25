package Classtime;
import java.util.Scanner; 
// import : java에 있는 파일을 로드할때 사용하는 언어
// export : java에 있는 파일을 별도로 내보낼 수 있는 언어
// java.util 패키지 안에  Scanner 클래스 부분을 로드하게 됩니다.
// java.util 패키지는 그냥 사용하지 못하며 new를 할당하여 구분자를 사용해야 합니다.
// 단, 해당코드 위치가 작성코드보다 아래에 있으면 안됩니다.
public class If4 {

	public static void main(String[] args) {
				// new : 객체를 선언함
		Scanner sc = new Scanner(System.in);
		//System.in != System.out
		System.out.print("아이디를 입력하세요 >> ");
		String id = sc.next();
		//next(): 사용자가 입력하는 형태를 말합니다. (숫자, 문자를 입력받는 형태)
		System.out.println(id+"님, 환영합니다.");
		
		sc.close();
	}

}
