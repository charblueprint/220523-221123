import java.util.Scanner;

/*응용문제#1
 상품 가격은 42000입니다.
 사용자가 해당 상품 갯수를 입력하게 됩니다.
 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제 금액을 출력시키는 extends를 제작하시면 됩니다.
 단,42000은 절대 숫자가 바뀌면 안됩니다.
 사용자가 최대 구매 할 수 있는 갯수는 5개까지 입니다.
 최종결과 값은 main method에서 출력 가능합니다.*/
public class Example6 {

	public static void main(String[] args) {
		Scanner Buy = new Scanner(System.in);
		System.out.print("상품의 갯수를 입력하세요.>> ");
		int A = Buy.nextInt();
		
		if(A>=6) {
			System.out.println("최대 구매 할 수 있는 갯수는 5개까지입니다! 새로고침 후 다시 시도하세요.");
			System.exit(0);
		}
		
		file2 F = new file2();
		F.check(A,0);

		int result = F.Total2();
		System.out.printf("결제 총액 : %d원", result);
		Buy.close();

		//file2 file2 = new file2();
		//file2.Total(); //근데 여기까지도 오는 듯..
	}
}

class file1 {
	protected int A2;
	protected int sum;

	public void check(int A1, int z) {
		this.A2 = A1;
		this.sum = z;
	}
}

class file2 extends file1 {
	public void Total() {
		if ((this.A2>=1)&&(this.A2<=5)) {
			this.sum = this.A2 * 42000;
		}
	}
	public int Total2() {
		return this.sum;
		
	}
	
}