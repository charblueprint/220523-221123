package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example5_2 {

	public static void main(String[] args) {
			/*
			 * ���빮�� Example5 ����
			 * �߰��ɼ� : ¦���� Ȧ������ ������ �迭�� �����ϵ��� �մϴ�.
			 */
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> ODD = new ArrayList<Integer>();
			ArrayList<Integer> even  = new ArrayList<Integer>();
			int I = 0;
			do {
				System.out.printf("���ڸ� �ϳ� �Է��� �ֽñ� �ٶ��ϴ�.(%d��°) : ",(I+1));
				try {
					Integer check = Integer.parseInt(sc.next()); //���� �˼��� �ް� �ٲٴ°���.
					if(check%2==0) {
						even.add(check);
					} else {
						ODD.add(check);
					}
				} catch (Exception e) {
					System.out.println("���ڷ� �ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
				} 
				I++;
			} while (I < 7); //������ 7��������� �ϸ� �׶��� ���ѷ��� ����������!
			Collections.sort(even);
			Collections.sort(ODD);
			System.out.println("¦�� : "+even+"\n"+"Ȧ�� : "+ODD);
			sc.close();
			System.gc();
			
			
			



	}

}
