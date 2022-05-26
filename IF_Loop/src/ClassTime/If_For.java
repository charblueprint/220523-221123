package ClassTime;

public class If_For {

	public static void main(String[] args) {
		final int a = 1;
		final String name = "홍길동";
		// final함수 : 사용x 시에는 변수였던 수를 상수로 바꿔 선언. 그 수학의 상수가 맞다.
		/* 그래서 중요한게 final 쓰고 뒤에 그 상수에 대한 다른 선언을 하면 안된다. 
		 * 이미 그 값으로 안바뀔거라 했는데 갑자기 뒤에서 응~ 그 변수 이름으로 또 다른값 선언할거야~ 하면 
		 * 그 순간에 박살남.
		 */
		System.out.println(a);
		System.out.println(name);

		final int ct = 101; // ct는 곧죽어도 101이구나~ ->고정값
		int f;// 변수 f?
		boolean Ok = false; // Ok라는 개체는 false인 상태구나~-> 조건에 대한 False,True
		for (f = 1; f < 101; f++) { // 아 반복문? f가 1이네 101전까지 출력후 증가하네
			if (f == ct) { // f랑 ct가 같아?-> 반복문값과 고정값이 같을 경우
				System.out.println("등록된 값이 확인됩니다."); // 이거 출력하라고~
				Ok = true; // Ok를 true로 바꾸라고~ 오케오케 -> 조건에 대한 값을 변경합니다.
			}
		}
		if (Ok == false) { // 만약에 반복문이 끝났는데도 반복문 안에 조건사항이 없을 경우 출력되는 코드입니다.
			System.out.println("확인이 되지않는 숫자입니다.");
		}

		/* 총 20번의 값을 반복합니다. 그중 홀수값만 출력 하도록 합니다. */
		int i;
		String odd="";// +) odd는 홀수 even은 짝수
		for (i = 1; i <= 20; i++) { // 이런 구조 그 기간안에 가입한 고객 추첨하는 그런경우에 쓰인다
			if (i % 2 == 0) { // 이때는 else 잘 안씀.. 왜냐 이중 출력 될 가능성 농후. 그렇지만..?
				System.out.print(i + " ");
			}
			else { //이렇게 쓰기도.. 만약에 홀수 값일 경우 odd 변수에 지속적을 값을 추가하게 됩니다.
				odd += " " + i; //추가 할 경우 " " 빈공간을 활용하여
			}
		}
		System.out.println(odd);
	}

}
