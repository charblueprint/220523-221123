
public class oop6 {

	public static void main(String[] args) {
		// �迭 ������ ������ ��ü �߻�Ŭ���� �����
		box[] b = {new Abox(), new Abox2(), new Abox3()}; //�̷� ����� abstract���� �Ϲ��� ��쿡�� �����ִ�
		/*
		b[0].dataload();
		b[1].dataload(); */
		/*for(box z : b) { //�̰� �迭�� �� �����ڴٴ� �ǹ�
			z.dataload();
		} => for each�� ���� : Ư�� class�� ��� �����ϰų� �۵����� ����*/
		int w=0;
		while (w<b.length) {
			if(w!=1) { // �ε��� 1�� Ŭ������ ������� ����
				b[w].dataload();
			} w++;
		}
		
	}
}
abstract class box {
	public abstract void dataload();
}
class Abox extends box{
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}
class Abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}
class Abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("test3");
	}
	
}