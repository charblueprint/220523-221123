//		���빮�� #5
//		 * �ش� �ΰ��� �迭 �����Ͱ� �ֽ��ϴ�. �� �迭 ���� �ε����� ���� ��ȣ�� ���ؼ� ¦��,Ȧ�������� �迭 ��� �����ͷ� 
//		 * �缳���Ͻÿ�.
//		 * 
//		 * A data = 5 17 19 22 33
//		 * B data = 1 2 3 4 5
//		 * result = ["¦��","Ȧ��", "¦��","¦��","¦��"]
//	
package ClassTime0531;

import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		int A1[][] = {{5, 17, 19, 22, 33}, {1, 2, 3, 4, 5}};
		//A1[0][0]+A1[1][0]
		int ea = A1[0].length; // �迭�� �ִ� ������ ��ü ��
		int ea2 = A1.length;	//�迭 �׷� ��
		
		int newdata[] = new int[ea]; //���ο� �迭 ��ü����
		int w=0; //ū �ݺ��� �ε��� ��
		
		while(w<ea) { //ū �ݺ����� ������ ���� ��ŭ ���ư�(�迭 ������ ��ü��)
			int total1=0;//������ ���� �̰��޴� ����
			int total2=0;
			int ww=0;
			
			while(ww<ea2) { //���� �ݺ��� 2����(�迭 �׷�)
				if(ww==0) {
					total1=A1[ww][w];
				} else {
					total2=A1[ww][w];
				}
				ww++;
			} //���� �ݺ��� ������ ���ͼ� ù���� �迭 �� + �ι��� �迭��
			newdata[w] = total1+total2; // ���ο� �迭 ��ü�� ���
			
			if(newdata[w]%2==0) {
			System.out.print("¦��");
			} else {
			System.out.print("Ȧ��");
			}
		w++;
		} 
		
		
	
	
	
	}

}
