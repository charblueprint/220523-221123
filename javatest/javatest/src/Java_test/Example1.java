package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*���빮�� */
/*����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷� �Դϴ�. 
 ���μ��� ���۽� "���ڸ� �Է��� �ּ���" �� 6���� ���ڸ� �Է¹ް� �˴ϴ�.
 �׸��� lotto.txt ����� ���� ������ �ε��Ͽ� ����ڰ� �Է��� ���� 
 ����� ���Ͽ� ��� ������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
 [�������]
 �ζ� ��� : �� 3���� ��ȣ�� ���߼̽��ϴ�.*/
//lotto.java����
public class Example1 {

	public static void main(String[] args) {
		pick PP = new pick();
		PP.ooopen();
	}
}

class pick extends lotto {
	private ArrayList<String> Number=null;

	@Override
	public void ooopen(){
		try {
			this.LLL = new LinkedList<>();
			this.Fr = new FileReader(this.URL, Charset.forName("UTF8"));

			BufferedReader Buff = new BufferedReader(Fr);
			String full = Buff.readLine();
			String custom[] = full.split(" ");

			for (int d = 0; d < custom.length; d++) {
				this.LLL.add(custom[d]); //this.LLL = ������ �Ǿ��ִ� ����
			}
			pickNum();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public LinkedList<String> tose() {
		return this.LLL;
	}
	@Override
	public void pickNum()  {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int i = 0;
		this.Number = new ArrayList<String>(); //������ ���� ����
		do {
			System.out.print("���ڸ� �Է��� �ּ���. ("+(i+1)+"��°)");
			String user =sc.next();
			this.Number.add(user);
			i++;
		} while (i < 6); //

		for(int l=0; l<this.LLL.size();l++) {			
			if(this.LLL.contains(this.Number.get(l))) {
				count++;
			}
		}
	System.out.printf("�ζ� ��� : �� %d���� ��ȣ�� ���߼̽��ϴ�",count);
	}
	

}