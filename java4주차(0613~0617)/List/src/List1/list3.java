package List1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

/*���빮��#4*/
/*�ѹ�������1 3,6,9,12,15
  �ѹ�������2 2,4
  
  ��� 3,6,9,12,15,2,4*/
public class list3 {
	//Arrays.sort�� �迭 ���� ���¿����� �۵��մϴ�.
	/*
		int c[] = new int [9];
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));
		�� ���� ���� �ʴ� �̻��� �ٷ� �����ϴ�
	*/
	
	public static void main(String[] args) {
		Integer Num1[] = {3,6,9,12,15};
		Integer Num2[] = {2,4};
		ArrayList<Integer> Nums1 = new ArrayList<Integer>(Arrays.asList(Num1));
		ArrayList<Integer> Nums2 = new ArrayList<Integer>(Arrays.asList(Num2));
		
//		Nums1.addAll(Nums2); //�̷��� �ѹ��� ���� ����
//		System.out.println(Nums1);
		
		int i=0; //�̷��� �ݺ��� ���� ���� ����
		do {
			Nums1.add(Nums2.get(i));
			i++;
		} while (i<Nums2.size());
		Collections.sort(Nums1); //ArrayList, LinkedList �������� ����
		System.out.println(Nums1);
		
		int w = Nums1.size();
		System.out.println(w);
	}

}
