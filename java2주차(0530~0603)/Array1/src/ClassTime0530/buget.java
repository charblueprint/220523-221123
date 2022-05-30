package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class buget {

	public static void main(String[] args) {
		String[] chooses = new String[4]; //주문 받을 값 4개
		String Menu [] = {"햄버거","피자","치킨","커피"}; //데이터 있죠?
		System.out.println("햄버거, 피자, 치킨, 커피 \n주문하고자 하는 음식을 선택해 주세요. >> ");
		Scanner Meal = new Scanner(System.in);
		String choose = Meal.next();//입력받은 값이죠?
		int i = 0;
		for(String C : Menu) {
			do {
				if(C.equals("햄버거")|| C.equals("피자")||C.equals("치킨")||C.equals("커피")) {
					chooses[i]=C;
					int pick = chooses.length;
				} else if(C.equals("주문종료")) {
					System.out.println("주문내역 : "+Arrays.toString(chooses));
				}
				
				i++;
			}while(i<4);
		}
	}
}
		