//Thread 사용 방식
//기존의 방식으로 채팅 프로그램을 만들면 상대방이 소켓을 종료하면 두사람 다 소켓이 종료되는데 이 thread를 이용해 만들면 한 사람이 종료해도 다른 한 사람은 종료되지 않음
//근데 카톡은....아 다른 사람들과의 채팅방을 따로 여러개 개설 할 수 있다는 점에서 멀티 Thread가 돌아간다는건가?
public class Thread1 {

	public static void main(String[] args) {
		/* 상속(Extends를 이용!) */
		int w = 0;
		while (w < 6) { // Thread를 5개 돌림
//			box b = new box(w);
//			Thread t = new Thread(b);
//			t.start();
			w++;
		}

		/* interface를 이용하여 implement시 Runnable이라는 클래스가 같이 발동된다. */
		for (int f = 0; f < 10; f++) { //Thread 메소드를 호출하여 해당 클래스에 CPU 한개를 할당합니다.
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2); //Thread 선언 (Thread로 작동시킬 클래스명)
			t2.start(); //run메소드를 작동시키기 위한 명렁어 
		}

//		box3 b3 = new box3();
//		Thread t3 = new Thread(b3);
//		t3.start();
	}

}

class box extends Thread {
	int no = 0;

	public box(int a) {
		// Thread에 setter쓰려면 이런형태로 써야한다
		this.no = a;

	}

	@Override
	public void run() {
//		super.run();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {	}
		System.out.println(this.no);
	}
}

class box2 implements Runnable {
// Stop()이라는 Runnable을 상속받는 기본 클래스가 있긴 하나 해당 쓰레드를 강제로 정지시키고 싶을때 쓰는 거라 잘 안쓴다!
	int no = 0;
	public box2(int b) {
		this.no = b;
	}
	@Override
	public void run() { // Thread의 기본 메소드
		try {
			Thread.sleep(1000);
		} catch (Exception e) {	}
		System.out.println(this.no);
	}
}

class box3 implements Runnable {

	@Override
	public void run() {
		System.out.println("test");
	}
}