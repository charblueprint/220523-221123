/*���빮�� #1 (0603)
 <�迭 + �⺻(Ŭ����)�޼ҵ� ����>
 1�� �迭�� ������ ���� ���� �ֽ��ϴ�.
 22 33 44 55 66 77 88 99 
 �ش� ��ü ���� ��� ���� �� �հ� ���� ������ �޼ҵ�� ó���ǵ��� �մϴ�.
 ��, �ݺ����� ������ do~while������ �ۼ��մϴ�.*/
public class Example1 {

	public static void main(String[] args) {
		int A[] = { 22, 33, 44, 55, 66, 77, 88, 99 }; 
		Example1 P = new Example1();
		P.Plus(A);

	}

	public void Plus(int Result[]) { // void : ��ü���� + �ν��Ͻ� (�޸�) ���
		int total = 0;
		int i = 0;
		do {
			total += Result[i];
			i++;
		} while (i < Result.length);
		System.out.println("�� �� : " + total);
	}

}
