/*���빮�� ���չݺ��� for,do~while*/
/*���빮�� #4
 * ������ 7~9�ܱ���
 * ��, �� ������ �������� 5������ �������� �մϴ�.
 * 7*1=7~7*5=35...9*5=45
 * ���� ; ū do~while�� ���� while��*/
/* #5
 * ���� ��� ���� Ȯ���Ͽ� �ڵ带 �ۼ��մϴ�.
 * ��, for�� ~ while������ ���۵Ǿ�� �մϴ�.*/
/*#6
 *���� �ش� �����ó�� ����� �ǵ��� ���� �ݺ����� �̿��Ͻÿ�. (while ~ do~while)
 * 1+1=2
 * 2+1=3 2+2=4
 * ...
 * 4+1=5 .... 4+4=8
 */
package Questions0530;

public class Double_loop4 {

	public static void main(String[] args) {
		// ���빮��
		int f;
		for (f = 2; f <= 3; f++) {
			int w = 1;
			do {
				// System.out.println(f + "*" + w + "=" + (f * w));
				w++;
			} while (w <= 9);
		}

		// ���빮�� #4
		int A = 7;
		do {
			int B = 1;
			// System.out.printf("<%s��> \n",A);
			while (B <= 5) {
				// System.out.println(A + "*" + B + "=" + (A * B));
				B++;
			}
			A++;
		} while (A <= 9);

		// ���빮�� #5
		int x;
		for (x = 1; x <= 9; x++) {
			int y = x;
			while (y <= x) {
				System.out.println(x + "*" + y + "=" + (x * y));
				y++;
			}
		}
		//���빮�� #6
		

	}

}
