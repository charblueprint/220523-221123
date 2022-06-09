import java.util.Scanner;

/*응용문제#1(0609)*/
/*[up&down게임]
1.PC가 숫자를 하나 선택 random 사용 1~10까지
2.총 기회는 X번 남았습니다.1~10까지 번호중 하나의 번호를 입력?
3.만약 PC가 7을 뽑았을때, 이것과 사용자가 입력한 숫자와 비교
PC :7 , 사용자 : 2=> 결과 : "UP"만 출력
4.총 기회는 X번 남았습니다.1~10까지 번호중 하나의 번호를 입력?
PC :7 , 사용자 : 2=> 결과 : "UP"만 출력
5.이렇게 5번을 반복
6.둘이 동일할 시 결과는 "정답입니다."후 모든 프로세서는 정지

A파트 : PC random,Scanner X5 
B파트 : PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리
 */
public class Example1 {

	// 랜덤으로 숫자 하나 뽑음
	public static void main(String[] args) {
		String msg[] = { "1~10까지 번호중 하나의 번호를 입력하세요 >> ", "UP!", "DOWN!","정답입니다!!", "시스템을 종료합니다." };
		Scanner sc = new Scanner(System.in);
		int PC_pick = (int) (Math.random() * 10 + 1);

		int count = 5;
		while (count >= 1) {
			System.out.printf("총 기회는 %d번 남았습니다."+ msg[0], count);
			int Choose = sc.nextInt();
			Example2 E2 = new Example2();
			E2.User(Choose, PC_pick);
			
			String answer = E2.PC(); // 정한 숫자만 받음. //여기까진 잘 나옴
			if (answer.equals(msg[3])) {
				System.out.printf("%s\n%s", answer, msg[4]);
				System.exit(0);
			} else if(answer.equals(msg[1])){
				System.out.println(answer);
				count--;
			} else if(answer.equals(msg[2])) {
				System.out.println(answer);
				count--;
			}

		}
	}

}
