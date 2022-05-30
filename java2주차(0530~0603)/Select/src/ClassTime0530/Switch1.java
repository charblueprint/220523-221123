package ClassTime0530;

public class Switch1 {

	public static void main(String[] args) {
		/*switch~case: 선택문
		 * 입력된 값 기준으로 case가 발동하여 출력값을 선택하게 됩니다.
		 * defalut는 case에 내용중 같은 내용이 존재하지 않을 경우 작동되는 문법입니다.
		 * 많아 봤자 10개 이내에서 고를 때 쓸것.. 10개 이상일 경우 실행속도가 급격하게 떨어짐
		 * 은행같은 곳에서도 쓰임. 많이~쓰임!
		 * */
		int n = 3;
		switch(n) {
		case 1:
			System.out.println("옵션 1을 선택하셨습니다.");
			break;
		case 2:
			System.out.println("옵션 2을 선택하셨습니다.");
			break;
		case 3:
			System.out.println("옵션 3을 선택하셨습니다.");
			break;
		default:
			System.out.println("선택한 값이 없습니다.");
			break;
		} 
		
		String user = "이순신";
		switch(user) {
		case "이순신":
		case "이 순신": //이것도 된다!
		System.out.println("A조 입니다.");
		break;
		case "홍길동":
		System.out.println("B조 입니다.");
		break;
		case "유관순":
		System.out.println("C조 입니다.");
		break;
		default:
		System.out.println("나머지는 D조 입니다.");
		break;
		}
	}

}
