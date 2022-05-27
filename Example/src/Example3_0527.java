import java.util.Scanner;

/*응용문제 #1 (0527)
 * 사용자가 해당 값을 입력합니다.
 * 단 , 사용자가 두개의 숫자를 입력하되 
 * 첫번째 숫자와 두번째 숫자 범위 안에 있는 모든 숫자를 더해서 결과값이 나오도록 제작하시오.
 * 단, 해당코드는 do~while으로 작성합니다.
 * 예시)
 * 첫번째 범위 숫자는? 5
 * 두번째 범위 숫자는? 10
 * 범위 숫자 모든 합계는 : 45입니다.
 * */
public class Example3_0527 {

	public static void main(String[] args) {
		String msg="첫번째 범위 숫자는? ";
		System.out.print(msg);
		Scanner Num = new Scanner(System.in);
		int first = Num.nextInt();
		
		String msg2 = "두번째 범위 숫자는? (첫번째 숫자보다 커야 합니다.) ";
		System.out.print(msg2);
		Scanner Num2 = new Scanner(System.in);
		int second = Num2.nextInt();
		
		int total = 0;
		do {
			total+=first;
			first++;
		}while(first<=second);
		System.out.printf("범위 숫자 모든 합계 : %d",total);
		
		Num.close();
		Num2.close();
	}

}
