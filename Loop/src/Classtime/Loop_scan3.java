/*���빮�� #11
  Scanner�� �Բ� Do-While������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ� */
package Classtime;

import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �������� �Է����ּ���^_^ (1��~18��, ���ڸ� �Է�) : ");
		int num1 = sc.nextInt();
		int i = 1;
		int j;
		System.out.println("�������� ����! �������� ����!");
		do {
			j = num1 * i;
			System.out.printf("%d*%d=%d \t", num1, i, j);
			i++;
		} while (i <= 9);
		sc.close();
	}

}