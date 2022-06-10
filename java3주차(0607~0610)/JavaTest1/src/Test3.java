import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("60이하의 숫자를 입력하세요. >> ");
		int user = sc.nextInt();
		
		String msg = "해당 숫자는 ";
		
		if(user>60) {
			System.out.println("해당 숫자는 60까지만 입력이 되어야 합니다.");
		} else  {
			if(user%2==0) {
				System.out.println(msg+"짝수입니다.");
			} else {
				System.out.println(msg+"홀수입니다.");
			}
		}
		sc.close();
	}

}
