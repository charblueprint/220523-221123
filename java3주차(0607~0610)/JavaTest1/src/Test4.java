import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �������� ���ڸ� �Է��ϼ���. >> ");
		int Num = sc.nextInt();
		
		if(Num<=0) {
			System.out.println("�������� �������� �̿��� �� �����ϴ�.");
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
