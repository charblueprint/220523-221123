/*0616 시작점*/
/*부모클래스 및 자식(내부)클래스 연동*/
public class Class1 {

	public static void main(String[] args) {
		/*부모가 인스턴스에 적용이 되지 않으면 자식 class는 절대 호출하지 못함*/
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); //부모 class.자식 class 이름생성 = 부모 class명.new 자식class명 (인스턴스에 적용)
		pc.c_box();
	}

}
class parents{ //부모 class
	String a = "홍길동"; // 부모 필드에 있는 전역 변수 (this)
	String b;
	class child{ //자식 class => 얘는 진짜 중요한 정보다 싶을 때만
		int a = 20;
		
		public void c_box() { //자식 method
			double c = 10.5;
			System.out.println(c); //자식 전용 지역변수
//			System.out.println(this.a); // 자식클래스 전용 지역변수
			System.out.println(parents.this.a); // 부모클래스 전용 전역 변수 <== 이렇게 써야한다!!
//			System.out.println(parents.this.b); // 부모클래스 전용 전역 변수
		}
	}
	
	public void p_box() { //부모 method
//		class p_aaa{
//			
//		} //이것도 가능하다 이말이야~
		String a = "이순신"; //p_box에 있는 지역변수 선언
		this.b = a;
	 //System.out.println(this.a);
	}
}