/* #3
  <�迭 + �⺻(Ŭ����) �޼ҵ� ����>
  product : ����, ����, ���, ��, ����, Ű��, �ٳ���, ����
  moneys : 35000,8000 4000 5500 3800 4400 11000 18900
  ��ٱ��Ͽ� �ش� ��ǰ�� ��� ��ҽ��ϴ�.
  ��,���� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�.
 
 */
public class example3 {

	public static void main(String[] args) {
		String product[] = {"����", "����", "���", "��", "����", "Ű��", "�ٳ���", "����"};
		int money[] = {35000, 8000, 4000, 5500, 3800, 4400, 11000, 18900};
		example3 basket = new example3();
		basket.Cal(product,money);
		
	}
	
	public void Cal(String P[],int M[]) {
		int A = P.length;
		int i = 0;
		int total = 0;
		
		do {
			if (!P[i].equals("���") && !P[i].equals("�ٳ���")) {
				total+=M[i];
			}
			i++;
		}while (i<A);//ũ�� ������
		System.out.println("�� ���� �ݾ� : " + (total) + "��");
	}
}

