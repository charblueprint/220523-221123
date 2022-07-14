
public class thread2 {
//thread는 순차적으로 결과값이 절대 안 나옴
	public static void main(String[] args) {
		/*응용문제 
		 Thread를 이용하여 각 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는 응용프로그램을 제작하시오*/
		int data[] = {6,9,10,15,3,17};
		/*힌트 : 6이라는 배열 값이 인수 값으로 thread에 전달, 6+5+4+3+2+1 최종 결과값만 출력 => 21*/
		Box B2 = null;
		int i;
		for(i=0;i<data.length; i++) {
			B2 = new Box(data[i]);
			B2.start();
		}
	}
}
class Box extends Thread{
	int num = 0;
	public Box(int N) { //Thread에서 값을 사용하기 위한 기본 메소드를 사용함
		this.num = N;
	}
	@Override
	public void run() { //run 메소드는 절대 인수값을 못 받음
		int j = this.num; 
		int total = 0;
		while (j > 0) {
			total += j;
			j--;
		}
		System.out.printf("총 합은 %d입니다.\n",total);
	
	}
	
	
}