import java.util.Random;
import java.util.Scanner;

public class Class_Array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10까지 숫자를 하나 입력하세요.");
		int no = sc.nextInt();
		memorys m = new memorys(); // 이 줄의 의미는 일단 여기다 다 데이터를 저장하고 보자 이거임. 근데 메모리가 엄청 차서... 고쳐야겠지?
	
		/*
		memorys m =null;
		m = new memorys();
		*/
		//m.ms();
		m=null; //m의 메모리를 날림! 아예 날려져 있는 상태임// 해당인스턵스를 비움

		m = new memorys();
		m.rd();
	}

}

class memorys{
	public void ms(int user) {
		//Math.random() 랜덤 메소드 사용법  기본은 자료형 double입니다.
		
		//random=> 인증번호, 보안코드, 로또, 로그인, 추첨 등등
		double a = Math.random(); //0.0~1.0 
		int b = (int)(Math.random()*9)+1; //기본(*10) : 0~9 , *10+1 : 1~10 
		// double-> int 변경
		int i = 0;
		while(i<=10) {
			//System.out.printf("%d",b);
			i++;
		}
		
		/*
		 * if(user==b) { //복권을 생각해 봅시다.
			System.out.println("당첨!");
		} else {
			System.out.println("다음기회에");
		}
		 * */

	public void rd() {
		Random r= new Random();	//Random 객체 생성 및 인스턴스 적용
		int i = 0;
		while(i<=6) {
			System.out.println(r.nextInt(45)+1); //0~9까지 r.nextInt()를 사용법
			i++;
		}
		//r=null; //반복문에서는 넣음 안된다!
		
	}
}