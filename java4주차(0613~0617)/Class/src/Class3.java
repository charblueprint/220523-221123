

public class Class3 {

	public static void main(String[] args) {
		mama Ma = new mama();
		Ma.f_method("������");
		
		mama.cafe CAFE = Ma.new cafe(); 
		CAFE.call();
	}

}
abstract class father{ //�߻�Ŭ���� (abstract�� �̿��ϸ� �߻�)
	public abstract void f_method(String name); // �߻�޼ҵ�
	public String x_man; // ���� ���� ���� (abstract�� �����Ƿ� �߻��� �ƴ�)
}
class mama extends father{
	@Override
	public void f_method(String name) { //�߻� �޼ҵ带 ���� �޼ҵ�� ��ȯ
		this.x_man = name; // �߻� �޼ҵ忡 �ִ� ���� ������ ���� �̰���
	} class cafe{
		String msg = mama.this.x_man; //�θ� Ŭ������ �ִ� ���� ������ �ڽ�Ŭ���� ���� ������ �̰�
		public void call() {
			String msg2 = this.msg + "�� ¯!!";
			System.out.println(msg2);
		}
	}
	
}