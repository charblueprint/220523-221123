import java.util.Scanner;

/*���빮��#1(0609)*/
/*[up&down����]
1.PC�� ���ڸ� �ϳ� ���� random ��� 1~10����
2.�� ��ȸ�� X�� ���ҽ��ϴ�.1~10���� ��ȣ�� �ϳ��� ��ȣ�� �Է�?
3.���� PC�� 7�� �̾�����, �̰Ͱ� ����ڰ� �Է��� ���ڿ� ��
PC :7 , ����� : 2=> ��� : "UP"�� ���
4.�� ��ȸ�� X�� ���ҽ��ϴ�.1~10���� ��ȣ�� �ϳ��� ��ȣ�� �Է�?
PC :7 , ����� : 2=> ��� : "UP"�� ���
5.�̷��� 5���� �ݺ�
6.���� ������ �� ����� "�����Դϴ�."�� ��� ���μ����� ����

A��Ʈ : PC random,Scanner X5 
B��Ʈ : PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��
 */
public class Example1 {
	/*
	 * 1.<�Ϲ� random ���� (random double �ڷ���)> -> int PC_pick = (int) (Math.random() * 10 + 1);
	 */

	/*
	 * 2. <util�� �̿��� random ����> -> Random R = new Random(); int PC_pick = R.nextInt(10)+1;
	 */

	public static void main(String[] args) {
		String msg[] = { "1~10���� ��ȣ�� �ϳ��� ��ȣ�� �Է��ϼ��� >> ", "UP!", "DOWN!", "�����Դϴ�!!", "�ý����� �����մϴ�." };
		Scanner sc = new Scanner(System.in);
		int PC_pick = (int) (Math.random() * 10 + 1); // �������� ���� �ϳ� ����

		int count = 5;
		while (count >= 1) {
			System.out.printf("�� ��ȸ�� %d�� ���ҽ��ϴ�." + msg[0], count);
			int Choose = sc.nextInt(); // ����ڰ� ���� �Է�
			Example2 E2 = new Example2();
			E2.User(Choose, PC_pick, null);

			String answer = E2.PC(); // ���� ���ڸ� ���� ����

			int check = answer.indexOf("����"); // indexOf => Ư�� �ܾ ã���ִ� �Լ�(int�� �����!) -1 : ������ / 0 : ����
			if (check == 0) {
				System.out.printf("%s\n%s", msg[3], msg[4]);
				System.exit(0);
				System.gc();
			} else {
				if (answer.equals(msg[1])) {
					System.out.println(answer);
					count--;
				} else if (answer.equals(msg[2])) {
					System.out.println(answer);
					count--;
				}
			}
		}
		sc.close();
		PC_pick = 0;
		System.gc();
	}
	
}

//		if(count==0) {
//				System.out.println("���� ����! �ٽ� �����ϼ���\n"+msg[4]);
//				System.exit(0); //�̰� �����ϰ� �;�� �����ּ���
//			} 
