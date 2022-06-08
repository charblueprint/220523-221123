
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(상속)
		/*
		 절대 부모 클래스에 construct 부분에 인수값을 적용하면
		 자식 클래스에서 로드를 못하는 사항이 발생함.
		 단, 자식 클래스에서 인수값을 적용하여 construct를 사용할 수는 있음
		 */
		math1 m1 = new math1();
		math2 m2 = new math2(50);
	}

}
class math1{
	public int no;
	public math1(){
		this.no=20;
		System.out.println("math1");
	}
} class math2 extends math1{ //자식 클래스에서 던져야 함
	public math2(int z) {
		this.no=20;
		System.out.println("math2");
	}
}