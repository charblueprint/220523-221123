/* 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ� */
package Classtime;

public class For_plus {

	public static void main(String[] args) {
		int f;
		int total = 0;
		for(f=1;f<11;f++) { // total���� ���� �ݺ����� ���������� ������Ŵ
			total = total + f; //�̰� �Ѵ� ��뷮�� �Ѱ��� ���ϴµ� ����
			//total += f; �̰� �������
		}
		//System.out.printf("���հ�: %d",total);
		//+=(���ϱ� �Ҵ�) -=(���� �Ҵ�) *=(���ϱ� �Ҵ�) /=(������ �Ҵ�)
		//b = b-f;-> b -= f;
		
/*���빮�� #11
 ��ü���� 500�� �ֽ��ϴ�. �� 8ȸ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ����� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�
 * 
 */
		int M;
		int H = 12;
		int total2 = 500;
		for(M=1;M<9;M++) {
			total2 = total2 - H;
		}
		System.out.printf("���հ�: %d",total2);
	}

}
