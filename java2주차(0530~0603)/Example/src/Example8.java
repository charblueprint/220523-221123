import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*#8
 다음은 사용자가 복권 관련 프로그램을 요청하였습니다.
 사용자가 총 5개의 숫자를 입력하게 됩니다.
 "1~46번 사이의 숫자를 입력해 주세요 >>"
 사용자가 입력한 5개의 숫자를 배열로 생성합니다.<<이것은 main 메소드에서 처리
 
 외부 class를 이용하여 pc가 직접 당첨 번호 5개가 랜덤하게 뽑아냅니다.
 PC가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 class method로 생성)
 
 별도의 결과 method를 하나 더 생성하여 
 사용자가 입력한 5개의 배열데이터와 PC가 뽑은 배열 데이터를
 해당 method로 전달하여,출력하시면 됩니다.
 
 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성합니다.
*/
public class Example8 {

	public static void main(String[] args) { // 사용자
		Scanner lotto = new Scanner(System.in);
		int N = 0;
		String choose[] = new String[5];//
		do {
			System.out.printf("1~46번 사이의 숫자를 입력해 주세요(%s번째 숫자 입력) >> ", N);
			choose[N] = lotto.next();
			N++;
		} while (N <= 4);

		Number A = new Number();
		A.rd(choose);
		A = null;
		lotto.close();

	}

}

class Number {
	public void rd(String Nums[]) {// Pc
		int P[] = new int[5];
		Random PC = new Random();
		int i = 0;
		do {
			P[i] = PC.nextInt(45) + 1;
			i++;
		} while (i < 5);
		B(Nums, P);

	}

	public static void B(String Nums1[], int Nums2[]) {
		System.out.println(Arrays.toString(Nums1) + "\n" + Arrays.toString(Nums2));
	}
}
