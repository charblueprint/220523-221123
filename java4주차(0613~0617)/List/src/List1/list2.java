package List1;
/*���빮�� #2*/
/*�ش� �����Ͱ� �� �޸�� �����ʹ� ��� �����Ǿ�� �մϴ�.
 �������� : {"�����","������","��â��","�ڵ���","�̰���","�����","������"}
 ��� : �����, ������
 */

/*���빮�� #3*/
/* ¦���� ���ڸ� ��� �����մϴ�.
 10,7,6,1,11,37,41,22
 
 ��� : 7,1,11,37,41 */
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		//#2
		String data[] = {"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> Sleep = new ArrayList<>(Arrays.asList(data));
		int i = 0;
		while(i<Sleep.size()) {
			int j=0;
			while(j<=0) { //node�� ������ �ٽ� Ȯ����
				if(!Sleep.get(j).equals("�����")&&!Sleep.get(j).equals("������")) {
					Sleep.remove(0);
					System.out.println(Sleep);
					j++;
					}
			}
			i++;
		}
		//#3
		Integer not_odd[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(not_odd));
		
		int A = 0;
		int o1 = arr1.size();
		while(A<o1); {
			int o2 = arr1.size();
			int B=0;
				do {
					if(arr1.get(B) % 2 == 0) {
						arr1.remove(B);
						break;
					}
					B++;
				} while(B<o2);
			A++;
			System.out.println(arr1.get(B));
		} 
		
	}

}
