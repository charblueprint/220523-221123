
public class Method2 {

	public static void main(String[] args) {
		/*
		 * (default package) ���� �ش� class���� ȣ���ϸ� �� 
		 * ��, package�� ���� ���� ���� ���� ��ܿ� package�� �����ؾ���
		 tests ts = new tests(); 
		 ts.a2++; 
		 System.out.println(ts.a2);
		 */
		info i = new info();
		// System.out.println(i.data1(20));
		// System.out.println(i.data2(20));

		/* �̰� �� �� */ // public int data3(int A) �� ����
		System.out.println(i.data3(20));
		String result = i.data4("ȫ�浿");
		System.out.println(result);
		/*Data4 �޼ҵ� RESULT ���� Result ������ �޾Ƽ� ó��*/
	}

}

class info {
	/* static �Ǵ� void�޼ҵ忡�� return�̶�� ��ɾ ������� ���� */
	public static void data1(int A) {
		int z = A + 20;
		System.out.println(z);
		// return z; <- �̷��� ����� �鳯 õ�� �ȵ�
	}

	public void data2(int A) {
		int z = A + 20;
		System.out.println(z);
		// return z; <- 2222
	}

	public int data3(int A) {
		/* �ڷ����� �޼ҵ��� ���ϸ�, ������ return ��� �ؾ��մϴ�. ��, sysout�� ������� ���մϴ�. */
		int z = A + 20;
		return z;
	}

	public String data4(String A) {
		String z = A + "�� ȯ���մϴ�.";
		return z; //�� ������ �ǹ̰� ���ٰ�
	}
}
