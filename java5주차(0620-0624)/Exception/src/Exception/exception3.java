package Exception;

import java.util.ArrayList;

//���빮��#1

/*data[] = {"hong45","lee90","kang100","park70","kima72"};
  �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
  �ش� ���� ���������� ���� ó���� ������ �߻����Ѿ� �ϸ�, ���ʰ��� ���������� �������� ������ �˴ϴ�.
  main2������ �ش�迭 ���� ���� �� �ش� ������ ��� �ջ� �� ����� ���;� �˴ϴ�. 
  ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� main2�޼ҵ�� �ٽ� ȣ���Ͽ� �������� �����Ͱ� �������� �Ͻʽÿ�.
 */

public class exception3 {

	public static void main(String[] args) {
		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		exception3 e3 = new exception3();
		
			try {
				e3.main2(data);
			} catch (Exception e) {
				System.out.println(e); // System.out.println(e); �� ���´� e.toString()�� �Ȱ���!
			} finally {
				ArrayList<String> AR = new ArrayList<String>();
				int j=0;
				String modify; // �̰� ��������
				do {
					modify= data[j].replaceAll("[a-z][A-Z]", "");
					AR.add(modify);
					j++;
				} while (j<data.length);
				String Data[] = new String [AR.size()];
				int l=0;
				while(l<AR.size()) {
					Data[l] = AR.get(l);
					l++;
				}
				try {
					e3.main2(Data);
				} catch (Exception e2) {
					if(e2.getMessage()==null) {
						System.exit(0);
					} else {
						System.out.println(e2.getMessage());
					}
					//printStackTrace()�� ������ �� �� ����. ��� �ٿ��� ������ ������ ����ϴ� �Լ��ε� �̰� ���� ���ѷ��� �ɸ��� �� �޼����� ������ ���� ������ �ɷ� ������.
//					System.out.println(e2.getMessage()); //���� .getMessage() ����
				}
			}
	}

	public void main2(String data[]) throws Exception{
		int i=0;
		int vaild;
		int total=0;
		do {
			vaild = Integer.valueOf(data[i]);
			total += vaild;
			i++;
		}while(i<data.length);
		System.out.println(total);
		Exception ck = new Exception();
		throw ck;
	}
}
