package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//ArratList 2차 배열 형태, 다차원도 포함
public class Arrys_more {

	public static void main(String[] args) {
		String member_data[][]  = new String [][] {{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"}};
			 //String [] : 2차배열 이상 Integer[] :2차배열 이상 
			 ArrayList<String[]> list = new ArrayList<String[]>(Arrays.asList(member_data));
			 //System.out.println(list.get(0)[2]);
			 int w = 0;
			 while(w<list.size()) { //2
				 System.out.println(list.get(w)[2]);
				 w++;
			 }
	}

}
