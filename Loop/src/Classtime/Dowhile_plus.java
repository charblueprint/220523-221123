package Classtime;

public class Dowhile_plus {

	public static void main(String[] args) {
		/* Do~While : 30~35���� �հ踦 ����Ͻÿ� */
		int A = 30;
		int total = 0;
		do {
			total += A;
			A++;
		} while (A <= 35);
		System.out.println("�հ� : " + total);
	
	/*���빮�� #2
	 * �հ���� 189�� �ֽ��ϴ�. 
	 * ��, 1~10���� �հ�ġ�� ���� 189�� �� �� �հ踦 ����Ͻÿ�
	 */
		int init = 189;
		int Z = 1;
		int total2 = 0;
		do {
			total2+=Z;
			Z++;
		}while (Z<=10);
		System.out.println("Total : " + (init - total2));
	
	}
	

}
