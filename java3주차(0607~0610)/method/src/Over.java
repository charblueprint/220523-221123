
public class Over {

	public static void main(String[] args) {
		//pt P = new pt();
		//P.display();
		cd C = new cd();
		C.display("메인 내용 값 출력");
		C.display(); //오버라이드
	}
}
/*
오버로딩(overloading) : 새로운 메소드를 정의하는 것을 말합니다.
오버라이드(override) : 부모 클래스에서 상속 받은 기존 메소드를 사용하는 것을 말합니다.
*/

class pt{
	public void display(){
		System.out.println("부모 외부 내용 값");
	} public void aaaa() { //그래서 여기에다가도 줘야 함.
		System.out.println("자식에 만들어진 메소드");
	}
}

class cd extends pt{
	//aaaa() 메소드는 에노테이션을 사용하지 못함. 이유 : 부모 클래스에서 선언하지 않았음.
	/*
	@Override //부모에게 없는 메소드 만들고 오버라이드 때리면 오류난다!
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	*/
	@Override //에노페이션 
	public void display() { //오버라이드 (부모클래스의 구성품을 자식클래스의 구성품으로 덮어쓰기)
		System.out.println("자식 클래스 값으로 변경");
		super.display(); // 부모에는 고유 속성 메소드 값을 가져올 때 사용합니다.
	} public void display(String msg) { //오버로딩 (부모 클래스에서 없던 구성품을 자식 클래스에서 선언)
		System.out.println(msg);
	}
}