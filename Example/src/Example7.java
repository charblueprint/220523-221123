import java.util.Scanner;

/*응용문제 #7
 * 사용자가 다음 질문에 확인하여 값을 입력후 해당 결과를 돌출하는 프로세서를 제작합니다.
 * "첫번째 입력값 (단,1~10까지 입니다.) : "
 * "두번째 입력값 (단,1~10까지 입니다.) : "
 * "세번째 입력값 (단,1~10까지 입니다.) : "
 * "마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오(+,-,*,/)"
 * */
public class Example7 {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
		System.out.print("	<숫자계산기>	\n");
		System.out.print("1번째 입력값 (단,1~10까지 입니다.) : ");
		int Num1 = cal.nextInt();
		System.out.print("2번째 입력값 (단,1~10까지 입니다.) : ");
		int Num2 = cal.nextInt();
		System.out.print("3번째 입력값 (단,1~10까지 입니다.) : ");
		int Num3 = cal.nextInt();

		System.out.print("마지막 질문 입니다. 해당 세가지 값에 대한 산술기호를 적으시오(+,-,*,/) : ");
		String signal = cal.next();
		if (signal.equals("+")) {
			System.out.print(Num1 + Num2 + Num3);
		} else if (signal.equals("-")) {
			System.out.print(Num1 - Num2 - Num3);
		} else if (signal.equals("*")) {
			System.out.print(Num1 * Num2 * Num3);
		} else if (signal.equals("/")) {
			System.out.print((double)Num1 / Num2 / Num3);
		}
		
		System.out.println("\n재시작하시겠습니까? \nyes / no");
		cal.close();
	}
}
