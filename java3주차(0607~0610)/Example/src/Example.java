import java.util.Scanner;

/*���빮��#1
 ��ǰ ������ 42000�Դϴ�.
 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
 �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
 ��,42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5������ �Դϴ�.
 ������� ���� main method���� ��� �����մϴ�.*/
class file1{
	private final int item=42000;
	private int want ;
	protected file1(int Num) {
		this.setWant(Num);
	}
	public int getWant() {
		return want;
	}
	public void setWant(int want) {
		this.want = want;
	}
	public int getItem() {
		return item;
	}	
}
class file2 extends file1{
	public file2(int Num) {
		super(Num);
	}

	public int code2() {
		//int total = this.getWant()*this.getItem();
		//return total;
		return this.getWant()*this.getItem();
	}
}
public class Example {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���. >> ");
		int input = sc.nextInt();
		if(input>=6) {
			System.out.println("�ִ� ���� �� �� �ִ� ������ 5�������Դϴ�! ���ΰ�ħ �� �ٽ� �õ��ϼ���.");
			System.exit(0);
		}
		
		file2 R = new file2(input);
		
		System.out.printf("���� �Ѿ� : %,d��",R.code2());
		sc.close();
	}

}