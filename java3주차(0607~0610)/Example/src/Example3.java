
public class Example3 {

	public static void main(String[] args) {
		inherit2 ih2 = new inherit2();
		ih2.it("ȫ�浿", "aaa5");
		ih2.print();
	}

}
class inherit1{
	private String nm; //inherit1 �ش� �κп����� �۵�
	protected String pw; //�ٵ� pw�� protected�� �����Ǿ� ����(�� ���)�� �ȴٸ� ����� ��밡��
	//inherit1, inherit2��� �۵� �ǵ��� �ϸ�, �ܺο��� �ε� ����
	public String aa; //private���� ���� �κ��� inherit2������ ����� �� �ֵ��� �ϱ� ����
	
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
		aa = this.nm;
	}
}
class inherit2 extends inherit1{
	public void print() {
		System.out.println(this.aa+""+this.pw); //this.nm�� �翬�� ����
	}
}