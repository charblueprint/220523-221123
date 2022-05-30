package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class buget2 {

	public static void main(String[] args) {
		String[] chooses = new String[4]; // 주문 받을 값 4개
		String Menu[] = { "햄버거", "피자", "치킨", "커피" }; // 데이터 있죠?
		System.out.print("햄버거, 피자, 치킨, 커피 \n주문하고자 하는 음식을 선택해 주세요. >> ");
		Scanner Meal = new Scanner(System.in);
		int i = 0;
		for(String C : chooses) {
			chooses[i] = Meal.next();//입력받은 값이죠?
			if(C.equals("햄버거")|| C.equals("피자")||C.equals("치킨")||C.equals("커피")) {
				C
				i++;
			}
		}
		System.out.println(chooses);
	}
}