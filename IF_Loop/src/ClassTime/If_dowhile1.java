package ClassTime;

public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� #10 (0526) ������6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.
		 */
		int B = 1;
		int C;
		do {
			C = 6 * B;
			if (C >= 35) {
				// System.out.print(C + " ");
			}
			B++;
		} while (B <= 9);
		
		/*
		 * ���빮�� #11
		 * 14~27���� ������ ¦�� ���� ��� ���Ͽ� ���� ������� ����Ͻÿ�.
		 */
		int Num = 14;
		int total = 0;
		do {
			if (Num % 2 == 0) {
				total+=Num;
			}
			Num++;
		} while (Num < 28);
		System.out.print(total+" ");
	}

}
