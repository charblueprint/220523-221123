
/*���빮�� #2 (0524)
 * ���� �ش� ������ Ȯ�� �� �ڵ带 �ۼ��Ͻÿ�
 * Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���
 * ������� : ¦�� ,Ȧ�� ���Դϴ�. ��� ���
 */

package Questions0524;
import java.util.Scanner;
public class Scan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("����ڰ� ���ϴ� ���ڸ� �Է��ϼ��� >> ");
		int num = sc.nextInt();
		
		//%�� ���� �����鼭 ���������� Ȯ���ϴ� ���ı�
		if(num%2 == 0) {
			System.out.println("¦�� ���Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� ���Դϴ�.");
		}
		sc.close();
	}

}