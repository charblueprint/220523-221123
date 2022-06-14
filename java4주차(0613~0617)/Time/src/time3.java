public class time3 {
/*응용문제
 외부 class가 있습니다. 단 메인메소드에서 해당 외부 class를 로드하면 해당 메소드에서 즉각적으로 8초동안 로딩이 발생합니다.
 8초이후에 return으로 "입금이 모두 처리되었습니다."라는 문자를 받도록 하십시오.*/
	public static void main(String[] args) {
		/*try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		} catch (InterruptedException a) {
			System.out.println(a);
		}*/
		Account Ac = new Account();
		Ac.count();
	}
}
class Account{ //try-catch 사용
	public void count(){
		try {
			System.out.println("잠시만 기다려주세요.\n처리중입니다.");
			int i=1;
			while(i++<=4) {
				Thread.sleep(2000);
				System.out.print(".");
			}
			System.out.println("\n\n입금이 모두 처리되었습니다.");
		} catch (InterruptedException e) {
			System.out.println("시스템 오류로 인해 다시 시작합니다. 직원을 호출하시기 바랍니다.");
		}
	}
}