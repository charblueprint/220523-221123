/*���빮�� #1 (0531)
 * ������ ��ٱ��Ͽ� �������� ��ǰ�� ����� �ֽ��ϴ�.
 * ���� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
 * �ù��� 30000 ���� �̻�(����)
 * 15000 48000 67000 8000 118200 49800 6000 18700
 * ��°�� ) [48000, 67000, 118200, 49800]*/
package ClassTime0531;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		int wish[] = { 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 };// �־��� ������
		int Z = wish.length;// wish �������� ũ��
		int i = 0;// wish �����͹迭�� ���� �� ó������ 0��

		int[] Buy = new int[4]; // ���� ���� �迭 ����. ������ �� ����.
		int Y = Buy.length;// Buy �������� ũ��
		int j = 0;// Buy ������ �迭�� ������

		do {
			if (wish[i] >= 30000 && j < Y) {
				Buy[j] = wish[i]  ;
				j++;
			}
			i++;
		} while (i < Z);
		System.out.println(Arrays.toString(Buy));
		
	}

}
