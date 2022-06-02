import java.util.Scanner;

public class Class5 {

	public static void main(String... args) {
		Member2.lists2(); // static void 사용으로 메모리 할당 되어있어 (클래스.메소드)로만 선언해도 된다!

		Member2 mb2 = new Member2(); // static 사용x 객체및 인스턴스를 사용해야 한다.
		mb2.lists1(); // 인스턴스(메모리)에 있는 메소드를 로드하게 됨.

		Member2 mb3 = new Member2();
		mb3.lists3("유관순",123456); //
	}

}

class Member2 {

	public void lists1() { // 메모리에 별도로 할당하지 않고 메소드 함수만 선언
		String a = "홍길동";
		System.out.println(a);
	}

	public static void lists2() { // Static 유무가 가름. 얘는 메모리를 할당함.
		String a = "이순신"; // lists1과 lists2는 다른 아이들이기 때문에 이름이 같아도 된다.
		System.out.println(a);
	}

	public static void lists3(String nm,int pw) {
		//nm을 메소드에서 전달받는 값을 바로 사용할 경우(nm.equals("유관순"))
		String user_name = nm;
		int user_password = pw; //메소드에 객체값을 첨부하여 로드 후 메소드 안에 별도의 필드명을 이용하여 전달 받는 형식
	
		if(nm.equals("유관순") && user_password==123456) {
			System.out.println("회원 확인이 되었습니다.");
		} else {
			System.out.println("비회원 입니다.");
		}
	}
	
}
