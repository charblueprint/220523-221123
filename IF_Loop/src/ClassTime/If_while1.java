
package ClassTime;

public class If_while1 {

	public static void main(String... args) {
		/*���빮�� #9
		 * while������ 10~30���� �����߿��� Ȧ������ ����Ͻÿ�. */
		int A = 10;
		while (A <= 30) {
			if ((A % 2 != 0) && (A >= 20)) {
				System.out.print(A + " ");
			}
			A++;
		}
		
		// ī���� ������ ���� Ȯ���ϱ�
		/*1~10���� ���� �߿� ¦�� ���� � �ִ��� ������ ����ϼ���*/
		int Input = 1;
		int count = 0; // ī���� ������
		while(Input<=10) {
			if(Input%2==0) { //¦���� ��� 
				count++;	//�ش� ������ ���� ��� +1�� ������
			}
			Input++;
		}
		System.out.printf("1~10���� ���� �� ¦�� ������ %d�Դϴ�.",count); 
		//�ݺ��� ����� ���� ī���� ���� ����ϰ� �˴ϴ�.
		
	
	}

}
