import java.util.Scanner;

/*���빮��#1(0610)*/
/* �� ���� ���� �ܺ� Ŭ������ �����ϴ�.
 �ش� Ŭ�������� �ΰ��� ���� ����ϰ� �˴ϴ�.
 ��������� ������ �����ϴ�.
 3,10�� ������ �Ǹ� �ΰ��� ���� ���� ���մϴ�.
 ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ� 
 �ΰ��� �� ���� ¦��, Ȧ�������� ����ϴ� extends�� �����ϼ���.
*/
public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ��� >> \n1.");
		int A = sc.nextInt();
		System.out.print("2.");
		int B = sc.nextInt();
		Plus1 P = new Plus1();
		P.plus(A, B);
		sc.close();
	}

}

class Plus1 {
	public String odd[] = { "¦��", "Ȧ��" };
	protected int num1 = 0; protected int num2 = 0;
	protected int C = 0;
	
	public void plus(int A, int B) {
		this.num1 = A;
		this.num2 = B;
		this.C = this.num1 + this.num2;
		Plus2 P2 = new Plus2();
		P2.print(this.C);
	}
}

class Plus2 extends Plus1 {
	public void print(int C) {
		this.C = C;
		if (this.C % 2 == 0) {
			System.out.println("¦����");
		} else {
			System.out.println("Ȧ����");
		} 

	}
}