import java.util.Scanner;

/* ���빮��#14
 * ����ڰ� �Է��� ���ڿ� ���缭 �������� �۵��Ǹ�,
 * �����ܰ���� ����Ͽ� ¦������ Ȧ������ ����Ͻÿ�.
 * "�����ܿ� ���� ���ڸ� �Է��ϼ���?" ��� �޼����� ��µǸ� �ش���ڿ� ���缭 ��� ����� ���ϸ�,
 * ���� ���� ���� ¦������ Ȧ�������� ����Ͻø� �˴ϴ�.
 * ��, �ش� �ݺ����� for~do while������ �Ѱ����� �����ؼ� �ۼ��Ͻÿ�.
 * */
public class Example2 {

	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		System.out.print("�����ܿ� ���� ���ڸ� �Է��ϼ���.>> ");
		int Num = multi.nextInt();
		int n, m;
		int total = 0;
		
		for (n = 1; n <= 9; n++) {
			m = Num * n;
			total += m;
		}
		
		if (total % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		

	}

}
