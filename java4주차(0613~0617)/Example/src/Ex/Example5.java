package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� ���� ���ڸ� �Է��մϴ�. ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ���մϴ�. �� ���� �Է��� 7���̸�,����ڰ�
		 * �Է��� ���ڸ� ������ ������ ���� �մϴ�. "���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ� : " 7��
		 * �߰��ɼ� : ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ARR = new ArrayList<Integer>();
		int I = 0;
		do {
			System.out.printf("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.(%d��°) : ",(I+1));
			try {
				Integer check = Integer.parseInt(sc.next()); //���� �˼��� �ް� �ٲٴ°���. 
				ARR.add(check);
			} catch (Exception e) {
				System.out.println("���ڷ� �ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
			} 
			I++;
		} while (I < 7); //������ 7��������� �ϸ� �׶��� ���ѷ��� ����������!
		Collections.sort(ARR);
		
		
		
		

	}
}
