//Thread ��� ���
//������ ������� ä�� ���α׷��� ����� ������ ������ �����ϸ� �λ�� �� ������ ����Ǵµ� �� thread�� �̿��� ����� �� ����� �����ص� �ٸ� �� ����� ������� ����
//�ٵ� ī����....�� �ٸ� �������� ä�ù��� ���� ������ ���� �� �� �ִٴ� ������ ��Ƽ Thread�� ���ư��ٴ°ǰ�?
public class Thread1 {

	public static void main(String[] args) {
		/* ���(Extends�� �̿�!) */
		int w = 0;
		while (w < 6) { // Thread�� 5�� ����
//			box b = new box(w);
//			Thread t = new Thread(b);
//			t.start();
			w++;
		}

		/* interface�� �̿��Ͽ� implement�� Runnable�̶�� Ŭ������ ���� �ߵ��ȴ�. */
		for (int f = 0; f < 10; f++) { //Thread �޼ҵ带 ȣ���Ͽ� �ش� Ŭ������ CPU �Ѱ��� �Ҵ��մϴ�.
			box2 b2 = new box2(f);
			Thread t2 = new Thread(b2); //Thread ���� (Thread�� �۵���ų Ŭ������)
			t2.start(); //run�޼ҵ带 �۵���Ű�� ���� ���� 
		}

//		box3 b3 = new box3();
//		Thread t3 = new Thread(b3);
//		t3.start();
	}

}

class box extends Thread {
	int no = 0;

	public box(int a) {
		// Thread�� setter������ �̷����·� ����Ѵ�
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
// Stop()�̶�� Runnable�� ��ӹ޴� �⺻ Ŭ������ �ֱ� �ϳ� �ش� �����带 ������ ������Ű�� ������ ���� �Ŷ� �� �Ⱦ���!
	int no = 0;
	public box2(int b) {
		this.no = b;
	}
	@Override
	public void run() { // Thread�� �⺻ �޼ҵ�
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