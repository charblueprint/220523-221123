package Exception;

public class exception2 {

	public static void main(String[] args) {
		
		try {
			//test(); // �޼ҵ� ȣ���� �����ؾ� �մϴ�. �ֳ�, ������ error�� �׳� ȣ���� ������ Exception�� ���谡 ���� ����
			exception2 e2 = new exception2();
			String a = "ȫ�浿";
			e2.test(a);
		} catch (Exception z) {
			System.out.println(z);
		}
	}
	public void test(String b) throws Exception,NumberFormatException{ //�� throw�� ������ ������ �ѵ� �� testŬ�������� ������ ������.. �׳� ����
		//throws�� main �޼ҵ忡�� ���� ó�� ���� �ش�޼ҵ带 ȣ���� ��츦 ���� ���� ����մϴ�.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;	
		//�ڵ� �� �ؿ� ����� �ϸ� throw = return�� ����� ������ ������ �ֽ��ϴ�.
		//����ó�� ����� ���� ���� main�޼ҵ�� �ٽ� return��Ŵ
	}

}
