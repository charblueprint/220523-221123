import java.util.Scanner;

/*���빮�� #13 (0526)
 * while������ �ڵ带 �ۼ��ؾ� �ϸ�, ���μ����� ������ ����.
 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
 * ������ "7000 �����Ͻðڽ��ϴ�?'��� ��µǸ�, ���� 1�̶�� �Է��ϸ�
 * �������� �ݾ׿� �߰��Ǿ����ϴ�. ��, 2��� �Է½� �������� �ݾ׿� �߰��Ǿ����� �ȵ˴ϴ�.
 * �� ���� Ƚ���� 4�� �Դϴ�.
 * �������� �������� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
 * */
public class Example1 {

	public static void main(String[] args) {
		Scanner recepit = new Scanner(System.in);
		
		final int money = 7000;
		int Try=1;
		int total=0;
		
		while(Try<=4) {
			System.out.print("7000���� �����Ͻðڽ��ϱ�?(������ ���ڷ� 1,��ҽ� ���ڷ� 2 �Է�) >> ");
			int answer = recepit.nextInt();
			if(answer==1) {
				total+=money;
			} 			
			Try++;
		}
		System.out.printf("���� �ݾ� : %d��",total);
		
		
		
		
	}

}
