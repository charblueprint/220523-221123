import java.util.Arrays;

/*#2
 <�迭 + �⺻(Ŭ����) �޼ҵ� ����>
 product : ����, ����, ���,��,����, Ű��, �ٳ���, ����
 �� ����, ��, Ű���� ������.
 �ش� ������ �迭 �� �ٽ� �� ����Ʈ�ϴ� �ڵ带 �ۼ��Ͻÿ�.
 ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ�
 �ݺ����� ����
 ��� : [����,���,����,�ٳ���,����]*/
public class Example2 {

	public static void main(String[] args) {
		String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		Example2 I = new Example2();
		I.P(product);
		
	}
	
	
	public void P(String product[]) {
		int i = 0;
		int j = 0;
		boolean yes = false;
		String item[] = new String[j];
		do { 
			do {
				if(!product.equals("����")&&!product.equals("��")||!product.equals("Ű��")) {
					product[i]=item[j];
				}
				yes = true;
				j++;
			}while(j<item.length);
			i++;
		} while(i<product.length);
		System.out.println(Arrays.toString(item));
		
		//System.out.println(product[1]);
	}

}
