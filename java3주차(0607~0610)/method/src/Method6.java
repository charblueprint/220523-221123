
public class Method6 {

	public static void main(String[] args) {
		//private에 대한 객체 선언 형태 2
		String userid = "hong";
		String skey = "a1234567";
		insert i = new insert();
		i.userid = "admin";
		String result = i.checks(userid,skey);
		System.out.println(result);
	}

}

class insert{
	String userid = null;
	private String key = "a1234567";// 해당 클래스에서 적용되는 key값
	// 보안 / 공용개발시
	public String checks(String user_id,String key) {
		String msg = null;
		if(key.equals("a1234567")) {	//해당 키값(private)와 외부 class에서 넘어오는 인수값과 비교
			if(user_id.equals("hong")){ //아이디 확인
				msg = "데이터를 확인 중에 있습니다.";
			} else {
				msg = "해당 데이터 값을 확인하지 못했습니다.";
			}
		} else { //외부 class에서 올바른 키값이 전달되지 않을 경우
			msg = "error";
		}
		return msg; //최종 결과에 대한 return으로 회신함.
	}
}