package Classtime;

public class While2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		int c ;
		while (a<=9) {
			c=b*a; //�������
			System.out.println(c + " ");
			a++; 
			/*��ġ�� ���� ���� �޶���;; 
			c=b*a; ���� ���� ������ 
			9������ a���� a�� �ƴ϶� a++�� �����ϰ� ����Ѵ� �����ϸ� ��.
			��ġ����....!
			*/
		}
	}

}
