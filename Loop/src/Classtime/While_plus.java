package Classtime;

public class While_plus {

	public static void main(String[] args) {
		/* 5~10���� ���� �հ� ���� ��� */

		int w = 5; // �ʱⰪ
		int total = 0; // �հ�ġ�� ������Ű������ ������
		while (w < 11) {
			// total = total + w;
			total += w;
			w++;
		}
		System.out.println("�հ� : " + total);
		/*���빮�� #1 (0526)
		 3~8���� ���� �� �հ� ���� ����Ͻÿ� */
		
		int N = 4;
		int total2 = 3;
		while (N <= 8 ) {
			total2*=N;
			N++;
		}
		/*int N = 3;
		 *int total2 = 1; */
		//AA:�̰� �츮�� �߰��Ҵ��̶�� �θ��ϴ�.. ���ϱ⿬����� �߰��ϴ°�,.,
		
		System.out.println("�հ� : "+ total2);
	}

}
