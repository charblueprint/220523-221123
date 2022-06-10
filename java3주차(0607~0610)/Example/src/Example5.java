import java.util.Scanner;

/*응용문제#2*/
// extends를 사용하여 다름 겨로가에 대한 코드를 작성하시오.
//숫자 두개를 입력합니다. 두개의 숫자를 확인하여 다음과 같이 체크합니다.
/*1.첫번째 숫자가 두번째 숫자보다 클 경우(A>B)
  2.첫번째 숫자보다 두번째 숫자가 클 경우 (A<B)
  3.첫번째 숫자가 두번째 숫자랑 같은 경우
  
  1번의 경우 : 헤당 범위 만큼 숫자를 모두 더한 결과 값을 출력
  2번의 경우 : 해당 두개의 값을 합친 결과 값 출력
  3번의 경우 :"해당 값은 같습니다."라고 메세지 출력
  */

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두 개를 입력합니다.>> ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		BigSmall B1 = new BigSmall();
		B1.Nums(A, B);
		sc.close();
		System.gc();
	}

}

class BigSmall {
	protected int total = 0;
	protected int Num1;
	protected int Num2;

//	public BigSmall(){
//	메소드에 뭐 안던지고 바로 재생할 때 만들면 된다.
//	}
	public void Nums(int A, int B) {
		this.Num1 = A;
		this.Num2 = B;

		if (A == B) {
			System.out.println("결과 : 해당 값은 같습니다.");
			System.exit(0);
		} else {
			BigSmall2 B2 = new BigSmall2();
			B2.print();
		}
	}

	class BigSmall2 extends BigSmall {
		public void print() {
			String message = "결과 : ";
			int i = 0;
			if (this.Num1 > this.Num2) { // 1번
				i = this.Num2;
				do {
					this.total += i;
					i++;
				} while (i <= this.Num1);
				System.out.println(this.total);
			} else if (this.Num1 < this.Num2) { // 2번
				this.total = this.Num1 + this.Num2;
				System.out.println(message + this.total);
			}
		}
	}
}