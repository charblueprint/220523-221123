
public class Over2 extends main2 {
	
	public static void main(String[] args) {
		//상속방식
		Over2 Ov = new Over2();
		Ov.abc();
		Over2.abc2();
	}

class main2 extends main3{
	public void abc() {
		System.out.println("외부 메소드 클래스");
	
	}
}
class main3{
	public void abc2() {
		System.out.println("외부 메소드 클래스2");
	}
}