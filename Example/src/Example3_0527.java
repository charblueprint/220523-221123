import java.util.Scanner;

/*���빮�� #1 (0527)
 * ����ڰ� �ش� ���� �Է��մϴ�.
 * �� , ����ڰ� �ΰ��� ���ڸ� �Է��ϵ� 
 * ù��° ���ڿ� �ι�° ���� ���� �ȿ� �ִ� ��� ���ڸ� ���ؼ� ������� �������� �����Ͻÿ�.
 * ��, �ش��ڵ�� do~while���� �ۼ��մϴ�.
 * ����)
 * ù��° ���� ���ڴ�? 5
 * �ι�° ���� ���ڴ�? 10
 * ���� ���� ��� �հ�� : 45�Դϴ�.
 * */
public class Example3_0527 {

	public static void main(String[] args) {
		String msg="ù��° ���� ���ڴ�? ";
		System.out.print(msg);
		Scanner Num = new Scanner(System.in);
		int first = Num.nextInt();
		
		String msg2 = "�ι�° ���� ���ڴ�? (ù��° ���ں��� Ŀ�� �մϴ�.) ";
		System.out.print(msg2);
		Scanner Num2 = new Scanner(System.in);
		int second = Num2.nextInt();
		
		int total = 0;
		do {
			total+=first;
			first++;
		}while(first<=second);
		System.out.printf("���� ���� ��� �հ� : %d",total);
		
		Num.close();
		Num2.close();
	}

}
