
public class oop5 {
	//abstract ���� �⺻���� �μ������� �߻� �޼ҵ�� ���� �ѱ�
	public static void main(String[] args) {
		load1 l1 = new load1();
		load2 l2 = new load2();
		l1.datain(20, 30);
		l1.call();
		l2.datain(20, 30);
		l2.call();

	}
}
abstract class abclass {
	int data1, data2;

	public void datain(int d1, int d2) { // �⺻ �߻� �޼ҵ��̸�, ��� �����͸� �μ��� �޾Ƽ� this ó��
		// ��, �ܺ� Ŭ���������� �������� ����
		this.data1 = d1;
		this.data2 = d2;
	}

	public abstract void Cal(); // ������ class �⺻���� Cal �޼ҵ�� ������ ������.
	public void call() {
		this.Cal();
	}
}
class load1 extends abclass {
	@Override
	public void Cal() {
		int sum = this.data1 + this.data2;
		System.out.println(sum);
	}
	public void avg() {
		System.out.println("ȫ�浿");
	}
	public void call() {
		this.Cal();
		this.avg(); // �̰͵� �´µ�!!
	}
}
class load2 extends abclass {

	@Override
	public void Cal() {
		int sum = this.data1 * this.data2;
		System.out.println(sum);
		this.avg(); // �̰� �ι� ����
	}
	public void avg() {
		System.out.println("ȫ�浿");
	}
}