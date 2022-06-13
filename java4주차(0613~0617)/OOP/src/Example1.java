//abstract 응용문제
		/* 1차 배열 값이 있습니다. 해당 배열값을 모두 더한 값을 출력합니다.
		 단, abstract 기본 void 이름은 sender입니다.
		 최종 값 출력은 sender에서 출력되도록 합니다.
		 배열은 abstract에서 사용합니다.
		 배열 데이터 : 6,13,22,9,12,64,32,47,39
		 */
public class Example1 {

	public static void main(String[] args) { //외부클래스 호출만 합니다.
		Sum S = new Sum();
		S.sender();
	}

}
abstract class AB{
	public abstract void sender();
	protected int arr[]= {6,13,22,9,12,64,32,47,39};
}
class Sum extends AB{
	protected int total = 0;
	private int i;
	
	@Override
	public void sender() {
		this.i=0;
		do {
			this.total+= this.arr[this.i];			
			this.i++;
		} while(this.i<arr.length);
		System.out.println("TOTAL : " + this.total);
	}
	
}