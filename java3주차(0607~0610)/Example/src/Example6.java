import java.util.Scanner;

/*���빮��#1
 ��ǰ ������ 42000�Դϴ�.
 ����ڰ� �ش� ��ǰ ������ �Է��ϰ� �˴ϴ�.
 �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ���� �ݾ��� ��½�Ű�� extends�� �����Ͻø� �˴ϴ�.
 ��,42000�� ���� ���ڰ� �ٲ�� �ȵ˴ϴ�.
 ����ڰ� �ִ� ���� �� �� �ִ� ������ 5������ �Դϴ�.
 ������� ���� main method���� ��� �����մϴ�.*/
public class Example6 {

	public static void main(String[] args) {
		Scanner Buy = new Scanner(System.in);
		System.out.print("��ǰ�� ������ �Է��ϼ���.>> ");
		int A = Buy.nextInt();
		
		if(A>=6) {
			System.out.println("�ִ� ���� �� �� �ִ� ������ 5�������Դϴ�! ���ΰ�ħ �� �ٽ� �õ��ϼ���.");
			System.exit(0);
		}
		
		file2 F = new file2();
		F.check(A,0);

		int result = F.Total2();
		System.out.printf("���� �Ѿ� : %d��", result);
		Buy.close();

		//file2 file2 = new file2();
		//file2.Total(); //�ٵ� ��������� ���� ��..
	}
}

class file1 {
	protected int A2;
	protected int sum;

	public void check(int A1, int z) {
		this.A2 = A1;
		this.sum = z;
	}
}

class file2 extends file1 {
	public void Total() {
		if ((this.A2>=1)&&(this.A2<=5)) {
			this.sum = this.A2 * 42000;
		}
	}
	public int Total2() {
		return this.sum;
		
	}
	
}