package Classtime;

public class Do2 {

	public static void main(String... args) {
		int a = 1; // �ݺ��� ���ʰ�
		int b = 9; // ��� ������
		int c;
		do {
			c = a * b;
			System.out.println(c + " ");
			a++;
		} while (a < 10);

/*
 ���빮��
 ���� ������� ���� do~while������ �ڵ带 �ۼ��Ͻÿ�.
 35 45 55 65 75		
 */

		int d = 0;
		int e = 10;
		int f;
		do {
			f = 35 + (e * d);
			System.out.print(f + " ");
			d++;
		} while (d <= 4);
		
		
		

	}

}
