package ClassTime;

public class Double_loop2 {

	public static void main(String[] args) {
		// while
		int w = 1;
		//�̷��� int ww=1;�� �ۿ� ������
		while (w <= 3) {
			int ww = 1;//�׷��� �̷��� �ȿ��ٰ� �־��־�� ��.
			/*
			 * ���� while���� �ʱⰪ �� ū �ݺ����ȿ� ���� 
			 * ū while���� �ѹ� ���µ��� ���� while���� �ѹ� ���µ�,
			 * �갡 �ѹ������� �ٽ� ū while���� �ٽ� ���ƾ� �ϴµ�,
			 * 9��° �ٷ� �ٽ� ���ư��� ���� �ٷ� ���ٿ� ���� ���Ѱ� �Ⱥ��� ����..
			 * �׷��� ���� while���� �� ���ư�(10��° �� ����)
			 */
			while (ww <= 4) {
				System.out.println(w + "+" + ww);
				w++;
			}
			w++;
		}

		// do while
		int dw = 1;
		do {
			//do while�� ���� while�� ���� �ʱⰪ�� ū �ݺ����ȿ� ����
			int ddw = 1;
			do {
				ddw++;
			} while (ddw <= 4);//���� �ݺ��� ����
			dw++;
		} while (dw <= 3);//ū �ݺ��� ����

	}

}
