package Ab;
//method_1a.java
public class method_1 extends ide_mth1 {
//package Ab2���� import �� �� �ֵ��� �ϸ�, �ܺ� Ŭ������ �����ϰ� ��� �������� ��.
//���� ide_mth1�� �ܺ� Ŭ������ �׳��� �ܺο��� ������� ���ϴµ� public class�� ����ϸ� �� �� �ִ�!!(�׸��� public class�� �ѹ��ۿ� ���� ����)
/* Arrays.sort() : �迭 �������� ����(����,�ѱ�,����)
 ��, ������ ��� �빮�ڰ� ���� ���� ������������ ���� �˴ϴ�.*/
	public void recall() {
		System.out.println("Test");
	} public void name() {
		System.out.println("ȫ�浿");
	}
	//protected ��� ����������
	public static void main(String[] args) {
//		int number_data[] = {5,7,1,4,9,2};
//		Arrays.sort(number_data); //���� �������� ����
		/*String user_data[]= {"ȫ�浿","�̼���","�庸��","������"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));*/
		
		ide_mth1 imt1 = new ide_mth1();
		String a= "seo"; int b = 2000;
		imt1.setter(a, b);
		
		System.out.println(imt1.getter());
		
		/*������ 2�� �����ؼ� �ϳ��� ����, ����
		 ���� ���Ե� ����ڿ� ���̵� Ȯ�� �� �ش� ����Ʈ�� ���� �ǵ��� �մϴ�.
		 ��, �⺻ ����Ʈ + ������ ����Ʈ�� ���� ����� ����ϼž� �մϴ�.
		 ����� main class���� �����.
		 �迭 ������  : String membership[][]={
		 {"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
		 {"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
		 */
	}
}
class ide_mth1 extends mth1{
	protected String data1;
	protected int data2;
	private int result=0;
	private String membership[][];
	
	public ide_mth1() {
		this.membership = new String[][] {{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
			 {"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
	}
	@Override
	public void setter(String data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
		int i = 0;
		do {
			if(this.membership[0][i].equals(this.data1));{
				this.result = Integer.parseInt(this.membership[1][i],10) + this.data2;
			}
			i++;
		} while (i<this.membership[0].length);
		
	}

	@Override
	public void setter(int data3[]){} //�Ⱦ�����

	@Override
	public String getter() {
		String msg = this.data1+"���� ���� ����Ʈ�� "+this.result+"���Դϴ�.";
		return msg;
	}
}