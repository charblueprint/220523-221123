package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer Num1[] = {3,6,9,12,15};
		LinkedList<Integer> Ln = new LinkedList<>(Arrays.asList(Num1)); 
		//Arraylist보단 LinkedList가 로딩 속도와 지우는 속도가 좀 느림. 근데 데이터 삽입이나 수정의 경우는 LinkedList가 더 빠르다는 점
		System.out.println(Ln);
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>(); // 빈 배열 생성
		String user;
		//for(;;){} / do{}while(true); => 무한루프 
		while(true) { //무한루프
			System.out.println("숫자를 입력하세요");
			user = sc.next();
			try { // 사용자가 입력한 값이 오류가 있는 지 확인하는 파트
				int number = Integer.parseInt(user);
				list.add(number);
				int i = list.size();
				if(i>=6) { break;} // 5개까지 배열이 입력되면 무한루프를 빠져나옴
			} catch (Exception e) { //오류가 발생하였을 경우 작동되는 파트
				System.out.println("이게 되겠냐 숫자로 다시 입력하셈");
			}
			System.out.println(list);
		}
	}

}
