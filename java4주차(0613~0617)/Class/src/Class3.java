

public class Class3 {

	public static void main(String[] args) {
		mama Ma = new mama();
		Ma.f_method("전원우");
		
		mama.cafe CAFE = Ma.new cafe(); 
		CAFE.call();
	}

}
abstract class father{ //추상클래스 (abstract을 이용하면 추상)
	public abstract void f_method(String name); // 추상메소드
	public String x_man; // 전역 변수 선언 (abstract이 없으므로 추상이 아님)
}
class mama extends father{
	@Override
	public void f_method(String name) { //추상 메소드를 실제 메소드로 전환
		this.x_man = name; // 추상 메소드에 있는 전역 변수로 값을 이관함
	} class cafe{
		String msg = mama.this.x_man; //부모 클래스에 있는 전역 변수를 자식클래스 전역 변수로 이관
		public void call() {
			String msg2 = this.msg + "님 짱!!";
			System.out.println(msg2);
		}
	}
	
}