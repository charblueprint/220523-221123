/*0613 ������*/
import java.util.Scanner;

public class oop1 {

	public static void main(String[] args) {
		//��� �޼ҵ� ����
		@SuppressWarnings("unused")
		op_method om = new op_method();
	}

}
/*
��� �޼ҵ� : �޼ҵ带 ���� �Ǵ� �������� ȣ���ϴ� ���μ����� ���մϴ�.
�ݺ���, �ܺ� class�� ������ ������ ������ ���� �ذ��ϱ� ���ؼ�
�����ϴ� �޼ҵ� ���¸� ���մϴ�.
*/
class op_method {
	String msg[] = {"ã�� �̸��� �Է��ϼ���. >> ","ȫ�浿","�ش� �̸��� �����ϴ�."};
	Scanner sc = new Scanner(System.in); 
	// �õ��� �� ��� ����Ǹ� �޸� ���� �������� �׷��ϱ� �ʵ忡 �ѹ� �����Ű�� ��� ������ �Ǵ°���. 
	private String nm;
	public op_method() {
		this.m1(); //�̷��� �ѱ�� ���� ������ m1���� �ѱ�� ����.=> m1 �۵�!
	}
	public void m1() {
		System.out.print(msg[0]);
		 this.nm = sc.nextLine();
		 this.m2(); 
		 //m2���� this.m2();�� m2();�� �Ѱܵ� ��� x
		 // m2();�ε� �ѱ� �� �ִ� ������ ���� Ŭ�����̱� ������
		 //this.__();�� ����ϴ� ��� �ȿ� �� �־ ������ �ȵ�!!
	}
	public void m2() { //m1�� ���� ������� m2�� Ȯ��
		if(this.nm.equals(msg[1])) {
			sc.close(); // �ʿ������ �̷��� ��ĳ�� �����ϸ� �ȴ�.
			System.exit(0);
		} else {
			System.out.println(msg[2]);
			this.m1(); //m1�� �ٽ� �� ȣ��(��͸޼ҵ�)
		}
	}
}