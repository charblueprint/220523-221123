package Classtime;

public class If3 {

	public static void main(String[] args) {
		
		/*�ڷ���2
		 *boolean : true, false�� �����ϰ� �˴ϴ�.
		 */
		boolean ws = true;
		if (ws==true) {
			System.out.println("ȸ�������� ����˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž߸� ����˴ϴ�.");
		}
		
		String userid = "park";
		String password = "a1234";
		
		// &&(and) : �Ѱ��� ���� �̻� ��� ���� ���
		// ||(or) : �Ѱ��� ���� �̻󿡼� �Ѱ��� ���� ���
		if ((userid=="park") && (password=="a1234")) {
			System.out.println("�α��� �ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���.");
		}
		
		if ((userid=="park") || (userid =="kim")) { 
			// �α��� ���������� &&�� ||�� ǥ������ �ʱ� �ٶ�
			// if ((userid=="park") || (password =="a1234")) { ����
			// �� ���� �߿� �� �����ε� ���� ��� �׳� �ٷ� �Ѿ���� �׷��� �շ�����
			System.out.println("ȸ���� Ȯ�� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("Ȯ�ε� ���̵� �����ϴ�.");
		}
		
		
	}

}
