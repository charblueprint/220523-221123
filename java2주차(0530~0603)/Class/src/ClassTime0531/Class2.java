package ClassTime0531;

public class Class2 {
	// package�� ������� ����(default��)
	public static void main(String[] args) {
		// ������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���޹ޱ�
		// inject a = new inject();
		// inject.oksign("ȫ�浿"); //���� �⺻�� �Ǵ� �Լ� ��, static void ����
		members.user("�̼���"); // ��ȣ �ȿ� �ִ� ������ (���ڰ�) "�̼���"�� ���ڰ��̶��!
		members.cal(5, 12); //member Ŭ���� �ȿ� cal ��� �Ϲ��Լ��� a�� b ���ڰ��� ����
	}
}

class inject {
	// public static void : ���� �⺻�� �Ǵ� �Ϲ��Լ��� ���մϴ�.
	public static void oksign() {
		String user = "ȫ�浿";
		System.out.println(user);
	}

	public static void test() {
		int aa = 1;
		int bb = 3;
		int cc = aa + bb;
		System.out.println(cc);
	}
}

class members {
	public static void user(String names) {
		String msg = names + "�� ȯ���մϴ�.";
		System.out.println(msg);
	}
	public static void cal(int a, int b) { //��� 2���� ���ڸ� ����
		//(�ڷ��� �̸�, �ڷ��� �̸�) : ���ڰ� 2���� ����
		int c = a*b;
		System.out.println(c);
		
	}

}
