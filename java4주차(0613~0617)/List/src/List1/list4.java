package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer Num1[] = {3,6,9,12,15};
		LinkedList<Integer> Ln = new LinkedList<>(Arrays.asList(Num1)); 
		//Arraylist���� LinkedList�� �ε� �ӵ��� ����� �ӵ��� �� ����. �ٵ� ������ �����̳� ������ ���� LinkedList�� �� �����ٴ� ��
		System.out.println(Ln);
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>(); // �� �迭 ����
		String user;
		//for(;;){} / do{}while(true); => ���ѷ��� 
		while(true) { //���ѷ���
			System.out.println("���ڸ� �Է��ϼ���");
			user = sc.next();
			try { // ����ڰ� �Է��� ���� ������ �ִ� �� Ȯ���ϴ� ��Ʈ
				int number = Integer.parseInt(user);
				list.add(number);
				int i = list.size();
				if(i>=6) { break;} // 5������ �迭�� �ԷµǸ� ���ѷ����� ��������
			} catch (Exception e) { //������ �߻��Ͽ��� ��� �۵��Ǵ� ��Ʈ
				System.out.println("�̰� �ǰڳ� ���ڷ� �ٽ� �Է��ϼ�");
			}
			System.out.println(list);
		}
	}

}
