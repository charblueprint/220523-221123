
public class Over {

	public static void main(String[] args) {
		//pt P = new pt();
		//P.display();
		cd C = new cd();
		C.display("���� ���� �� ���");
		C.display(); //�������̵�
	}
}
/*
�����ε�(overloading) : ���ο� �޼ҵ带 �����ϴ� ���� ���մϴ�.
�������̵�(override) : �θ� Ŭ�������� ��� ���� ���� �޼ҵ带 ����ϴ� ���� ���մϴ�.
*/

class pt{
	public void display(){
		System.out.println("�θ� �ܺ� ���� ��");
	} public void aaaa() { //�׷��� ���⿡�ٰ��� ��� ��.
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
}

class cd extends pt{
	//aaaa() �޼ҵ�� �������̼��� ������� ����. ���� : �θ� Ŭ�������� �������� �ʾ���.
	/*
	@Override //�θ𿡰� ���� �޼ҵ� ����� �������̵� ������ ��������!
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	@Override //�������̼� 
	public void display() { //�������̵� (�θ�Ŭ������ ����ǰ�� �ڽ�Ŭ������ ����ǰ���� �����)
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display(); // �θ𿡴� ���� �Ӽ� �޼ҵ� ���� ������ �� ����մϴ�.
	} public void display(String msg) { //�����ε� (�θ� Ŭ�������� ���� ����ǰ�� �ڽ� Ŭ�������� ����)
		System.out.println(msg);
	}
}