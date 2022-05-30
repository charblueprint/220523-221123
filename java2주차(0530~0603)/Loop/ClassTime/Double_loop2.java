package ClassTime;

public class Double_loop2 {

	public static void main(String[] args) {
		// while
		int w = 1;
		//이렇게 int ww=1;가 밖에 있으면
		while (w <= 3) {
			int ww = 1;//그래서 이렇게 안에다가 넣어주어야 함.
			/*
			 * 작은 while문의 초기값 을 큰 반복문안에 적용 
			 * 큰 while문이 한번 도는동안 작은 while문도 한번 도는데,
			 * 얘가 한번끝나고 다시 큰 while문을 다시 돌아야 하는데,
			 * 9번째 줄로 다시 돌아가는 거지 바로 윗줄에 값을 정한건 안본단 말임..
			 * 그러니 작은 while문은 안 돌아감(10번째 줄 보기)
			 */
			while (ww <= 4) {
				System.out.println(w + "+" + ww);
				w++;
			}
			w++;
		}

		// do while
		int dw = 1;
		do {
			//do while문 또한 while문 같이 초기값을 큰 반복문안에 설정
			int ddw = 1;
			do {
				ddw++;
			} while (ddw <= 4);//작은 반복문 범위
			dw++;
		} while (dw <= 3);//큰 반복문 범위

	}

}
