
public class oop3 {
	//Multi Thread(��Ƽ ������) : start / run / sleep / setStop
	//��Ƽ ������ : CPU�� �ھ�� ������ �ֽ��ϴ�.
	public static void main(String[] args) {
		//������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����.
		//Multi Thread(��Ƽ ������) : ���μ��� ���ο��� �� ���� �̻��� �۾��� ���ÿ� ���
		//Multi thread�� ���� �� : �ѹ��� �츣��
		//Ex) ������-> ����  ��Ƽ ������-> ����, ������, ���� (��Ƽ�׽�ŷ ����)

	
		Thread my = new mythread(); // �θ� �޼ҵ� = �ڽ� �޼ҵ�
		//����������� : �ڽĸ޼ҵ� = �ڽĸ޼ҵ�
		my.start();
		Thread my2 = new mythread2(); //�̷��� �ٸ� �޼ҵ忡���� ���� �� ����!!
		my2.start(); //Thread �޼ҵ忡 �⺻ run�� �۵���Ű�� ���� start �޼ҵ�(�Լ�)�Դϴ�.
		
		int ct = 1;
		while(ct<=10) {
			System.out.println("���� Ŭ���� : " + ct);
			ct++;
		}
		
	}

}
class mythread extends Thread{ 
	//���߿�) Thread : JVM �⺻���� ž�� �Ǿ��ִ� �޼ҵ�(Thread�� �ܵ����� ������� ����) �׸��� �����ڸ� Thread�� �ϸ� �ȵ�
	@Override
	public void run() { //run�̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		int i=1;
		while(i<=10) {
			System.out.println("�ܺ� Ŭ���� : " + i);
			i++;
		}
	}
}

class mythread2 extends Thread{
	@Override
	public void run() {
		int i=1;
		while(i<=10) {
			System.out.println("�ܺ� Ŭ����2 : " + i);
			i++;
		}
	}
}