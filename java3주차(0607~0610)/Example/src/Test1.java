import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner inform = new Scanner(System.in);
		System.out.print("주소를 입력하세요>> ");
		String address = inform.nextLine();
		String realaddress= address.replace(" ", " ");
		
		Scanner inform2 = new Scanner(System.in);
		System.out.print("전화번호를 입력하세요(-포함 입력)>> ");
		String phone = inform2.next();
		String realphone = phone.replace("-", "-");
		
		System.out.print("\n[해당정보를 확인해 주세요]\n"+"주소:"+realaddress);
		System.out.printf("\n전화번호:%s",realphone);
		inform.close();
		inform2.close();
	}

}
