package Exception;

public class exception6 {
/*응용문제 사용자가 45*3+16+5+22*8 해당 연산값의 최종값을 외부클래스로 전송합니다. 
 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며 홀수일 경우 정상적인 값으로 다시 회신되도록 합니다.
 홀수일 경우 "홀수값입니다."로 다시 회신되도록 합니다.
 짝수일 경우 "예외처리 발생으로 재 확인이 필요합니다." 출력*/
	public static void main(String[] args) throws Exception{
		int A = 45*3+16+5+22*8;
		Cal Ca = new Cal();
		Ca.name(Integer.valueOf(A));
		
		String result = Ca.name();
	}
}
class Cal {
	 protected String msg = "";
	 public String name(Integer integer) throws Exception{
		try {
			if(Integer.valueOf(integer)%2==0) {
				
			} 
		} catch (Exception e) {
			System.out.println("예외처리 발생으로 재 확인이 필요합니다.");
		} finally {
			
		}
		return this.msg;
	}
 }