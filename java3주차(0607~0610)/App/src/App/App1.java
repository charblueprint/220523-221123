/*���빮�� <����������Ʈ>
�������� ���� �����Ͱ� �����մϴ�.
���α׷� ����� �ش� ����� �̸��� �Է��մϴ�.
�ش� ���� ������ �� ����� �̸��� ������ �����͸� ��µǵ��� �մϴ�.

[���μ��� ���� ���]
�˻��� ������ �л����� �Է��� �ּ���? ȫ�浿
�˻��� ���� ���� [��ü] ? ��ü
�˻������� �л��� : ȫ�浿
���������� : ����:55 ����:60 ����:77 ����:90

������ �� String Grade[][]=~
{
{"������","�̰���","���","������","������"},
{"80","78","92","67","40"},
{"40","80","80","92","100"},
{"95","30","55","90","65"},
{"20","80","100","95","30"}
};
A��Ʈ :  
����ڰ� �ش������� �Է��� �� �ִ� ���μ����� �����ϰ�, ������� ���� return�޾Ƽ� ó���ؾ� �մϴ�.
��, �ش� �����Ϳ� ���� ����ڸ� �Է��� ��� �����͸� ã�� ���߽��ϴ�.��� �ԷµǾ�� �մϴ�.
���� ������ ��ü�� �Է��� ��� ����~������� 
��� ����մϴ�. �ش� Ư�� ������ �Է��� ��� �ش� ���� ������ ��� �ǵ��� �մϴ�.


*/
package App;

import java.util.Scanner;

public class App1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ������ �л����� �Է��� �ּ���? >>");
		String name = sc.next();
		String realname = name.replace(" ", "");
		
		App.App2 A =new App.App2();
		A.sdatas(realname,null);//���� ���� �˻��ϰ���� �̸� ������
		String result = A.datas();
		
		
		String msg = "�˻������� �л��� : ";
		String msg2 = "���������� : ";
		if(result=="true") {
			System.out.print("�˻��� ���� ����? >> ");
			String subject = sc.next();
			String realsubject = subject.replace(" ", "");
			A.sdatas(realname, realsubject); //�̸�, ������� ���� �ѱ�
			String answer = A.datas(); //���� ����
			
			if(subject.equals("��ü")) {
				String S[]= answer.split(",");
				System.out.println(msg + realname);
				System.out.printf("%s����:%s ����:%s ����:%s ����:%s",msg2,S[0],S[1],S[2],S[3]);
			} else {
				System.out.println(msg + realname);
				System.out.println(msg2 + realsubject + " " + answer);
			}
		} else if(result=="false") {
			System.out.println("�����͸� ã�� ���߽��ϴ�.");
			System.exit(0);
		} 
		

//		name=null;
//		sc.close(); //�˻�â �ʱ�ȭ �� ����
//		
	}
	
}

	
	
	

	
	
