package Classtime;

public class Do1 {

	public static void main(String... args) { // �ǹ����� []��� ...�� ���⵵ �Ѵ�~ �ý��� ���� �����..
		int a = 1; // �ʱⰪ
		do {
			System.out.println(a + " ");
			a++; // ������
		} while (a < 11); // ������,���ᰪ
		/*
		 * ���빮�� 5~0���� ��µǴ� do~while�� �ۼ��Ͻÿ�
		 */
		int b = 5;
		do {
			System.out.printf("%d ", b);
			b--;
		} while (b >= 0);
		
		int c = 50;
		int d = 60;
		do {
			System.out.printf("%d ", c);
			c++;
		} while (c <= d);

	}

}
