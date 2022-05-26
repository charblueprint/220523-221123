package Javaclass;
public class Var {

	public static void main(String[] args) {
		//변수는 지속적으로 변하는 수 (수학의 그 '변수'랑 똑같이 생각)
		/*
		 *1. 선언 방식 - 변수만 선언
		 *String : 문자 자료형 - 그 다음 파일 참조
		 *char/int/double/float/boolean/long/short/byte 등등 - 얘네는 자료형들! 
		 */
		String a1 = "홍길동입니다"; // a1은 변수명을 지정한거임.
		// A=B 는 B의 값을 A로 넘긴다는 의미이고, A==B가 A와 B가 서로 동일하다는 의미
		System.out.println(a1);
		 //변수명을 만든 후 값을 지정하여 넘겨주는 형태
		/*
		 * 2. 변수+값을 같이 선언하는 방식
		 */
		String b1 = "이순신입니다.";
		System.out.println(b1);
		
		/* 변수 확인 사항 */
		a1 = "이순신입니다."; // 기존에 가지고 있는 데이터는 삭제되고, 새로운 값으로 재설정됨
		System.out.println(a1);

	}

}
