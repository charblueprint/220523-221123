import java.util.Scanner;

/*���빮��#2*/
// extends�� ����Ͽ� �ٸ� �ܷΰ��� ���� �ڵ带 �ۼ��Ͻÿ�.
//���� �ΰ��� �Է��մϴ�. �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�.
/*1.ù��° ���ڰ� �ι�° ���ں��� Ŭ ���(A>B)
  2.ù��° ���ں��� �ι�° ���ڰ� Ŭ ��� (A<B)
  3.ù��° ���ڰ� �ι�° ���ڶ� ���� ���
  
  1���� ��� : ��� ���� ��ŭ ���ڸ� ��� ���� ��� ���� ���
  2���� ��� : �ش� �ΰ��� ���� ��ģ ��� �� ���
  3���� ��� :"�ش� ���� �����ϴ�."��� �޼��� ���
  */

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��մϴ�.>> ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		BigSmall B1 = new BigSmall();
		B1.Nums(A, B);
		sc.close();
		System.gc();
	}

}

class BigSmall {
	protected int total = 0;
	protected int Num1;
	protected int Num2;

//	public BigSmall(){
//	�޼ҵ忡 �� �ȴ����� �ٷ� ����� �� ����� �ȴ�.
//	}
	public void Nums(int A, int B) {
		this.Num1 = A;
		this.Num2 = B;

		if (A == B) {
			System.out.println("��� : �ش� ���� �����ϴ�.");
			System.exit(0);
		} else {
			BigSmall2 B2 = new BigSmall2();
			B2.print();
		}
	}

	class BigSmall2 extends BigSmall {
		public void print() {
			String message = "��� : ";
			int i = 0;
			if (this.Num1 > this.Num2) { // 1��
				i = this.Num2;
				do {
					this.total += i;
					i++;
				} while (i <= this.Num1);
				System.out.println(this.total);
			} else if (this.Num1 < this.Num2) { // 2��
				this.total = this.Num1 + this.Num2;
				System.out.println(message + this.total);
			}
		}
	}
}