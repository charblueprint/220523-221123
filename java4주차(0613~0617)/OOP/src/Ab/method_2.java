package Ab;

/* <abstract와 interface의 차이점 및 공통점>
공통점 : abstract와 interface는 모두 static은 사용할 수 있음
차이점 : 
1.abstract는 default를 사용하지 않음(public로 설정) -> 필드에 자료형을 생성할 수 있음
2.interface는 interface에는 default를 선언하면 연산메소드를 사용함 -> 필드에 자료형을 선언할 수 없음
결론 : abstract은 클래스고 interface는 메소드다
*/
public class method_2 {
//method_2inter.java & method_2inter2.java 연결
	public static void main(String[] args) {
		loadinter Li = new loadinter();
		Li.setbox("홍길동");
	}
}

//중요 : abstract와 interface는 모두 static은 사용할 수 있음
abstract class test{	// abstract는 default를 사용하지 않음(public로 설정)
	//필드에 자료형을 생성할 수 있음
	public String nn;
	public abstract void box();
	public void box3(String n) {
		this.nn = n;
		System.out.println("test");
	}
	
}
class loadinter implements method_2re, method_2inter2 { // 다중 상속 
	// implements를 CJ 갔을때만 쓰셨다함.. 진짜 대규모 프로젝트때만!
	@Override
	public String names() {
		return null;
	}
}
