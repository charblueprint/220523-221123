package Classtime;
import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 >> ");
		String id = sc.next();
		//System.out.print(id);
		if (id.equals("kim")) {
			// 문자열 형태는 scanner 이용시 equals라는 함수를 사용합니다.
			System.out.println("회원이 확인되었습니다.");
		} 
		else {
			System.out.println("확인되지 않습니다.");
		}
	sc.close();
	}
	

}
