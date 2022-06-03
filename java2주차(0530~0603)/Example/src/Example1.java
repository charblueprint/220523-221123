/*응용문제 #1 (0603)
 <배열 + 기본(클래스)메소드 문제>
 1차 배열에 다음과 같이 값이 있습니다.
 22 33 44 55 66 77 88 99 
 해당 전체 값을 모두 더한 총 합계 값을 별도의 메소드로 처리되도록 합니다.
 단, 반복문은 무조건 do~while문으로 작성합니다.*/
public class Example1 {

	public static void main(String[] args) {
		int A[] = { 22, 33, 44, 55, 66, 77, 88, 99 }; 
		Example1 P = new Example1();
		P.Plus(A);

	}

	public void Plus(int Result[]) { // void : 객체생성 + 인스턴스 (메모리) 등록
		int total = 0;
		int i = 0;
		do {
			total += Result[i];
			i++;
		} while (i < Result.length);
		System.out.println("총 값 : " + total);
	}

}
