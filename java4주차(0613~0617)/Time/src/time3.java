public class time3 {
/*���빮��
 �ܺ� class�� �ֽ��ϴ�. �� ���θ޼ҵ忡�� �ش� �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻��մϴ�.
 8�����Ŀ� return���� "�Ա��� ��� ó���Ǿ����ϴ�."��� ���ڸ� �޵��� �Ͻʽÿ�.*/
	public static void main(String[] args) {
		/*try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		} catch (InterruptedException a) {
			System.out.println(a);
		}*/
		Account Ac = new Account();
		Ac.count();
	}
}
class Account{ //try-catch ���
	public void count(){
		try {
			System.out.println("��ø� ��ٷ��ּ���.\nó�����Դϴ�.");
			int i=1;
			while(i++<=4) {
				Thread.sleep(2000);
				System.out.print(".");
			}
			System.out.println("\n\n�Ա��� ��� ó���Ǿ����ϴ�.");
		} catch (InterruptedException e) {
			System.out.println("�ý��� ������ ���� �ٽ� �����մϴ�. ������ ȣ���Ͻñ� �ٶ��ϴ�.");
		}
	}
}