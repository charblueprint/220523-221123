import java.util.Arrays;

public class Method7 {
	// 보안할 때 기준으로 잡는 것 : 패스워드, 아이피(같은 아이디 다른 pc일시)

	public static void main(String[] args) {
		apink A = new apink("홍길동", 25, "test@test.com", -1000);
//		A.names();
		System.out.println(A.data());
	}
}

class apink {
	// private 선언은 class 필드에서 생성해야 합니다.
	// String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;

	public void names() {
		if(this.nm=="홍길동") {
			this.nm ="hong";	
			String e[] = this.email.split("@"); //이메일 중에 이메일 회사 정보만 가져오기 위한 배열로 나누는 작업
			//System.out.println(Arrays.toString(e));
			this.email_cp = e[1];
		} 
	}

	public apink(String nm, int age, String email, int point) { // private를 안에서 이용하지 못함
		//setter 형태
		this.nm = nm;
		this.email = email;
		if (point < 0) {
			this.point = 0;
		} else {
			this.point = point;
		}
	}

	public String data() {
		names();
		return this.email_cp;
		//return this.nm;
		//<warning!> return은 이미 끝난 거라 아래에 아무것도 쓰면 안된다! 쓰면 오류남 
	}

	public int data2() {
		//getter 형태
		return this.point;
	}
}