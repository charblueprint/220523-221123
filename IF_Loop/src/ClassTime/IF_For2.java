package ClassTime;

public class IF_For2 {

	public static void main(String... args) {
		// 1~100���� ���� �� 80�̻��� ���ڸ� ���
		int F;
		for (F = 1; F <= 100; F++) {
			if ((F >= 80) && (F % 2 == 0)) {
				// System.out.print(F+" ");
			}
		}
		/*
		 * ���빮�� #5 (0526) 200~300������ ������ 240������ ���ڸ� ����Ͻÿ�
		 */
		int O;
		for (O = 200; O <= 300; O++) {
			if (O <= 240) {
				// System.out.print(O + " ");
			}
		}
		
		final int a = 2;
		int w;
		for (w = 1; w < 11; w++) {
			if (w % a == 0) {
				//System.out.print(w + " ");
			}
		}
		/*���빮�� #6 (0526)
		 ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10 �̻� ���ڸ� ����մϴ�.*/
		final int A=2;
		int B;
		int C;
		for (B=1;B<=9;B++) {
			C=A*B;
			if (C>10) {
				//System.out.printf("%d ",C);
			}
		}
		
		/*���빮�� #7 
		 ���� ������� ���� �ش簪�� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 18 36 54 72 
		 9�� ¦���鸸 ��󳻵���!
		 */
		final int AA=9;
		int BB;
		for (BB=1;BB<=9;BB++) {
			if (BB%2==0) {
				System.out.printf("%d ",AA*BB);
			}
		}
		/*���빮�� #8 <<��Ǯ����.... ���̾���
		 * ���� ������� ���� �ش簪�� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 * 1~20������ ���� �Դϴ�
		 * 6 14 17 19 */
		int Num;
		for(Num=1; Num<=20; Num++) {
			if(Num==6||Num==14||Num==17||Num==19) {
				System.out.print(Num+" ");
			}
			
		}
	
	}
	
	

}
