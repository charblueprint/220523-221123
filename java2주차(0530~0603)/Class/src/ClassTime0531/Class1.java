package ClassTime0531;


public class Class1 { //���� Ŭ����

	public static void main(String[] args) { // �Ϲ� main�Լ�
		Adata a = new Adata(); //��Adata Class ���� �ε��
		Bdata b = new Bdata(); // Bdata Class ���� �ε�
		System.out.println(a.aa); //Adata Class�ȿ� aa��� ���� �ڷ��� ��ü���� ������
		System.out.println(b.aa); //Bdata Class�ȿ� aa��� ���� �ڷ��� ��ü���� ������
		
		Cdata c = new Cdata();
		/*Cdata ���� ���� �ڷ����� ������. => ���� �⺻�Լ��� ���� �Է��� �� ��ü���� �޾� ��������� ���(�ν��Ͻ� ����)*/
		c.aa =10;
		c.bb= 30;
		System.out.println(c.bb);
		//System.out.println(c.cc);
	}
}

//aa�� ������ �ٸ� Ŭ������ �ֱ� ������ �ߺ����� �ʽ��ϴ�.
class Adata{ //�μ�Ŭ����
	String aa = "ȫ�浿";
	

}
class Bdata{
	String aa = "�̼���";
}
class Cdata{
	//�ش� Cdata�� �ִ� Ŭ�������� �ڷ����� ���� ������ �����մϴ�.
	//��, �������� �Լ��� ���� ��Ȳ�̹Ƿ� ���� �Ǵ� sysout�� ������� ����
	int aa; 
	int bb;
	//int cc = aa + bb;
}