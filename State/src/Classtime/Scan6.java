package Classtime;
import java.util.Scanner;

public class Scan6 {

	public static void main(String[] args) {
		Scanner ID = new Scanner(System.in);
		System.out.print("������ ���̵� �Է��ϼ���. >> ");
		String m = ID.next();
		
		Scanner pass = new Scanner(System.in);
		System.out.print("�н����带 �Է��ϼ���. >> ");
		String p = pass.next();
		
		System.out.printf("���̵�: %s, �н�����: %s",m,p);
		ID.close();
		pass.close();
	}

}