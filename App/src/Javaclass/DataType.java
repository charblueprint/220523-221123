package Javaclass;

public class DataType {

	public static void main(String[] args) {
		String a = "1234";
		//String : ""를 써야 비로소 문자로 인식. 그러니까 문자로 인식하게 하려면 "문자" 이렇게 써야함.
		System.out.println(a);
		
		/* 정수형 */
		byte b = 100;  // byte : 범위=(-128~+127)
		System.out.println(b);
		
		short c = 30000; // short : 범위=(-32,768~+32,767)
		System.out.println(c);
		
		int d = 1; // int : 범위=(-2,147,483,638~+2,147,483,647)
		System.out.println(d);
		
		long f = 99999999999L;
		/* long에 대해서 말하자면
		 * 얘가 자료형 중에 가장 큰 단위임.. 
		 * 왜냐면 범위가 -9,223,372,036,854,775,808~+9,223,372,036,854,775,807 거든.
		 * 그래서 주로 통계에서 쓰인다고 함.
		 * 그리고 기본 메모리 할당에서 추가 적용시 가능 범위가 늘어남.
		 * 추가로 저거처럼 L 붙이면 메모리 용량 더 크게 가능! int의 4배 이상이라고 하심.
		 */
		System.out.println(f);
	
		/* 실수형 */
		float x = 3.5f; 
		/* float : -3.402932347e+38 ~ +3.40292347e+38
		 * 실수 뒤에 f는 '무조건' 붙여야함
		 * 소수점 적게 나올거갑다 싶으면 float 쓰고
		 */
		System.out.println(x);
		
		double y = 44.5; 
		/* double : -1.797693...+308 ~ 1.797693...+308 
		 * d 붙이던 말던 상관없음
		 * 소수점 많이 나올거 갑다 싶음 double 사용하기
		 */
		System.out.println(y);
	}

}
