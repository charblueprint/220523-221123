package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// 외부 클래스를 사용하여 다음 프로세서를 작성하시오.
		/* 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로 합치도록 합니다.
		 그 대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 1번 DB : 11,22,33,44,55 
		 2번 DB : 8,10,11,19,44
		 
		 결과 출력
		 [8,10,19,22,33,44,55]
		 */
		/*
		 1. 1번 DB 2번 DB 중복 값 비교 및 2번 삭제
		 2. 2번 DB를 1번 DB에 추가
		 3. 1번 DB sort로 정렬
		 */
		Duplicate Du = new Duplicate();
		Du.dup();
	}

}
class Duplicate{
	private ArrayList<Integer> Num1=null;
	private ArrayList<Integer> Num2=null;
	
	public void dup() {
		Integer N1[] = {11,22,33,44,55};
		Integer N2[] = {8,10,11,19,44};
		this.Num1 =  new ArrayList<Integer>(Arrays.asList(N1));
		this.Num2 =  new ArrayList<Integer>(Arrays.asList(N2));
		int i = 0;
		do {
			int j = 0;
			do {
				if(this.Num1.get(i) == this.Num2.get(j)) {
					this.Num2.remove(j);
					this.Num2.add(j,0);
				}
				j++;					
			} while(j<this.Num2.size());
			i++;
		}while(i<this.Num1.size());
		
		int k = 0;
		while(k<this.Num2.size()) {
			if(this.Num2.get(k)!=0) {
				this.Num1.add(this.Num2.get(k));
			}
			k++;
		}
		Collections.sort(this.Num1);
		System.out.println(this.Num1);
		
		
		}
}