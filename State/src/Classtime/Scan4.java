package Classtime;
import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 내용을 적어주세요 >> ");
		//String text = sc.next();
		//next() : 스페이스바 입력까지만 적용
		//nextLine() : 스페이스바 포함 모두 입력적용
		String text =sc.nextLine(); 
		System.out.print(text);
		
		sc.close(); // scanner 종료를 기본으로 적용해주어야 합니다.
		
		String ID = "park"; // String + 숫자 = %s
		short age = 25;		// 숫자 = %d
		/* [중요사항]  
		 	%f : float,double
		 	%t : date, time 시간,날짜
		 	%b : boolean (true,false)
		 */
		
		
		//System.out.println(ID + "님의 나이는 "+ID+"입니다.");
		//printf : f라는 뜻의 format을 뜻합니다.
		System.out.println();
		System.out.printf("%s님의 나이는 %s입니다.",ID,age);
		//
		
	}

}
