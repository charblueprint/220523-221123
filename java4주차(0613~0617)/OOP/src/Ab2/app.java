package Ab2;

public class app {

	public static void main(String[] args) {
//		//(자식) = (자식)
//		members mb = new members();
//		mb.oop();
//		mb.oop2();
		
		//(부모) = (자식) => 인터페이스 기준으로 적용된 오버라이드만 호출(형변환)
		members mb = new members(); 	//자식 class 전용
		app_data2 ap2 = mb; //인터페이스 전용 (클래스->인터페이스 기준)
		//app_data1 ap1 = new members(); // app_data1만 사용하겠다는 의미		
		//ap2.opp();=> 인식 안함
	
		app_data2 ap = new members();
		members mb2 = (members)ap2; //자식 class로 인터페이스를 재변환
		//(인터페이스 -> 클래스 변환) 
	
	
	}

}
//class members implements app_data1 => app_data1에 강제로 자료형 선언하는 방식
class members implements app_data2{
	public void opp() {
		System.out.println("TEST1");
		oop();
	}
	@Override
	public void oop() {
		System.out.println("TEST2");
	}

	@Override
	public void oop2() {
		System.out.println("TEST3");
	}

}