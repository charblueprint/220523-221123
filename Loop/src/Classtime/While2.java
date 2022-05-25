package Classtime;

public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c ;
		while (a<=9) {
			c=b*a; //산술연산
			System.out.println(c + " ");
			a++; 
			/*위치에 따라 값이 달라짐;; 
			c=b*a; 보다 위에 있으면 
			9까지의 a값이 a가 아니라 a++를 대입하고 계산한다 생각하면 됨.
			위치조심....!
			*/
		}
	}

}
