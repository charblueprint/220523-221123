package Javaclass;

public class DataType {

	public static void main(String[] args) {
		String a = "1234";
		//String : ""�� ��� ��μ� ���ڷ� �ν�. �׷��ϱ� ���ڷ� �ν��ϰ� �Ϸ��� "����" �̷��� �����.
		System.out.println(a);
		
		/* ������ */
		byte b = 100;  // byte : ����=(-128~+127)
		System.out.println(b);
		
		short c = 30000; // short : ����=(-32,768~+32,767)
		System.out.println(c);
		
		int d = 1; // int : ����=(-2,147,483,638~+2,147,483,647)
		System.out.println(d);
		
		long f = 99999999999L;
		/* long�� ���ؼ� �����ڸ�
		 * �갡 �ڷ��� �߿� ���� ū ������.. 
		 * �ֳĸ� ������ -9,223,372,036,854,775,808~+9,223,372,036,854,775,807 �ŵ�.
		 * �׷��� �ַ� ��迡�� ���δٰ� ��.
		 * �׸��� �⺻ �޸� �Ҵ翡�� �߰� ����� ���� ������ �þ.
		 * �߰��� ����ó�� L ���̸� �޸� �뷮 �� ũ�� ����! int�� 4�� �̻��̶�� �Ͻ�.
		 */
		System.out.println(f);
	
		/* �Ǽ��� */
		float x = 3.5f; 
		/* float : -3.402932347e+38 ~ +3.40292347e+38
		 * �Ǽ� �ڿ� f�� '������' �ٿ�����
		 * �Ҽ��� ���� ���ðŰ��� ������ float ����
		 */
		System.out.println(x);
		
		double y = 44.5; 
		/* double : -1.797693...+308 ~ 1.797693...+308 
		 * d ���̴� ���� �������
		 * �Ҽ��� ���� ���ð� ���� ���� double ����ϱ�
		 */
		System.out.println(y);
	}

}
