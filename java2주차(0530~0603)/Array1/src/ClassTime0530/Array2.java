/*���빮�� #8(0530) 
 * hong kim park lee jang jung
 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�. �ش� �迭���� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�.*/
/*���빮�� #9
 * �迭 ������ ������ ����
 * 15 60 11 14 27 
 * ������ ���� ��� ���ؼ� ���� ������� ����Ͻÿ�.*/
package ClassTime0530;

public class Array2 {

	public static void main(String[] args) {
		//#8
		String N[] = {"hong","kim","park","lee","jang","jung"};
		int word= N.length;//��üȸ������ �ľ��ϱ� ����
		int init = 0;
		int three;//������ �迭 �������� ���ڰ����ľ�
		while (init<word) {
			three = N[init].length();//���ڰ��� �ľ�
			if(three>3) {
				//System.out.println(N[init]);//���ܾ� �̻�(����)�� �����͸� ���
			}
			init++;
		}
		//#9
		int A[] = {15,60,11,14,27}; // �迭���� ���� ��� 1
		int B = A.length; // �׷��� ��ü �����˰� 2
		int Z = 0; // �迭 ù��° �� 3
		int total = 0;//
		do { //�ݺ� 6
			total+=A[Z]; //������ ǥ���ϰ� 4
			Z++; // �����ϸ鼭 6
		} while(Z<B); //ù��° ~ ��ü�������� ���� 5
		System.out.println(total); //���� ǥ�� 7
		
		
	}

}
