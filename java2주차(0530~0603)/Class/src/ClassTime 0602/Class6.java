import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		int num = 3;
		Data_list Da = new Data_list();
		//Da.array_data(num);

		//String pay = "�ſ�ī��";
		String pay = "������";
		if (pay.equals("�ſ�ī��")) {
			Da.pay1(); // �ش����ǿ� �´� �޼ҵ带 ȣ��
		} else {
			Da.pay2(pay);// �޼ҵ忡 ��ü���� �¿��� ����(��ü���� ���Ѵ�)
		}
		
		
		
		
	}

}

class Data_list { 
	/*static �޼ҵ带 Ȱ���ϴ� ���� : 
	 * ���� package���� �ش� �޼ҵ带 ���� ����ؾ��ϴ� �κп����� static�� �̿��Ͽ� ����մϴ�.
	 * static(���� �޼ҵ�) : ���� ���̵��� ����� �� ����
	 * void�� ���(���� �޼ҵ�) : ���� ���̵� ��� ����
	 * �������̵� ����
	 class a {
	 	void method
	 }
	 class b extend a {
	 	void method
	 } 
	 */
	//+) �޸� ������ �ʹ� ���� = static�� �����ؼ� �޸𸮰� ��������. �׷��� ���� ����ϵ��� ����.
	public void array_data(int A) { // static���� �޼ҵ�
		int i = 1;
		while (i <= 9) {
			System.out.println(A * i + "\n");
			i++;
		}
	}

	public void pay1() {
		System.out.println("�ſ�ī��� ���� �����մϴ�.");
	}

	public void pay2(String pm) {
		System.out.println(pm + "���� ���� �����մϴ�.");
	}

	
}

