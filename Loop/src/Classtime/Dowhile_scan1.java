package Classtime;

import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� #4 
		 * ����ڰ� �� 3���� ���ڸ� �Է��մϴ�. 3�� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		 */
		Scanner Num = new Scanner(System.in);
		int User;
		int i = 1;
		long total = 1; //long�� �Է½� ����������� ������ �߻�
		do {
			System.out.print(i + "��° ���ڸ� �Է��ϼ���. >> ");
			User = Num.nextInt();
			total *= User;
			i++;
		} while (i <= 3);
		System.out.printf("3���� ���� ������ %d�Դϴ�", total);
		Num.close();

	}

}
