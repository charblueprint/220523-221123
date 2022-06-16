//인증번호 발송 시스템 awt6_abstract 연계
/**/
public class awt6 {

	public static void main(String[] args) {
		start st = new start(); 
		// 이걸 한번 넣은 이상은 이 start라는 객체는 계속 st라는 별명으로 돌아간다!
		st.setting(); // awt 시동시작 1
	}

}

class start extends awt6_abstract {
	private String code = ""; 

	@Override
	public String getdata() {
		return this.code;
	}
	
	@Override
	public void setdata() {
		int i = 0;
		do {
			this.code += (int)(Math.random()*10);
			i++;
		} while (i < 4);

		System.out.println("인증번호 : " + this.getdata()); // 컴퓨터가 가진 숫자
	}
	
}
