
public class time1 {

	public static void main(String[] args) {
		/* try - catch�� (���� ó�� ��� ����)*/
		int i = 1;
		do {
			try { //���� �߻��� �ڵ带 ����
				Thread.sleep(1000); //1000 = 1��
				//Thread.sleep : �Ͻ����� ���¸� �ǹ�
			}catch (InterruptedException e) {
				//InterruptedException : �ش� ���� �߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			System.out.println(i);				
			i++;
		} while (i<=10);
	}

}
