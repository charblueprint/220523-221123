
public class oop3 {
	//Multi Thread(멀티 스레드) : start / run / sleep / setStop
	//멀티 스레드 : CPU의 코어와 연관이 있습니다.
	public static void main(String[] args) {
		//쓰레드(Thread) : 프로세스 내부에서 독립적으로 실행되는 작업을 말함.
		//Multi Thread(멀티 스레드) : 프로세서 내부에서 두 가지 이상의 작업을 동시에 사용
		//Multi thread의 좋은 점 : 한번에 우르르
		//Ex) 쓰레드-> 음악  멀티 쓰레드-> 음악, 유투브, 문서 (멀티테스킹 가능)

	
		Thread my = new mythread(); // 부모 메소드 = 자식 메소드
		//기존사용형태 : 자식메소드 = 자식메소드
		my.start();
		Thread my2 = new mythread2(); //이렇게 다른 메소드에서도 돌릴 수 있음!!
		my2.start(); //Thread 메소드에 기본 run을 작동시키기 위한 start 메소드(함수)입니다.
		
		int ct = 1;
		while(ct<=10) {
			System.out.println("내부 클래스 : " + ct);
			ct++;
		}
		
	}

}
class mythread extends Thread{ 
	//※중요) Thread : JVM 기본으로 탑재 되어있는 메소드(Thread는 단독으로 사용하지 않음) 그리고 생성자명도 Thread로 하면 안됨
	@Override
	public void run() { //run이란 : 멀티메소드 기본 실행 메소드
		int i=1;
		while(i<=10) {
			System.out.println("외부 클래스 : " + i);
			i++;
		}
	}
}

class mythread2 extends Thread{
	@Override
	public void run() {
		int i=1;
		while(i<=10) {
			System.out.println("외부 클래스2 : " + i);
			i++;
		}
	}
}