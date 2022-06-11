import java.util.Scanner;

/*응용문제#1
 상품 가격은 42000입니다.
 사용자가 해당 상품 갯수를 입력하게 됩니다.
 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제 금액을 출력시키는 extends를 제작하시면 됩니다.
 단,42000은 절대 숫자가 바뀌면 안됩니다.
 사용자가 최대 구매 할 수 있는 갯수는 5개까지 입니다.
 최종결과 값은 main method에서 출력 가능합니다.*/
class file1{
	private final int item=42000;
	private int want ;
	protected file1(int Num) {
		this.setWant(Num);
	}
	public int getWant() {
		return want;
	}
	public void setWant(int want) {
		this.want = want;
	}
	public int getItem() {
		return item;
	}	
}
class file2 extends file1{
	public file2(int Num) {
		super(Num);
	}

	public int code2() {
		//int total = this.getWant()*this.getItem();
		//return total;
		return this.getWant()*this.getItem();
	}
}
public class Example {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("구매 수량을 입력하세요. >> ");
		int input = sc.nextInt();
		if(input>=6) {
			System.out.println("최대 구매 할 수 있는 갯수는 5개까지입니다! 새로고침 후 다시 시도하세요.");
			System.exit(0);
		}
		
		file2 R = new file2(input);
		
		System.out.printf("구매 총액 : %,d원",R.code2());
		sc.close();
	}

}