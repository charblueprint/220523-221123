package Exception;

public class exception5 {

	public static void main(String[] args) { //역할 : 값 주고, 출력만 함
		try {
			words Wd = new words();
			String result = Wd.files("");
			System.out.println(result);
		}catch (Exception a) {
			System.out.println("빈 값이 문제가 되어 올바른 값을 전달받지 못함");
			/*if(a!=null) {
				System.out.println(a);				
			}*/
		} finally { // 여기에서 고칠점을 넣어 발송하는것.
			try {
			words Wd2 = new words();
			String result = Wd2.files("홍길동");
			System.out.println(result);
			} catch (Exception e) {
				System.exit(0);
			}
			
		}
	}

}
class words{ //역할 : 값을 받고 연산 후 return
	public String files(String aa) throws Exception{
		if(aa==null||aa.equals("")) {
//			Exception EX = new Exception();
//			throw EX; //이 두줄 정리하면 
			throw new Exception("값이 비어있음"); //이렇게 바로 보내버린다
		} else {
			String msg = aa+"님 환영합니다.";
			return msg;
		}
	}
}