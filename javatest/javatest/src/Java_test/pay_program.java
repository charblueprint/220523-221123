package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll pl = new payroll();
		pl.start();
		
		int result[] = pl.check();
		System.out.println("�� ��ü�� �ݾ��� "+result[0]+"���̰�, �� �ܰ�ݾ��� "+result[1]+"���Դϴ�.");
	}

}

class payroll extends pay_abstract {
	String filename = null;
	int total =0;
	int all_money = this.money;//���� ���忡 �ִ� �ܰ�ݾ��� ������
	
	//�Ա� ��Ʈ
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int f=0; // �ݺ���
		int input =0; //�繫�� ����ڰ� �Է��ϴ� �޿�
		
		while(f<this.em_name.size()) {
			System.out.println("��ü�� �����մϴ�.["+this.em_name.get(f)+"]���� �Ա��Ͻ� �ݾ��� �Է��ϼ���. >>");
			input =sc.nextInt();
			this.total+=input; //��ü�� 
			this.all_money-=input;
			f++;
		}
	}
	
	@Override
	public void start() {
		try {
			this.filename = "C:\\javatest\\javatest\\src\\paylist.txt";
			this.db2();
			this.input_sc();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public int[] check() {
		return new int [] {this.all_money,this.total};
		//�����Ҷ� Pair ���� �������� 
		//���� : Pair�� ���� �������� �ѱ�� ����. �ǹ������� �� ���� ������ �� ���� ������ �׾ �Ⱦ�. 
	}

	@Override
	void db2() throws IOException {
		this.em_name = new ArrayList<>();
		this.fr = new FileReader(this.filename, Charset.forName("UTF8")); // �̰͵� ���� ���缭 �־�־� ��
		// System.out.println((char) this.fr.read()); //+) .getEncoding() : ���ڴ� ������ �˾Ƴ���
		// �Լ�
		BufferedReader br = new BufferedReader(fr);
		// System.out.println(br.readLine());
		String data = br.readLine();
		// �׻� �������� BufferedReader�� �ѹ� ����ϸ� ���� �� ���ʹ� ����� �Ұ����ϱ� ������ ������ String�̳�
		// ArraysList���� ��ɾ�� ������ �ֵ� ������ ������ �ؾ� �Ѵ�.
		String DD[] = data.split(",");
		int i = 0;
		while (i < DD.length) {
			this.em_name.add(DD[i]);
			i++;
		}
		br.close();

	}

}