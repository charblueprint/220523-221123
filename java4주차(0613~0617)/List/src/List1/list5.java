package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*���빮�� #5*/
		/*����ڰ� ���ڱݾ��� �Է��մϴ�.
		 �ش� ���� �ݾ�Ƚ���� �� 8���Դϴ�.
		 0~n���� �Է� �����ϸ� �ش��Է��� ��� ������ �����հ� �ݾ��� ����Ͻÿ�.
		 ����) �Ա��� �ݾ��� �Է��ϼ���
		 500 600 500 400 200 100 50 50
		 ���) �� �Ա� �ݾ��� : 2400�Դϴ�.
		 */
		String msg[]= {"�Ա��� �ݾ��� �Է��ϼ���>> ","'��'�� �����Ͽ� �ٽ� �Է����ּ���\n"
				+ "(���ڸ� �Է�)","�� �Ա� �ݾ��� ","���Դϴ�."};
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> data= new LinkedList<>();
		String input;
		
		int total = 0;
		do {
			System.out.println(msg[0]);
			input = sc.next();
			try {
				int i = data.size();
				int input2 = Integer.parseInt(input);
				data.add(input2);
				total+= data.get(i); 
				if(i>=8) {
					System.out.println(data+"\n"+msg[2]+total+msg[3]); 
					break;
				}
				}
			catch (Exception e) {
				System.out.println(msg[1]);
			}
		} while (true); 
		
			
	}
}

