import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner inform = new Scanner(System.in);
		System.out.print("�ּҸ� �Է��ϼ���>> ");
		String address = inform.nextLine();
		String realaddress= address.replace(" ", " ");
		
		Scanner inform2 = new Scanner(System.in);
		System.out.print("��ȭ��ȣ�� �Է��ϼ���(-���� �Է�)>> ");
		String phone = inform2.next();
		String realphone = phone.replace("-", "-");
		
		System.out.print("\n[�ش������� Ȯ���� �ּ���]\n"+"�ּ�:"+realaddress);
		System.out.printf("\n��ȭ��ȣ:%s",realphone);
		inform.close();
		inform2.close();
	}

}
