import java.util.Scanner;

/* 응용문제#14
 * 사용자가 입력한 숫자에 맞춰서 구구단이 작동되며,
 * 구구단결과를 계산하여 짝수인지 홀수인지 출력하시오.
 * "구구단에 대한 숫자를 입력하세요?" 라고 메세지가 출력되면 해당숫자에 맞춰서 모든 결과를 더하며,
 * 더한 값에 따라 짝수인지 홀수인지를 출력하시면 됩니다.
 * 단, 해당 반복문은 for~do while문까지 한가지를 선택해서 작성하시오.
 * */
public class Example2 {

	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		System.out.print("구구단에 대한 숫자를 입력하세요.>> ");
		int Num = multi.nextInt();
		int n, m;
		int total = 0;
		
		for (n = 1; n <= 9; n++) {
			m = Num * n;
			total += m;
		}
		
		if (total % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		

	}

}
