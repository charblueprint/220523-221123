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
		System.out.println("이체를 시작합니다.");
		Scanner sc = new Scanner(System.in);
		int i=0;
		int total = 0;
		do {
			System.out.print(test2_interface.memberinfo[i]+"님에게 이체하실 금액을 입력해 주세요.>> ");
			this.amount = sc.nextInt();
			total+=this.amount;
			i++;
		}while(i<test2_interface.memberinfo.length);
		
		int result =  test2_interface.money - total;
		
		System.out.println("총 이체한 금액은 "+total+"원이고, 총 잔고금액은 "+result+"원입니다.");
		sc.close();
	}
 }