import java.util.Scanner;

public class Class5 {

	public static void main(String... args) {
		Member2.lists2(); // static void ������� �޸� �Ҵ� �Ǿ��־� (Ŭ����.�޼ҵ�)�θ� �����ص� �ȴ�!

		Member2 mb2 = new Member2(); // static ���x ��ü�� �ν��Ͻ��� ����ؾ� �Ѵ�.
		mb2.lists1(); // �ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��.

		Member2 mb3 = new Member2();
		mb3.lists3("������",123456); //
	}

}

class Member2 {

	public void lists1() { // �޸𸮿� ������ �Ҵ����� �ʰ� �޼ҵ� �Լ��� ����
		String a = "ȫ�浿";
		System.out.println(a);
	}

	public static void lists2() { // Static ������ ����. ��� �޸𸮸� �Ҵ���.
		String a = "�̼���"; // lists1�� lists2�� �ٸ� ���̵��̱� ������ �̸��� ���Ƶ� �ȴ�.
		System.out.println(a);
	}

	public static void lists3(String nm,int pw) {
		//nm�� �޼ҵ忡�� ���޹޴� ���� �ٷ� ����� ���(nm.equals("������"))
		String user_name = nm;
		int user_password = pw; //�޼ҵ忡 ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����
	
		if(nm.equals("������") && user_password==123456) {
			System.out.println("ȸ�� Ȯ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("��ȸ�� �Դϴ�.");
		}
	}
	
}
