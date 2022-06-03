/* #3
  <배열 + 기본(클래스) 메소드 문제>
  product : 수박, 참외, 사과, 배, 딸기, 키위, 바나나, 망고
  moneys : 35000,8000 4000 5500 3800 4400 11000 18900
  장바구니에 해당 상품을 모두 담았습니다.
  단,그중 사과와 바나나는 제외하고 총 결제 금액을 출력하시오.
 
 */
public class example3 {

	public static void main(String[] args) {
		String product[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		int money[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		example3 basket = new example3();
		basket.Cal(product,money);
		
	}
	
	public void Cal(String P[],int M[]) {
		int A = P.length;
		int i = 0;
		int total = 0;
		
		do {
			if (!P[i].equals("사과") && !P[i].equals("바나나")) {
				total+=M[i];
			}
			i++;
		}while (i<A);//크게 도는중
		System.out.println("총 결제 금액 : " + (total) + "원");
	}
}

