package Classtime;
import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� >> ");
		String id = sc.next();
		//System.out.print(id);
		if (id.equals("kim")) {
			// ���ڿ� ���´� scanner �̿�� equals��� �Լ��� ����մϴ�.
			System.out.println("ȸ���� Ȯ�εǾ����ϴ�.");
		} 
		else {
			System.out.println("Ȯ�ε��� �ʽ��ϴ�.");
		}
	sc.close();
	}
	

}