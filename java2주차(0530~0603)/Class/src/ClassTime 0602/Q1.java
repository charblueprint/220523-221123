/*응용문제#1(0602)
		 * for_in이라는 일반 메소드(메모리)가 있습니다. 프로그램 실행시 다음과 같이 질문을 합니다.
		 * "사용하실 구구단 숫자를 하나 입력해 주세요"
		 * [결과] = 해당 메소드에서 결과를 출력해야함
		 * 만약 사용자가 3단을 입력시
		 * 3*1=3,....3*9=27 출력 되어야 함(for문으로 제작)*/
/*응용문제 #2
		 해당 로드할 class 명은 agrees라는 이름을 가지고 있습니다.
		 main 메소드에서 사용자가 "동의함","동의안함"을 입력하게 됩니다.
		 동의함을 입력되었을 경우 "회원가입이 진행됩니다."라는 메세지를 출력하고,
		 동의안함을 입력시 " 동의를 하셔야 진행이 됩니다."라고 출력되도록 하시오.
		 단, agrees 클래스 안에 void method 1개 또는 2개를 선택하여 코드를 제작하시오.*/
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
			Scanner Num = new Scanner(System.in);
			//System.out.print("사용하실 구구단 숫자를 하나 입력해 주세요");
			int init = Num.nextInt();
			Cal.for_in(init); //스캐너를 통해 받은 init 값을 m으로 받아서 계산해서 출력함
			//Num.close();
			
			Scanner A = new Scanner(System.in);
			agrees L = new agrees();
			System.out.print("동의함 (1) / 동의안함 (2)을 숫자로 입력 >> ");
			int B = A.nextInt();
			L.Agrees(B);
			A.close();
	}

}

class Cal{
	public static void for_in(int m) {
		int i;
		for(i=1;i<=9;i++) {
			//System.out.printf("%d * %d = %d\n",m,i,(m*i));
		}
	}
}
class agrees {
	public void Agrees(int Ans) {
		if(Ans==1) {
			System.out.println("회원가입이 진행됩니다.");
		} else {
			System.out.println("동의를 하셔야 진행이 됩니다.");
		}
	}	
}
