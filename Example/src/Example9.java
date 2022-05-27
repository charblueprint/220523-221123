import java.util.Scanner;

/*응용문제 #9
 * A학생에 대한 성적을 입력받고 평균 점수가 나오는 프로그램을 제작합니다.
 * "점수를 입력하세요?' 라는 문구는 총  5번이 나오게 되며, 모든 점수는 합산 한 후 5개의 점수에 대한 평균값을 출력
 * 출력 메세지는 "해당 점수의 평점은:" 출력
 * 단, 평점 점수가 40점 이하 일 경우 "재시험입니다."라고 메세지를 
 * 출력후 프로세서는 종료합니다. 40점 이상일 경우 "합격"이라고 메세지를 출력하십시오.
 * do~while문으로 제작 
 * 
 * [추가기획]
 * "입력하실 과목 수를 적어주세요:" 라고 제일 먼저 출력 후
 * 해당 과목 수 만큼 반복문이 적용이 되며, 과목 수 만큼 평균값이 적용 되어야 합니다.
 * */

public class Example9 {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);

		System.out.println("입력하실 과목 수를 적어주세요 : ");
		int subject = grade.nextInt();

		int ownG;
		int i = 1;
		int total = 0;
		do {
			System.out.println("점수를 입력하세요?");
			ownG = grade.nextInt();
			total += ownG;
			i++;
		} while (i <= subject);
		int average = total / subject;
		
		System.out.println("해당 점수의 평점은 : " + average+ "점");
		if (average <= 40) {
			System.out.println("재시험입니다.");
		} else {
			System.out.println("합격");
		}
		
		/* 샘은 이렇게 하심! 되게 간단하네
		 * String msg;
			if (average <= 40) {
				msg = "재시험";
			} else {
				msg = "합격";
			}
			System.out.printf("해당 점수의 평점은 %d점이고, %s입니다.",average,msg);*/
		
		// System.out.println("총 점수는 " + total + "입니다.");
	}

}
