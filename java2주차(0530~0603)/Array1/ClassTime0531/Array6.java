/*응용문제 #1 (0531)
 * 다음중 장바구니에 여러개의 상품이 담겨져 있습니다.
 * 그중 택배비가 별도로 측정되는 금액만 추출하시오.
 * 택배비는 30000 만원 이상(포함)
 * 15000 48000 67000 8000 118200 49800 6000 18700
 * 출력결과 ) [48000, 67000, 118200, 49800]*/
package ClassTime0531;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		int wish[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };// 주어진 데이터
		int Z = wish.length;// wish 데이터의 크기
		int i = 0;// wish 데이터배열의 증가 값 처음에는 0번

		int[] Buy = new int[4]; // 새로 만들 배열 생성. 아직은 빈 상태.
		int Y = Buy.length;// Buy 데이터의 크기
		int j = 0;// Buy 데이터 배열의 증가값

		do {
			if (wish[i] >= 30000 && j < Y) {
				Buy[j] = wish[i]  ;
				j++;
			}
			i++;
		} while (i < Z);
		System.out.println(Arrays.toString(Buy));
		
	}

}
