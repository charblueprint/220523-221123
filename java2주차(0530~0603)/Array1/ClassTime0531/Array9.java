/*���빮��#4
 * 2���� ������ �迭�� �ֽ��ϴ�. �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�.
 * 1�� ������ : ���ѹα� �Ϻ� �߱� ��Ʈ�� �±�
 * 2�� ������ : 40 35 70 55 32
 * ��� ������ : 
 * ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"
 * 
 * ���빮�� #5
 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭 ���� �ε����� ���� ��ȣ�� ���ؼ� ¦��,Ȧ�������� �迭 ��� �����ͷ� 
 * �缳���Ͻÿ�.
 * 
 * A data = 5 17 19 22 33
 * B data = 1 2 3 4 5
 * result = ["¦��","Ȧ��", "¦��","¦��","¦��"]
 * */

package ClassTime0531;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		String inform [][]= {{"���ѹα�", "�Ϻ�", "�߱�", "��Ʈ��", "�±�"},{"40", "35", "70", "55", "32"}};
		int i = 0;
	
		int ar2 = inform[0].length;
		String Stress[] = new String[ar2];
		int j = 0;
			do {
				Stress[i] = inform[0][j] +"("+inform[1][j]+")";
				j++;
			} while(j<ar2);
			
		System.out.println(Arrays.toString(Stress));
	
		int A [][] = {{5, 17, 19, 22, 33}, {1, 2, 3, 4, 5}};
		
		int jj = A[0].length;
		int a = 0;
		int b = 0;
		int total;
		String result;
		String result_data [] = new String[jj]; 
			
		while(b<5) {
			
			total = A [0][b] + A [1][b];
			if(total%2==0) {
				System.out.println("¦��");
			} else {
				System.out.println("Ȧ��");
			}
			b++;
			}
		}
		

	
	}
