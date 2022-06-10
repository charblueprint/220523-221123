import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 구구단의 숫자를 입력하세요. >> ");
		int Num = sc.nextInt();
		
		if(Num<=0) {
			System.out.println("음수값은 구구단을 이용할 수 없습니다.");
			System.exit(0);
		} else {
			int i=1;
			do {
				System.out.printf("%d*%d=%d\n",Num,i,Num*i);
				i++;
			} while(i<=9);
		}
		sc.close();
	}

}
