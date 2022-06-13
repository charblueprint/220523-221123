
public class oop5 {
	//abstract 응용 기본형태 인수값으로 추상 메소드로 값을 넘김
	public static void main(String[] args) {
		load1 l1 = new load1();
		load2 l2 = new load2();
		l1.datain(20, 30);
		l1.call();
		l2.datain(20, 30);
		l2.call();

	}
}
abstract class abclass {
	int data1, data2;

	public void datain(int d1, int d2) { // 기본 추상 메소드이며, 모든 데이터를 인수값 받아서 this 처리
		// 단, 외부 클래스에서는 선언하지 않음
		this.data1 = d1;
		this.data2 = d2;
	}

	public abstract void Cal(); // 각각의 class 기본으로 Cal 메소드는 무조건 들어가야함.
	public void call() {
		this.Cal();
	}
}
class load1 extends abclass {
	@Override
	public void Cal() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
	public void avg() {
		System.out.println("홍길동");
	}
	public void call() {
		this.Cal();
		this.avg(); // 이것도 맞는데!!
	}
}
class load2 extends abclass {

	@Override
	public void Cal() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg(); // 이게 훨배 편함
	}
	public void avg() {
		System.out.println("홍길동");
	}
}