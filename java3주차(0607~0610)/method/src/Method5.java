
public class Method5 {

	public static void main(String[] args) {
		cdb c = new cdb ();
		/*
		c.d1 = "ȫ�浿";
		c.data2();
		c.d3 = "�̼���";
		c.data1();
		c.d3 = "������";
		System.out.println(c.data3());
		*/
		//c.d2 = "������"; /*private���� ������ ��ü �̹Ƿ� main class���� �ε� ����*/
		c.data2("������");
		//cdb.data1(); /
		String result = c.data3();
		System.out.println(result);
	}

}
class cdb {
	String d1 = null; /*void, �ڷ��� �޼ҵ� �ε� ����*/
	private String d2 = null; //�� �״�� ������ �ڽ�. �ش� Ŭ���� �������� ���̴� ��
	public static String d3; /*�� ��밡��*/
	
	public static void data1() {//static ���� �׳� ������ ����ϱ�� ����.
		//System.out.println(d3);
		//System.out.println(this.d2); /* static �ڷ��� �ܿ��� �ε尡 �Ұ�����. private��� ���� �Ұ� */
	}
	public void data2(String user) {
		this.d2 = user;
		System.out.println(this.d2);
	}
	public String data3() {
		String a = this.d2; //int �� �� �ƹ��͵� �� �ְ� �ڵ� �ۼ��Ϸ��� ""ĭ�� 0 �ֱ�
		return a;
	}
	
}