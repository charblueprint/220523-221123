/*0609 ������*/
import java.util.Scanner;

public class Score1 {
	public static void main(String[] args) {
		String[] msg = {"�˻��� ������ �л����� �Է��� �ּ���? >> ",
				"�˻��� ����[��ü/����/����/����/����] >> ","�˻������� �л��� : ","���������� : ","�ش� ����ڴ� �������� �ʽ��ϴ�."};
		// ����� ���� �Է� �� ��� ���� ���
		//System.gc();//=>�������� ������ �ݷ����� ���� ������ �ֱ� ���� ���鼭 �� ���� ��.
		//���� ��Ű���� ���� ������ �ؾ��Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print(msg[0]);
		String name = sc.next();
		String realname = name.replace(" ", "");
		Score2 d = new Score2();
		d.datas(realname,null);//������ ��
		
		String result = d.datas();//�޴� ��
		if(result=="true") {
			System.out.println(msg[1]);
			String subject = sc.next();
			String realsubject = subject.replace(" ", "");
			d.datas(realname, realsubject);
			String score = d.datas();
			
			if(realsubject.equals("��ü")) {
				String score2[] = score.split(",");
				System.out.printf("%s %s\n%s ����:%s ����:%s ����:%s ����:%s ",
						msg[2],realname,msg[3],score2[0],score2[1],score2[2],score2[3]);
				
			} else {
				System.out.println(msg[2]+realname+"\n"+msg[3]+realsubject+" "+score);
			}
		}
		else {
			System.out.println(msg[4]);
			System.exit(0); //0:�������� 1:��������
		}
		sc.close();
		System.gc();
	}
	
	}
