/*���빮�� #5
 * ���� �ڵ带 ���� while������ ��ȯ�Ͻÿ�*/
public class Example5 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 12) {
			i++;
			if (i % 2 == 0) {
				sum = i + sum;
			}
		}
		System.out.println("1���� 12������ ¦���� �� = " + sum);
	}

}
