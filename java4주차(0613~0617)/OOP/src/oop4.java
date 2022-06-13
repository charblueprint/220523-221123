
public class oop4 {
	// 추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
	}

}

abstract class ab_1 { // 추상클래스(고스트라고도 부르기도함) : 외부에서 로드가 절대 안됨 / 자체 실행 xx

	public void ab_a() { // free (인수값 없는 추상 메소드)
		// <<환경설정할 때 쓰임. 팀플때 공용으로 쓸 메소드들 올려 둘 수도 있음
		// abstract를 쓰는 이유 : 코드를 정형화시키기 위함. 특정 기능은 다 이 메소드로 사용한다~ 이런 것임
	}

	public void ab_a(int a) { // free(인수값받는 추상 메소드)
	}
	public abstract void ab_c(); //abstract을 쓰기 떄문에 {}대신 ;을 쓸 수 있음
	public abstract int b(); // 추상 메소드 - 자체 실행 안 됨
	// 다 free 구성인데 이렇게 선언하는 것이 더 깔끔하다는것

	public abstract int c(); // <<이거 없으면 main method에서 실행할때 오류남
}

class ab_2 extends ab_1 {
	@Override
	public void ab_a() {
		System.out.println(this.c());
	}
	@Override
	public void ab_a(int a) {
		
	}
	@Override
	public int b() { // 실제 메소드 + 추상 메소드
		// 이렇게 b를 무조건 가져다 써야함
		return 55;
	}

	@Override
	public int c() {
		return 99;
	}
	@Override
	public void ab_c() {
		// 이거 지우고 위에 다시 보면 빨간색 줄 가 있을 걸 그러니까 위에 선언한 건 다 쓰려고 노력은 해야.. 근데 작동 안되는건 아님
		// 위에서 선언하고 안 써서 너 왜 안 쓰냐? 인거지 너 지금 잘못 썼어는 아닌것임 
		// 그리고 보통 리턴 할때 많이 한다 함	
	}
}