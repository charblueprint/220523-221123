//(0602) ������
public class Class3 {

	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		//double->int ��ȯ
		double a = 1.37;
		int b = (int) a;
		
		//int -> double ��ȯ
		int c = 35;
		double d = (double) c;
		System.out.println(d);
		
		//String->int ��ȯ
		String x = "35";
		String y = "156";
		//int z = Integer.parseInt(x); // parseInt (int���� ����ϴ� ������� �����)
		int z = Integer.valueOf(x); //valueOf Ŭ���� �޼ҵ�(�޼ҵ��Լ�) ->(����) parseInt 
		int total = Integer.parseInt(x)+ Integer.parseInt(y); //�������� ���ڷ� ��ȯ�Ͽ� �������� ó����
		System.out.println(total);
		
		//Long ���� Long.parseLong �����.
		String j = "999996789";
		String j2 = "999997899";
		//int total2= Integer.parseInt(j)+Integer.parseInt(j2);
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3= (double) total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//���� (char)-> ����(String) : �⺻ ���ĸ� ����
		char part = '��';
		String f = String.valueOf(part); // ���� -> ���� ��ȯ �Լ�. valueOf�� ���! 
		System.out.println(f);
		
		
		
	}

}
