/* ���빮�� #6 (0527)
 * 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
 * ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ���մϴ�.
 * �ش� �ΰ��� ���� ���Ͽ� ���Ѱ��� ū��, ���Ѱ��� ū���� ����� ����Ͻÿ�. */
public class Example6 {

	public static void main(String[] args) {
		int init = 1;
		int first = 1;
		int second = 0; // ���� ����
		
		while (init <= 10) { //1~10���� �ϴ� ����
			if (init <= 5) { //1~5������ ��� ���� ����
				first *= init;
			} else { //6~10������ ��� ���� ����
				second += init;
			}
			init++;
		}

		if (first > second) { // �ش� �ΰ��� ���� �� �� ��� ���
			System.out.print("���� ���� Ů�ϴ�.");
		} else if (first < second) {
			System.out.print("���� ���� Ů�ϴ�.");
		} else { // �� �ص� �Ǳ� �ѵ� ���߿� �����̳� �׷��� �����ϸ� �صδ°� ����..?
			System.out.println("�� �񱳰��� �����ϴ�.");
		}

	}

}
