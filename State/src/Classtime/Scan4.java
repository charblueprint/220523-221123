package Classtime;
import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��� ������ �����ּ��� >> ");
		//String text = sc.next();
		//next() : �����̽��� �Է±����� ����
		//nextLine() : �����̽��� ���� ��� �Է�����
		String text =sc.nextLine(); 
		System.out.print(text);
		
		sc.close(); // scanner ���Ḧ �⺻���� �������־�� �մϴ�.
		
		String ID = "park"; // String + ���� = %s
		short age = 25;		// ���� = %d
		/* [�߿����]  
		 	%f : float,double
		 	%t : date, time �ð�,��¥
		 	%b : boolean (true,false)
		 */
		
		
		//System.out.println(ID + "���� ���̴� "+ID+"�Դϴ�.");
		//printf : f��� ���� format�� ���մϴ�.
		System.out.println();
		System.out.printf("%s���� ���̴� %s�Դϴ�.",ID,age);
		//
		
	}

}
