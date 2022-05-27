import java.util.Scanner;

/*
 * 응용문제 #10
 * 다음 이용약관에 대한 동의 프로그램을 제작하게 됩니다.
 * 동의 항목은 3가지 입니다.
 * 모두 true가 적용 되어야만 다음 프로세서로 진행이 됩니다.
 * 사용자에게 질문되는 사항은 다음과 같습니다.
 * "동의항목에 동의하시겠습니까?" 라는 메세지 출력 동의함 (1), 동의안함(2)
 * 
 * 동의항목중 한가지라도 동의하지 않을 경우
 * "모두 동의 하셔야만 진행됩니다. " 라고 출력합니다.
 * 모두 동의 하였을 경우
 * "회원가입이 완료 되었습니다." 라고 출력합니다.
 * */
public class Example10 {

	public static void main(String[] args) {
		Scanner agreement = new Scanner(System.in);
		int answer;
		boolean yes = false;
		int l = 1;//이걸 횟수라고 생각했고
		do {
			System.out.println(l + "번 동의항목에 동의하시겠습니까?");
			System.out.println("동의함 (1), 동의 안함 (2)");
			answer = agreement.nextInt(); 
			//내가 여기서 망설였던 게 어떻게 동의했음을 표현하지? 였던거임.
			if (answer == 1) { //근데 샘은 애초에 대답을 1이지 않으면 넘어가지 않게 만들어두었음
				yes = true;
			} else { //그래서 여기서 2를 입력해 버리면
				yes = false;
				break;//안넘어감;
			}
			l++;
		} while (l <= 3);

		String msg;
		if (yes == false) {
			msg = "모두 동의 하셔야만 진행됩니다.";
		} else {
			msg = "회원가입이 완료 되었습니다.";
		}

	}

}
