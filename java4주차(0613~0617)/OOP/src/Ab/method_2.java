package Ab;

/* <abstract�� interface�� ������ �� ������>
������ : abstract�� interface�� ��� static�� ����� �� ����
������ : 
1.abstract�� default�� ������� ����(public�� ����) -> �ʵ忡 �ڷ����� ������ �� ����
2.interface�� interface���� default�� �����ϸ� ����޼ҵ带 ����� -> �ʵ忡 �ڷ����� ������ �� ����
��� : abstract�� Ŭ������ interface�� �޼ҵ��
*/
public class method_2 {
//method_2inter.java & method_2inter2.java ����
	public static void main(String[] args) {
		loadinter Li = new loadinter();
		Li.setbox("ȫ�浿");
	}
}

//�߿� : abstract�� interface�� ��� static�� ����� �� ����
abstract class test{	// abstract�� default�� ������� ����(public�� ����)
	//�ʵ忡 �ڷ����� ������ �� ����
	public String nn;
	public abstract void box();
	public void box3(String n) {
		this.nn = n;
		System.out.println("test");
	}
	
}
class loadinter implements method_2re, method_2inter2 { // ���� ��� 
	// implements�� CJ �������� ���̴���.. ��¥ ��Ը� ������Ʈ����!
	@Override
	public String names() {
		return null;
	}
}
