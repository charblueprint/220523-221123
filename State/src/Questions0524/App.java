package Questions0524;
/* ���빮��#1(0524) */
/*<����>
 * �ջ� ������ �� ���� ���� ����Ͻÿ�.
 * ����1 25+31*4+12
 * ����2 15*3+9+14
 */

public class App {

	public static void main(String[] args) {
		short a = 25+31*4+12;
		short b = 15*3+9+14;
		String A = "25+31*4+12";
		String B = "15*3+9+14";
		
		if(a>b) {
			System.out.println(B+" ���� �۽��ϴ�.");
		}
		else if (a<b) {
			System.out.println(A+" ���� �۽��ϴ�.");
		}
		else {
			System.out.println("���ڳ�!!");
		}
		
		/* �ش簪�� 2������ ¦��, Ȧ���� Ȯ���ϱ� */
		int x = b%2;
		// % ��ȣ�� ���� 0 �Ǵ� 1�� ������ ���� ����� �˴ϴ�.
		if(x==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
	}

}
