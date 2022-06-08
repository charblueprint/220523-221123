
public class Method10 {
	//문자열 정규식 코드
	public static void main(String[] args) {
		//getter setter 기능 사용해서 만들 수도 있음!
		/*setter : 사용자가 입력한 값 또는 수식값 등 전달하는 메소드
		  getter : 연산을 거친 후 return으로 값을 보내는 메소드*/
		met m = new met();
		m.setUser_name("홍길동");
		m.setUser_pass("a123456");
		m.setUser_email("hong1234@gmail.com");
//		System.out.println(m.getUser_name());
//		System.out.println(m.getUser_pass());
//		System.out.println(m.getUser_email());
		
		//replace : 치환형태의 함수입니다. 
		//replaceAll : replace에서 조금 발전된 치환형태의 함수
		//예전 버전은 replace와 replaceAll을 구분했다고 하는데 최근 버전에서는 둘 다 혼용한다 함
		String str = "홍길동님 환영합니다.";
		String str2 = str.replace("님", "고객님"); 
		// trim 기억나니? 걔는 가장자리를 바꾸고 얘는 중간을 바꾸고
		System.out.println(str2);
		
		String nm = "홍 길 동";
		String rnm = nm.replace(" ", ""); //공백 없애는 치트키
		System.out.println(rnm);
		String nm2 = "자바가 진짜 사람을 잡아요";
		String rnm2= nm2.replaceAll("자바", "java");
		System.out.println(rnm2);
	}

}
class met{
	private String user_name;
	private String user_pass;
	private String user_email;
	
	public String getUser_name() {
		return this.user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return this.user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_email() {
		return this.user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}