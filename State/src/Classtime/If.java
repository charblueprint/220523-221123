package Classtime ;
public class If {

	public static void main(String[] args) {
		byte a = 100;
		byte b = 100;
		
		// 조건문 (if~else)
		if(a > b) { // if문 
			System.out.println("a의 값이 더 큽니다.");
		}
		else if(a < b) { // else if문
			System.out.println("b의 값이 더 큽니다.");
		}
		else { // else 문
			System.out.println("두 값이 같습니다.");
		}
		
		//else문에도 조건을 붙여보자 그럼 else if문이 된다.
		/* else 문이 없는 경우*/
		if (a > b) {
			System.out.println("a의 값이 더 큽니다");
		}
		else if(a < b) { 
			System.out.println("b의 값이 더 큽니다.");
		}
		else if(a == b) { 
			System.out.println("두 값이 같습니다.");
		}
		/* 부등호 기호 : < , > , <= , >= , == */
	}

}
