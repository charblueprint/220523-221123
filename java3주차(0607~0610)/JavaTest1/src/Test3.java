import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("60������ ���ڸ� �Է��ϼ���. >> ");
		int user = sc.nextInt();
		
		String msg = "�ش� ���ڴ� ";
		
		if(user>60) {
			System.out.println("�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�.");
		} else  {
			if(user%2==0) {
				System.out.println(msg+"¦���Դϴ�.");
			} else {
				System.out.println(msg+"Ȧ���Դϴ�.");
			}
		}
		sc.close();
	}

}
