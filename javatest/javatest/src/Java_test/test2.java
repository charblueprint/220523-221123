package Java_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args)  {
		bank Ban = new bank();
		Ban.member();
	}
}
 class bank implements test2_interface{
	private int amount=0;
	@Override
	public void member() {
		System.out.println("��ü�� �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		int i=0;
		int total = 0;
		do {
			System.out.print(test2_interface.memberinfo[i]+"�Կ��� ��ü�Ͻ� �ݾ��� �Է��� �ּ���.>> ");
			this.amount = sc.nextInt();
			total+=this.amount;
			i++;
		}while(i<test2_interface.memberinfo.length);
		
		int result =  test2_interface.money - total;
		
		System.out.println("�� ��ü�� �ݾ��� "+total+"���̰�, �� �ܰ�ݾ��� "+result+"���Դϴ�.");
		sc.close();
	}
 }