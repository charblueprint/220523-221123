package ClassTime0530;

public class Array1 {

	public static void main(String[] args) {
		//�迭�̶�? ������ ������ ���¸� ���մϴ�. (Array)
		//���ڷ� �ִ��� ���ڷ� �ִ���..
		/* �迭��ȣ�� ������ �����ϴ� => [], {} */
		int a[] = new int[7]; //a[] ���������� �迭���� �޴� ����
		//new int[4] : ���ڷε� 4���� �迭���� �����Ѵٰ� ����
		a[0]=5; 
		a[1]=15;
		a[2]=25;
		a[3]=35;
		// new int[�迭 ����] : �ش� ������ ���������ͺ��� ������ Ŀ����
		
		int ae = a.length;//length�� �迭�� ������ �ľ��Ҷ� ����մϴ�.
		//System.out.println(ae);
		int f;
		for(f=0;f<ae;f++) {
			System.out.println(a[f]); //a[f] : a[0]~a[4]
		}
		String user[] = new String[3];
		user[0] = "ȫ�浿";
		user[1] = "�̼���";
		user[2] = "������";
		int k = user.length;
		int w = 0;
		while(w<k) {
			System.out.println(user[w]);
			w++;
		}
		//int[] z : �迭���� �����ϰ� �ش� �����͸� ���������� �ڵ������Ͽ� ����
		//int z[] : �迭���� �����ϸ鼭 ���� 0���� �����Ͽ� ���� ������. << �ٵ� �̰� �ٲ�
		//���� �迭
		int [] z = new int [] {10,20,30,33,42,11};
		int zea = z.length;
		System.out.println(zea);
		int ww=0;
		do {
			System.out.println(z[ww]);
			ww++;
		} while(ww<zea);
		
		
		//aa[] �迭 ���� �迭���� + ���� �������� �־�� �ϴ� �������� ����. ������ ����Ǹ鼭 
		//a[] �迭 ��{}�� �νĽ�ų�� �ֵ��� ��ȭ��.
		int aa[] = {10,11,22,33,55}; //(34��°��) �̷���!
		int aea = aa.length;
		System.out.println(aea);
		int aw=0;
		while(aw<aea) {
			System.out.println(aa[aw]);
			aw++;
		}
	
	
	}

}
