package Ab2;
import Ab.method_1; //package Ab에서 main class를 로드함

public class ab2_method {

	public static void main(String[] args) {
		//메인클래스에서는 ovrride 사용 불가
		Ab.method_1 at = new Ab.method_1();
		at.main(args);  //main 메소드 실행
		at.recall();	// public 메소드 실행
		at.name();		// protected 메소드 실행
	}

}
