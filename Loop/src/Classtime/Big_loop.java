package Classtime;

import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
		/*int i;
		int total = 0;
		for(i=1;i<=100;i++) {
			total*=i;
		}
		System.out.println(total);*/
		
		/*1~100���� ���� �����*/
		int Input;
		BigInteger Mega = new BigInteger("1"); // �հ�ġ�� ����� �ڷ��� ���� 1�� ���ʰ����� ����. ��, ""�� ������ �����ؾ� �մϴ�.
		//BigInteger : java���� ��� ������ ���� ���� �� �� �ִ� ������ �ڷ����Դϴ�.
		//���ó - �Խ��� �̿�, ÷������
		for(Input=1;Input<=10;Input++) {
			/*multiply : ��Ģ���� ���ϱ⸦ �����.
			 *add: ��Ģ���� ���ϱ⸦ �����
			 *subtract : ��Ģ���� ���⸦ �����
			 *divide : ��Ģ���� �����⸦ ����� */
			Mega = Mega.multiply(BigInteger.valueOf(Input));
		}
		System.out.println(Mega);
	}
}
