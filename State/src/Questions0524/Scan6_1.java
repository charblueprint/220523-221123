/* 응용문제 #4 (0524)
 * [로그인 프로그램]
 회원 가입 아이디는 jung, su 3가지
 패스워드는 
 jung:j1234
 su:ssh
해당 아이디 외에 나머지는 "가입 되지 않은 사용자입니다." 라고 출력합니다.
또한 페스워드가 틀릴 경우, "회원정보를 다시 확인하세요."라고 출력합니다.
아이디 및 패스워드가 모두 맞을 경우 "로그인 되셨습니다."라고 출력하십시오.
 */

package Questions0524;

import java.util.Scanner;

public class Scan6_1 {

	public static void main(String[] args) {
		Scanner ID = new Scanner(System.in);
		System.out.print("접속할 아이디를 입력하세요. >> ");
		String m = ID.next();

		Scanner pass = new Scanner(System.in);
		System.out.print("패스워드를 입력하세요. >> ");
		String p = pass.next();

		if (m.equals("jung") || m.equals("su")) {
			if ((m.equals("jung") && p.equals("j1234")) || (m.equals("su") && p.equals("ssh"))) {
				System.out.println("로그인 되셨습니다.");
				/*
				 * [샘은 이렇게 하심] 
				 * if (m.equals("jung") || m.equals("su")) { 
				 * 		if ((m.equals("jung") && p.equals("j1234")) {
				 *  		System.out.println("로그인 되셨습니다."); 
				 *  	} else if (m.equals("su") && p.equals("ssh")) {
				 * 			System.out.println("로그인 되셨습니다.");
				 *   	}
				 */
			} else {
				System.out.println("회원정보를 다시 확인하세요.");
			}
		} else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		ID.close();
		pass.close();
	}

}
