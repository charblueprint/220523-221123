package List1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

/*응용문제#4*/
/*넘버데이터1 3,6,9,12,15
  넘버데이터2 2,4
  
  결과 3,6,9,12,15,2,4*/
public class list3 {
	//Arrays.sort은 배열 변수 형태에서만 작동합니다.
	/*
		int c[] = new int [9];
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));
		이 지랄 나지 않는 이상은 바로 못씁니다
	*/
	
	public static void main(String[] args) {
		Integer Num1[] = {3,6,9,12,15};
		Integer Num2[] = {2,4};
		ArrayList<Integer> Nums1 = new ArrayList<Integer>(Arrays.asList(Num1));
		ArrayList<Integer> Nums2 = new ArrayList<Integer>(Arrays.asList(Num2));
		
//		Nums1.addAll(Nums2); //이렇게 한번에 넣을 수도
//		System.out.println(Nums1);
		
		int i=0; //이렇게 반복문 돌릴 수도 있음
		do {
			Nums1.add(Nums2.get(i));
			i++;
		} while (i<Nums2.size());
		Collections.sort(Nums1); //ArrayList, LinkedList 오름차순 정렬
		System.out.println(Nums1);
		
		int w = Nums1.size();
		System.out.println(w);
	}

}
