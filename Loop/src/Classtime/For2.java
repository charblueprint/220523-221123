package Classtime;

public class For2 {

	public static void main(String[] args) {
		int a; // for�� �ʱⰪ
		int b=2; // ���꿡 ����� ����
		int c; //������ ����� ���
		for (a = 1; a <= 9; a++) {
			 c=b*a; // ��� ���� �۾�
			 System.out.print(c+" ");
		}

		/* ���빮�� #5 ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�
		 * 45,40,35,30,25,20,
		 */
		int A;
		int B = 5;
		int C;
		for (A = 9; A >= 4; A--) {
			C = A * B;
			 System.out.print(C + ",");
		}

		/* ���빮�� #6 ���� ������� ���� �ڵ带 �ۼ��Ͻÿ�
		 * 11,22,33,44,55,66,77,88,99,
		 */
		int D;
		int E = 11;
		int F;
		for (D = 1; D <= 9; D++) {
			F = D * E;
			System.out.print(F + ",");
		}
		/*���� �̷��Ե� �Ͻ�
		 * int z;
		 * int x;
		 * for (z=1;z<10;z++){
		 * 		x = (10+z)+10;
		 * Ȥ��  x = (10*z)+z;
		 * 		System.out.print(x+",");
		 */

	}

}