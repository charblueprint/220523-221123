import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/* ���빮�� ����ڰ� ���� ���ڸ� �Է��մϴ�. ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ���մϴ�. 
* �� ���� �Է��� 7���̸�,����ڰ� �Է��� ���ڸ� ������ ������ ���� �մϴ�. 
* "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ� : " 7��
* �߰��ɼ� : ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
 */
public class example4 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		ArrayList<Integer> ODD = new ArrayList<Integer>();
		ArrayList<Integer> Even = new ArrayList<Integer>();
		int I = 0;
		do {
			System.out.printf("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�(%d��° �Է�) : ",(I+1));
			try { //�����Է����� ��
				int number = Integer.parseInt(SC.next());
				if(number%2==0) {
					Even.add(number);
					} else {
					ODD.add(number);
					}
			} catch (Exception e) { //�ƴ� ��
				System.out.println("���ڸ� �Է��ϼ��� >> ");
			}
			I++;
		} while(I<7);
		ODD.sort(Comparator.reverseOrder()); 
		//Comparator.naturalOrder()=> ��������  | Comparator.reverseOrder() => ��������
		Even.sort(Comparator.naturalOrder());
		System.out.println(ODD+"\n"+Even);
		SC.close();
		
		
	}

}
