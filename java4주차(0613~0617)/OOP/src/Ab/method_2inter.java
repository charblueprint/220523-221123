package Ab;
//interface : 메소드만 선언, 추가로 연산을 처리하는 형태의 default가 버전이 올라가며 추가됨
public interface method_2inter {
	//abstract은 클래스고 interface는 메소드다
	//interface는 메소드이므로 필드에 자료형을 선언할 수 없음
	public String names();// String names() return메소드 선언
	default void setbox(String name) {	// setter
		System.out.println(name);
	}
	default String box3() { //getter
		// interface에는 default를 선언하면 연산메소드를 사용함.
		return null;
	}
}
interface method_2re extends method_2inter { //interface에 extends로 부모 interface를 로드할 수 있습니다.
	//근데 여기에서는 implement는 안된다는 점!
	//보통 이런거는 기능구현 다 했는데 옵션을 추가로 제시했을때 그냥 거기에 살 붙이는 것
}