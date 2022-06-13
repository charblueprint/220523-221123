/*0613 시작점*/
import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//재귀 메소드 사용법
		@SuppressWarnings("unused")
		op_method om = new op_method();
	}

}
/*
재귀 메소드 : 메소드를 직접 또는 간접으로 호출하는 프로세서를 말합니다.
반복문, 외부 class를 재실행등 복잡한 문제를 쉽게 해결하기 위해서
구현하는 메소드 형태를 말합니다.
*/
class op_method {
	String msg[] = {"찾을 이름을 입력하세요. >> ","홍길동","해당 이름은 없습니다."};
	Scanner sc = new Scanner(System.in); 
	// 시도할 때 계속 실행되면 메모리 차서 부족해짐 그러니까 필드에 한번 실행시키고 계속 돌리면 되는것임. 
	private String nm;
	public op_method() {
		this.m1(); //이렇게 넘기면 값을 고스란히 m1으로 넘기는 것임.=> m1 작동!
	}
	public void m1() {
		System.out.print(msg[0]);
		 this.nm = sc.nextLine();
		 this.m2(); 
		 //m2으로 this.m2();나 m2();로 넘겨도 상관 x
		 // m2();로도 넘길 수 있는 이유는 같은 클래스이기 때문임
		 //this.__();를 사용하는 경우 안에 값 넣어서 보내면 안됨!!
	}
	public void m2() { //m1에 대한 결과값을 m2가 확인
		if(this.nm.equals(msg[1])) {
			sc.close(); // 필요없으면 이렇게 스캐너 종료하면 된다.
			System.exit(0);
		} else {
			System.out.println(msg[2]);
			this.m1(); //m1을 다시 재 호출(재귀메소드)
		}
	}
}