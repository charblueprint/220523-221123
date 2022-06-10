import java.util.Scanner;

/*응용문제#1(0610)*/
/* 두 개의 값을 외부 클래스로 보냅니다.
 해당 클래스에서 두개의 값을 계산하게 됩니다.
 계산형식은 다음과 같습니다.
 3,10을 보내게 되면 두개의 값의 합을 구합니다.
 나머지 외부 클래스에서 해당 결과값을 출력하는데 
 두개의 합 값이 짝수, 홀수인지를 출력하는 extends를 구현하세요.
*/
public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요 >> \n1.");
		int A = sc.nextInt();
		System.out.print("2.");
		int B = sc.nextInt();
		Plus1 P = new Plus1();
		P.plus(A, B);
		sc.close();
	}

}

class Plus1 {
	public String odd[] = { "짝수", "홀수" };
	protected int num1 = 0; protected int num2 = 0;
	protected int C = 0;
	
	public void plus(int A, int B) {
		this.num1 = A;
		this.num2 = B;
		this.C = this.num1 + this.num2;
		Plus2 P2 = new Plus2();
		P2.print(this.C);
	}
}

class Plus2 extends Plus1 {
	public void print(int C) {
		this.C = C;
		if (this.C % 2 == 0) {
			System.out.println("짝수임");
		} else {
			System.out.println("홀수임");
		} 

	}
}