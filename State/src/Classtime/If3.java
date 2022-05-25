package Classtime;

public class If3 {

	public static void main(String[] args) {
		
		/*자료형2
		 *boolean : true, false로 구분하게 됩니다.
		 */
		boolean ws = true;
		if (ws==true) {
			System.out.println("회원가입이 진행됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야만 진행됩니다.");
		}
		
		String userid = "park";
		String password = "a1234";
		
		// &&(and) : 한가지 조건 이상 모두 맞을 경우
		// ||(or) : 한가지 조건 이상에서 한개라도 맞을 경우
		if ((userid=="park") && (password=="a1234")) {
			System.out.println("로그인 하셨습니다.");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		
		if ((userid=="park") || (userid =="kim")) { 
			// 로그인 페이지에서 &&를 ||로 표기하지 않길 바람
			// if ((userid=="park") || (password =="a1234")) { 에서
			// 두 조건 중에 한 가지로도 맞을 경우 그냥 바로 넘어가버림 그래서 뚫려버림
			System.out.println("회원이 확인 되었습니다.");
		}
		else {
			System.out.println("확인된 아이디가 없습니다.");
		}
		
		
	}

}
