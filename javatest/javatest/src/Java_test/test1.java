package Java_test;
//�̰� ��� ����Ȱ͸� �߸��� �� ���� ���� ������ ������ ������ �ѰŰ��� ��������;;
import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		process pc = new process();
		pc.menu();
	}
}

class process extends test1_abstract {
	static ArrayList<String> Subj = new ArrayList<String>();
	private String sub = "";
	private String Num = "";
	protected Scanner search=new Scanner(System.in);

	 
	public void menu() {
		Subj.add("����");
		Subj.add("����");
		Subj.add("����");
		Subj.add("����");
		Subj.add("��ȸ");
	
		while (true) {
			System.out.println("�����߰�[1], �������[2], ���񸮽�Ʈ Ȯ��[3]�� ������ �ּ���?(���ڸ�)");
			this.Num = this.search.nextLine();

			if (this.Num.equals("1")) {
				process P = new process();
				P.NUM1();
			} else if (this.Num.equals("2")) {
				process P = new process();
				P.NUM2();
			} else if (this.Num.equals("3")) {
				process P = new process();
				P.NUM3();
			} else if(this.Num.equals("����")) {
				close();
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
				menu();
			}
			
		}
	}

	@Override
	public void NUM1() {
		System.out.println("�߰��� ������� �Է��ϼ���?");
		String msg = "";
		this.sub = this.search.nextLine();
		int j = 0;
		do {
			if (Subj.get(j).equals(this.sub)) {
				msg ="�̹� ��ϵ� ������� �ֽ��ϴ�.";
			} else {
				Subj.add(this.sub);
				msg = "���������� ��� �Ǿ����ϴ�.";
			}
			j++;
		} while (j < Subj.size());
		System.out.println(msg);
		this.sub = null;
		menu();
	}

	@Override
	public void NUM2() {
		System.out.println("������ ������� �Է��ϼ���?");
		this.sub = this.search.nextLine();
		String msg = "";
		int j;
		for(j=0; j < Subj.size(); j++) {
			if (Subj.get(j).equals(this.sub)) {
				Subj.remove(this.sub);
				msg = "���������� ���� �Ǿ����ϴ�.";
			} else {
				msg = "�ش� ������� �����ϴ�.";
			}
		}
		System.out.println(msg);
		this.sub = null;
		menu();
	}

	@Override
	public void NUM3() {
		System.out.println(Subj);
		menu();
	}
	public void close() {
		search.close();
		System.exit(0);
	}

}