
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭������ : ȫ�浿, �̼���, ������ ������ �����Ͱ� �ֽ��ϴ� ���� class���� ���ڸ� �ϳ� ���� �մϴ�. ��, ���ڰ� null�̶��
		 * ���� �� ������, �迭 �����Ϳ� ���� ���� "������"�̶�� ���� ���� �ֽ��ϴ�. �ܺ� Ŭ������ : data_list �߻� Ŭ������ :
		 * v_constuct �ܺ� Ŭ���� �ȿ� ���� Ŭ���� ���� check �Դϴ�.
		 * 
		 * [��� ����] ���� class���� �������� ������ ��� ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�."��� ��� ���� class����
		 * �̼����� ������ ��� ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�." ��,Arraylist�� �迭 �ε��ؾ���.
		 */
		
		Question ques = new Question();
		ques.Q();
		//���⿡ ������ �������� �޸𸮰� Ŀ���� ���ſ���
	}

}

abstract class v_constuct {
	public abstract void input(String Input);
	String result;
}

class Question{
	public void Q() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ���. >> ");
		String search = Sc.nextLine();

		data_list DL = new data_list();
		DL.input(search);
		Sc.close();
	}
}
class data_list extends v_constuct {
	String msg[] = {"�ش� ����ڴ� �����ڰ� �ƴմϴ�.","�ش� ����ڰ� �ֽ��ϴ�.","�ٽ� �õ��ϼ���"};

	@Override
	public void input(String Input) {
		this.result = Input;
		if(this.result==null) {				
			System.out.println(msg[2]);
			Question back = new Question();
			back.Q();
		} else {
			this.result = Input;
			check ck = new check();
			ck.RESULT();
		}
		} 

	class check {
		//�θ�Ŭ�������� ���� ���� �ڽ�Ŭ������ �̰�
		String data= data_list.this.result;
		String data_list[]; //�ʵ忡 �迭�� �޴� ��ü���� (�ν��Ͻ��� �ø����� new ��ߵȴ�!)
		ArrayList<String> Arr = null; 
		public void RESULT(){
			//�ش� �ʵ忡 �ִ� Qrraylist�� �ν��Ͻ��� ����
			this.data_list =  new String[] {"ȫ�浿", "�̼���", "������"};
			this.Arr = new ArrayList<>(Arrays.asList(this.data_list));
			this.compare(); //�迭�� ������ ������ ���ϴ� �޼ҵ�
		}
		public void compare(){
			int i = 0;
			boolean inform = false; //Ȯ���۾��� �ٽ��ѹ� �ϴ� ��.
			do {
				if(this.data.equals(this.Arr.get(i))) {
					inform = true;
				}
			 i++;
			}while(i<this.Arr.size());
			
			if(inform==true) {
				System.out.println(msg[1]);
			} else {
				System.out.println(msg[0]);
			}
		}
			
				
			
	

	}
}
