package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArratList 2�� �迭 ����, �������� ����
public class Arrys_more {

	public static void main(String[] args) {
		String member_data[][]  = new String [][] {{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
			 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"}};
			 //String [] : 2���迭 �̻� Integer[] :2���迭 �̻� 
			 ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
			 //System.out.println(list.get(0)[2]);
			 int w = 0;
			 while(w<list.size()) { //2
				 System.out.println(list.get(w)[2]);
				 w++;
			 }
	}

}
