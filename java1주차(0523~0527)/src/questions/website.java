package questions;
/* 응용문제2(22.05.23)
 * 
 * 아마존 사이트에서 상품을 구매 했습니다.
 * 장바구니 담은 상품 가격을 모두 더해서 총 결제 금액이 출력되도록 하시오.
 * 단 $환율로 출력 되어야 합니다.
 * 8.25
 * 4.02
 * 3.71
 * 결과 값은 다음과 같이 출력하세요.
 * 총 결제금액 $  입니다.
 */
public class website {
	//나는 이렇게 함.
	public static void main(String[] args) {
		double a = 8.25;
		double b = 4.02;
		double c = 3.71;
		System.out.println("총 결제금액 $"+(a+b+c)+" 입니다.");
		
		//근데 이렇게도 할 수 있음.
		double p1,p2,p3,p4;
		p1=8.25;
		p2=4.02;
		p3=3.71;
		p4=p1+p2+p3;
		System.out.println("총 결제금액 $"+ p4 +" 입니다.");
		
	}

}
