package Classtime;
import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		Scanner ID = new Scanner(System.in);
		System.out.print("접속할 아이디를 입력하세요. >> ");
		String m = ID.next();
		
		Scanner pass = new Scanner(System.in);
		System.out.print("패스워드를 입력하세요. >> ");
		String p = pass.next();
		
		System.out.printf("아이디: %s, 패스워드: %s",m,p);
		ID.close();
		pass.close();
	}

}
