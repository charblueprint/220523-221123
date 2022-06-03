import java.util.Scanner;

/*#6
 * <2차 배열 + 기본(클래스)메소드 문제>
 * user_list : 홍길동, 이순신, 강감찬, 유관순,세종대왕, 김유신, 계백장군
 * user_point : 3000 1000 25000 19800 5750 3630 0
 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요 >> "
 입력한 값은 별도의 class를 제작하여 해당 메소드 값을 매개변수를 이용하여 전달 후 해당 결과값을 출력하시면 됩니다.
 */
public class Example6 {

	public static void main(String[] args) {
		System.out.print("포인트를 검색할 고객명을 입력하세요 >> ");
		Scanner sc = new Scanner (System.in);
		String Input = sc.next();
		Data.O(Input);
		sc.close();
		Input = null;
		
	}

}

class Data{
	public void List() {
		
	
	}
	public static void O(String customer){ //검색 할 사람과 데이터가 다 여기로 넘어와야..
		String user_list[][] = { { "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군" }, {"3000", "1000", "25000", "19800", "5750", "3630", "0"} };
		
		int i = 0;
		do {
			int j = 0;
			do {
				if(customer.equals(user_list[i][j])) {
					System.out.printf("%s님의 포인트는 %s점 입니다.",customer,user_list[1][j]);
				}
				j++;
			}while(j<user_list[0].length);
			i++;
		}while (i<user_list.length);
		
	}

}