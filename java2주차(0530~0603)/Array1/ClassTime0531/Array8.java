/*���빮�� #3
 �ش� ������ �迭�� �ִ� ��� ���� ¦������ ��� ���Ͻÿ�.
 1�� ������ : 11, 42, 22, 16
 2�� ������ : 7, 33, 10, 29
 ����� : 90
 */




package ClassTime0531;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		/*
		 * ���� �迭 
		 * int a[] = new int[2]; 
		 * a[0]=22; 
		 * a[1]=32;
		 */

		/*
		 * ���� �迭 
		 * int b[] = {1,2,3,4}; 
		 * int[] c = {1,2,3,4}; 
		 * int[] d = new int[] {1,2,3,4};*/

		/* 2�� �迭 [][] */
		/*
		 * 2�� ���� �迭 String member2[][] = new String[3][3]
		 */
		String member[][] = { { "ȫ�浿", "������", "������" }, { "25", "31", "22" } };
		// �����Ͱ� �� ��� ""�� ���·� ����.
		int L = member.length;// �迭 ������ � �ִ� ���� Ȯ��
		int L1 = member[0].length;
		int L2 = member[1].length;
		// �ش� �迭����(member[0]�̸� 0��° �ε������� ������ �ڷ���ǹ���.) ������ ��ü�� ��ִ��� Ȯ��
		// System.out.println(L2);

		// System.out.println(member[0][1]);
		int f, ff;
		for (f = 0; f < L; f++) { // ū �ݺ����� �迭 ������ŭ loop
			// System.out.println(Arrays.toString(member[f]));
			for (ff = 0; ff < L1; ff++) { // ���� �ݺ����� �迭�� �ִ� ������ ������ŭ loop�� ���ϴ�.
				// System.out.println(member[f][ff]);
			}
		}
		int[][] data = { { 1, 3, 5 }, { 2, 4, 6 } };
		int A = data.length;
		int B = data[0].length;// []�ȿ��� �ƹ��ų� �־ ��. ������ ������ ������ ������ �����ϱ� ������..

		int i, ii;
		int total = 0;
		for (i = 0; i < A; i++) {
			// System.out.println(Arrays.toString(data[i]));
			for (ii = 0; ii < B; ii++) {
				// System.out.print(data[i][ii]);
				total += data[i][ii];
			}
		}
		//System.out.println("�� �հ��: " + total);
	
		/* #3 */
		int [][] Num = {{11, 42, 22, 16}, {7, 33, 10, 29}};
		
		int j=0;
		int k=0;
		int total1 = 0;
		do{
			do {
				if (Num[j][k] % 2 == 0) {
					total1 += Num[j][k];
				}
				k++;
			} while(k < Num[0].length);
			j++;
		}while(j < Num.length);
		System.out.println("����� : " + total1);
	
	
	}

}
