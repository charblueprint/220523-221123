
public class thread2 {
//thread�� ���������� ������� ���� �� ����
	public static void main(String[] args) {
		/*���빮�� 
		 Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ� �������α׷��� �����Ͻÿ�*/
		int data[] = {6,9,10,15,3,17};
		/*��Ʈ : 6�̶�� �迭 ���� �μ� ������ thread�� ����, 6+5+4+3+2+1 ���� ������� ��� => 21*/
		Box B2 = null;
		int i;
		for(i=0;i<data.length; i++) {
			B2 = new Box(data[i]);
			B2.start();
		}
	}
}
class Box extends Thread{
	int num = 0;
	public Box(int N) { //Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ带 �����
		this.num = N;
	}
	@Override
	public void run() { //run �޼ҵ�� ���� �μ����� �� ����
		int j = this.num; 
		int total = 0;
		while (j > 0) {
			total += j;
			j--;
		}
		System.out.printf("�� ���� %d�Դϴ�.\n",total);
	
	}
	
	
}