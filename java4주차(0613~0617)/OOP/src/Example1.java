//abstract ���빮��
		/* 1�� �迭 ���� �ֽ��ϴ�. �ش� �迭���� ��� ���� ���� ����մϴ�.
		 ��, abstract �⺻ void �̸��� sender�Դϴ�.
		 ���� �� ����� sender���� ��µǵ��� �մϴ�.
		 �迭�� abstract���� ����մϴ�.
		 �迭 ������ : 6,13,22,9,12,64,32,47,39
		 */
public class Example1 {

	public static void main(String[] args) { //�ܺ�Ŭ���� ȣ�⸸ �մϴ�.
		Sum S = new Sum();
		S.sender();
	}

}
abstract class AB{
	public abstract void sender();
	protected int arr[]= {6,13,22,9,12,64,32,47,39};
}
class Sum extends AB{
	protected int total = 0;
	private int i;
	
	@Override
	public void sender() {
		this.i=0;
		do {
			this.total+= this.arr[this.i];			
			this.i++;
		} while(this.i<arr.length);
		System.out.println("TOTAL : " + this.total);
	}
	
}