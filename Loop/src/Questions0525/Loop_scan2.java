/*���빮�� #10
 * Scanner�� �Բ� While������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�*/
package Questions0525;

import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �������� �Է����ּ���^_^ (1��~18��, ���ڸ� �Է�) : ");
		int num1 = sc.nextInt();
		int i=1;
		int j;
		System.out.println("�������� ����! �������� ����! \n");
 		while (i<=9) {
 			j= num1*i;
 			System.out.printf("%d*%d=%d \t",num1,i,j);
 			i++;
 		}
 		sc.close();
	}

}
