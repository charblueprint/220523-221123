import java.util.Arrays;
import java.util.Scanner;

/*���빮�� #4
 <�迭 + �⺻(Ŭ����) �޼ҵ� ����>
 ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
"�б� �л� �̸��� �Է��� �ּ���?"
�� �迭 �����ʹ� 5���� �����Ǿ� ���ϴ�.
������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ�
����Ͻÿ�
����) ����ڰ� �Է��� ���� : hong kim park lee jang
��� : [hong, kim, park, lee, jang]
 
 */
public class Example4 {

	public static void main(String[] args) {

		int i;
		String list= "";
		for (i = 0; i <= 4; i++) {
			System.out.print("�б� �л� �̸��� �Է��� �ּ���?>> ");
			Scanner sc = new Scanner(System.in);
			String st = sc.next();
			list += (st + " ");
		}
			Example4 E = new Example4();
			E.student(list);
			
	}

	public void student(String R) {
		R = R.trim(); 
		/* (������) = (������).trim => �����ڸ��� ������������ */
		//�߾��� ������ �����Ϸ��� =>(������) =  (������).replace
		String user [] = R.split("\\s+");
		//split : ���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ� �Դϴ�.
		System.out.println(Arrays.toString(user));
	}

}
