/*���빮��#1(0602)
		 * for_in�̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�. ���α׷� ����� ������ ���� ������ �մϴ�.
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���"
		 * [���] = �ش� �޼ҵ忡�� ����� ����ؾ���
		 * ���� ����ڰ� 3���� �Է½�
		 * 3*1=3,....3*9=27 ��� �Ǿ�� ��(for������ ����)*/
/*���빮�� #2
		 �ش� �ε��� class ���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 main �޼ҵ忡�� ����ڰ� "������","���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 �������� �ԷµǾ��� ��� "ȸ�������� ����˴ϴ�."��� �޼����� ����ϰ�,
		 ���Ǿ����� �Է½� " ���Ǹ� �ϼž� ������ �˴ϴ�."��� ��µǵ��� �Ͻÿ�.
		 ��, agrees Ŭ���� �ȿ� void method 1�� �Ǵ� 2���� �����Ͽ� �ڵ带 �����Ͻÿ�.*/
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
			Scanner Num = new Scanner(System.in);
			//System.out.print("����Ͻ� ������ ���ڸ� �ϳ� �Է��� �ּ���");
			int init = Num.nextInt();
			Cal.for_in(init); //��ĳ�ʸ� ���� ���� init ���� m���� �޾Ƽ� ����ؼ� �����
			//Num.close();
			
			Scanner A = new Scanner(System.in);
			agrees L = new agrees();
			System.out.print("������ (1) / ���Ǿ��� (2)�� ���ڷ� �Է� >> ");
			int B = A.nextInt();
			L.Agrees(B);
			A.close();
	}

}

class Cal{
	public static void for_in(int m) {
		int i;
		for(i=1;i<=9;i++) {
			//System.out.printf("%d * %d = %d\n",m,i,(m*i));
		}
	}
}
class agrees {
	public void Agrees(int Ans) {
		if(Ans==1) {
			System.out.println("ȸ�������� ����˴ϴ�.");
		} else {
			System.out.println("���Ǹ� �ϼž� ������ �˴ϴ�.");
		}
	}	
}
