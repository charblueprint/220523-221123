/*���빮�� #7 (0525)
 * ���������� while������ �ۼ��Ͻÿ�.
 * 22~16���� ���ڸ� ����Ͻÿ�
 */
package Questions0525;

public class Q2 {

	public static void main(String[] args) {
		int A = 22;
		while (A >= 16) {
			//System.out.print(A + ",");
			A--;
			}
/* ���빮�� #8 (0525)
 * ����2���� �̿��Ͽ� ������ �°� ���� ����Ͻÿ�.
 * 99~47����
 * 
 */
		int x = 99;
		int y = 47;
		while (x >= y) {
			//System.out.printf("%d ",x);
			x--;
		}
/* ���빮�� #9 �ش� ������� Ȯ���Ͽ� �ݺ������� �ڵ带 �ۼ��Ͻÿ�.
56,49,42,35,28,21,
 */
		int B = 8;
		int C = 7;
		int D;
		while (B>=3) {
			D=B*C;
			System.out.printf("%d ", D);
			B--;
		}

		
	}		
}

