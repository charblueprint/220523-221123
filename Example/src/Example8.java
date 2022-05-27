import java.util.Scanner;

/*응용문제 #8
 * 사용자 패스워드는 a1234입니다.
 * 사용자가 패스워드를 입력합니다. 단, 3회 이상 실패시 다음과 같이 출력 되도록 합니다.
 * "패스워드 횟숫제한으로 가까운 지점에 방문하셔야 합니다."
 * 단, 패스워드가 맞을 경우 "로그인 되었습니다."라고 출력 되어야 합니다.*/
public class Example8 {

	public static void main(String[] args) {
		Scanner correct = new Scanner(System.in);
		System.out.print("패스워드를 입력하세요 >> ");
		String password = correct.next();

		int i = 1;
		while (i <= 3) {
			if (password.equals("a1234")) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.printf("패스워드를 다시 입력해주세요.(%d회 실패하셨습니다.) \n", i);
				password = correct.next();
				i++;
				if (i == 3) {
					System.out.println("패스워드 횟수제한으로 가까운 지점에 방문하셔야 합니다.");
					break;
				}
			}
		}
		correct.close();
	}
}