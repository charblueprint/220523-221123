package Classtime;

import java.util.Scanner;

public class Loop_scan1 {

	public static void main(String... args) {
		//for�� + Scanner
		
		Scanner sc = new Scanner(System.in);// �Է¿��� �ε�
		System.out.print("���Ͻô� ������ ���ڸ� �Է��ϼ���.(1��~9��) : "); //��������
		int num= sc.nextInt(); //����ڰ� �Է��� ����
		int i;//�ݺ����� ����ϴ� ����
		int j;//�ݺ����� ������� �����
		for(i=1;i<=9;i++) {
			j = num*i;//�������
			System.out.printf("%d ",j);//���
		}
		sc.close();//����
		
	}

}

