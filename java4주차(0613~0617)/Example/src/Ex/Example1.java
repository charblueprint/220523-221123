package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// �ܺ� Ŭ������ ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		/* ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. ��, 2���� �迭�� �ϳ��� �迭�� ��ġ���� �մϴ�.
		 �� ��� �ߺ��� ���� �ϳ��� ó���� �ϼž� �մϴ�.
		 1�� DB : 11,22,33,44,55 
		 2�� DB : 8,10,11,19,44
		 
		 ��� ���
		 [8,10,19,22,33,44,55]
		 */
		/*
		 1. 1�� DB 2�� DB �ߺ� �� �� �� 2�� ����
		 2. 2�� DB�� 1�� DB�� �߰�
		 3. 1�� DB sort�� ����
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