
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열데이터 : 홍길동, 이순신, 유관순 세개의 데이터가 있습니다 메인 class에서 문자를 하나 전송 합니다. 단, 문자가 null이라고
		 * 보낼 수 있으며, 배열 데이터와 관계 없는 "강감찬"이라고 보낼 수도 있습니다. 외부 클래스명 : data_list 추상 클래스명 :
		 * v_constuct 외부 클래스 안에 내부 클래스 명은 check 입니다.
		 * 
		 * [결과 형태] 메인 class에서 강감찬을 적용할 경우 내부 클래스에서 "해당 사용자는 가입자가 아닙니다."라고 출력 메인 class에서
		 * 이순신을 적용할 경우 내부 클래스에서 "해당 사용자가 있습니다." 단,Arraylist로 배열 로드해야함.
		 */
		
		Question ques = new Question();
		ques.Q();
		//여기에 많으면 많을수록 메모리가 커져서 무거워짐
	}

}

abstract class v_constuct {
	public abstract void input(String Input);
	String result;
}

class Question{
	public void Q() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("사용자 이름을 입력하세요. >> ");
		String search = Sc.nextLine();

		data_list DL = new data_list();
		DL.input(search);
		Sc.close();
	}
}
class data_list extends v_constuct {
	String msg[] = {"해당 사용자는 가입자가 아닙니다.","해당 사용자가 있습니다.","다시 시도하세요"};

	@Override
	public void input(String Input) {
		this.result = Input;
		if(this.result==null) {				
			System.out.println(msg[2]);
			Question back = new Question();
			back.Q();
		} else {
			this.result = Input;
			check ck = new check();
			ck.RESULT();
		}
		} 

	class check {
		//부모클래스에서 받은 값을 자식클래스로 이관
		String data= data_list.this.result;
		String data_list[]; //필드에 배열을 받는 객체생성 (인스턴스에 올리려면 new 써야된다!)
		ArrayList<String> Arr = null; 
		public void RESULT(){
			//해당 필드에 있는 Qrraylist를 인스턴스로 적용
			this.data_list =  new String[] {"홍길동", "이순신", "유관순"};
			this.Arr = new ArrayList<>(Arrays.asList(this.data_list));
			this.compare(); //배열과 내려온 정보를 비교하는 메소드
		}
		public void compare(){
			int i = 0;
			boolean inform = false; //확인작업을 다시한번 하는 것.
			do {
				if(this.data.equals(this.Arr.get(i))) {
					inform = true;
				}
			 i++;
			}while(i<this.Arr.size());
			
			if(inform==true) {
				System.out.println(msg[1]);
			} else {
				System.out.println(msg[0]);
			}
		}
			
				
			
	

	}
}
