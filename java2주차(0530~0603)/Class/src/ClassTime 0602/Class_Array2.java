import java.util.Random;
import java.util.Scanner;

public class Class_Array2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~10���� ���ڸ� �ϳ� �Է��ϼ���.");
		int no = sc.nextInt();
		memorys m = new memorys(); // �� ���� �ǹ̴� �ϴ� ����� �� �����͸� �����ϰ� ���� �̰���. �ٵ� �޸𸮰� ��û ����... ���ľ߰���?
	
		/*
		memorys m =null;
		m = new memorys();
		*/
		//m.ms();
		m=null; //m�� �޸𸮸� ����! �ƿ� ������ �ִ� ������// �ش��ν��s���� ���

		m = new memorys();
		m.rd();
	}

}

class memorys{
	public void ms(int user) {
		//Math.random() ���� �޼ҵ� ����  �⺻�� �ڷ��� double�Դϴ�.
		
		//random=> ������ȣ, �����ڵ�, �ζ�, �α���, ��÷ ���
		double a = Math.random(); //0.0~1.0 
		int b = (int)(Math.random()*9)+1; //�⺻(*10) : 0~9 , *10+1 : 1~10 
		// double-> int ����
		int i = 0;
		while(i<=10) {
			//System.out.printf("%d",b);
			i++;
		}
		
		/*
		 * if(user==b) { //������ ������ ���ô�.
			System.out.println("��÷!");
		} else {
			System.out.println("������ȸ��");
		}
		 * */

	public void rd() {
		Random r= new Random();	//Random ��ü ���� �� �ν��Ͻ� ����
		int i = 0;
		while(i<=6) {
			System.out.println(r.nextInt(45)+1); //0~9���� r.nextInt()�� ����
			i++;
		}
		//r=null; //�ݺ��������� ���� �ȵȴ�!
		
	}
}