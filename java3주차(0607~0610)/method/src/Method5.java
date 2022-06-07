
public class Method5 {

	public static void main(String[] args) {
		cdb c = new cdb ();
		/*
		c.d1 = "홍길동";
		c.data2();
		c.d3 = "이순신";
		c.data1();
		c.d3 = "유관순";
		System.out.println(c.data3());
		*/
		//c.d2 = "강감찬"; /*private으로 선언한 객체 이므로 main class에서 로드 못함*/
		c.data2("강감찬");
		//cdb.data1(); /
		String result = c.data3();
		System.out.println(result);
	}

}
class cdb {
	String d1 = null; /*void, 자료형 메소드 로드 가능*/
	private String d2 = null; //말 그대로 사적인 자식. 해당 클래스 내에서만 쓰이는 놈
	public static String d3; /*다 사용가능*/
	
	public static void data1() {//static 쓰고 그냥 때리면 사용하기는 편함.
		//System.out.println(d3);
		//System.out.println(this.d2); /* static 자료형 외에는 로드가 불가능함. private사용 절대 불가 */
	}
	public void data2(String user) {
		this.d2 = user;
		System.out.println(this.d2);
	}
	public String data3() {
		String a = this.d2; //int 쓸 때 아무것도 안 넣고 코드 작성하려면 ""칸에 0 넣기
		return a;
	}
	
}