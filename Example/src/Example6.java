/* 응용문제 #6 (0527)
 * 1~10까지 순차적으로 적용하는 반복문이 있습니다.
 * 단, 1~5까지는 모든 값을 곱하고, 6~10까지는 모든 값을 더합니다.
 * 해당 두개의 값을 비교하여 더한값이 큰지, 곱한값이 큰지를 결과로 출력하시오. */
public class Example6 {

	public static void main(String[] args) {
		int init = 1;
		int first = 1;
		int second = 0; // 구간 정함
		
		while (init <= 10) { //1~10까지 일단 돌림
			if (init <= 5) { //1~5까지는 모든 값을 곱함
				first *= init;
			} else { //6~10까지는 모든 값을 더함
				second += init;
			}
			init++;
		}

		if (first > second) { // 해당 두개의 값을 비교 후 결과 출력
			System.out.print("곱한 값이 큽니다.");
		} else if (first < second) {
			System.out.print("더한 값이 큽니다.");
		} else { // 안 해도 되긴 한데 나중에 수정이나 그런거 감안하면 해두는게 낫지..?
			System.out.println("두 비교값이 같습니다.");
		}

	}

}
