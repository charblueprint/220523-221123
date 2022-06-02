import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		Data_list Da = new Data_list();
		//Da.array_data(num);

		//String pay = "신용카드";
		String pay = "무통장";
		if (pay.equals("신용카드")) {
			Da.pay1(); // 해당조건에 맞는 메소드를 호출
		} else {
			Da.pay2(pay);// 메소드에 객체값을 태워서 전달(객체값은 무한대)
		}
		
		
		
		
	}

}

class Data_list { 
	/*static 메소드를 활용하는 형태 : 
	 * 여러 package에서 해당 메소드를 자주 사용해야하는 부분에서는 static을 이용하여 사용합니다.
	 * static(정적 메소드) : 오버 라이딩을 사용할 수 없음
	 * void만 사용(동적 메소드) : 오버 라이딩 사용 가능
	 * 오버라이딩 예제
	 class a {
	 	void method
	 }
	 class b extend a {
	 	void method
	 } 
	 */
	//+) 메모리 누수가 너무 많다 = static을 남발해서 메모리가 부족해짐. 그러니 작작 사용하도록 하자.
	public void array_data(int A) { // static없는 메소드
		int i = 1;
		while (i <= 9) {
			System.out.println(A * i + "\n");
			i++;
		}
	}

	public void pay1() {
		System.out.println("신용카드로 결제 진행합니다.");
	}

	public void pay2(String pm) {
		System.out.println(pm + "으로 결제 진행합니다.");
	}

	
}

