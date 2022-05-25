package Classtime;

public class For1 {

	public static void main(String[] args) {
		//반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법 - 게시판, 메일등지에 쓰임
		//int z = 1;
		//z++; : 출력 후 +1
		//z--; : 출력 후 -1
		//++z; : +1 후 출력 
		//--z; : -1 후 출력
		//System.out.println(z);
		//for(초기값; 범위값; 증감여부)
		//for(int a=0; a<10; a++) {
			//System.out.print(a);
			//System.out.print(" ");
		//}
		
		int b;
		for(b=5; b<=10; b++) {
			//System.out.print(b);
			//System.out.print(" ");
		}
		
		int c;
		for(c=10; c>3; c--) { // 게시판을 이렇게 만듦
			System.out.println(c);
		}
		//c<3이라고 작성하면 0~음수까지 전부 찍혀버리는 상황 발생.. 
		//이걸 우린 무한루프라고 하지요 저번에 원우 예시 만들었을때 당한 거
		
		/*1~10까지 숫자 출력*/
		int aa;
		int bb=10;
		for(aa=1;aa<=bb;aa++) {
			System.out.println(aa+" ");
		}
	}

}
