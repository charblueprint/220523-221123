package Classtime;

public class While1 {

	public static void main(String[] args) {
		int a = 1; //while문 시작값
		while (a < 11) { // while 범위값, 종료값
			//System.out.print(a + ",");
			a++; //증가 or 감소
		}
		
		int b = 10;
		while(b > 4) {
			//System.out.print(b +",");
			b--;
		}
		
		int aa = 1;		//초기값
		int bb = 10;	//종료값
		while(aa <= bb) {	//반복문 범위
			System.out.printf("%d ",aa);
			aa++;	//증가
		}
	
	
	}
	

}
