
public class Method13 {

	public static void main(String[] args) {
		//extends : inherit(���)
		/*
		 ���� �θ� Ŭ������ construct �κп� �μ����� �����ϸ�
		 �ڽ� Ŭ�������� �ε带 ���ϴ� ������ �߻���.
		 ��, �ڽ� Ŭ�������� �μ����� �����Ͽ� construct�� ����� ���� ����
		 */
		math1 m1 = new math1();
		math2 m2 = new math2(50);
	}

}
class math1{
	public int no;
	public math1(){
		this.no=20;
		System.out.println("math1");
	}
} class math2 extends math1{ //�ڽ� Ŭ�������� ������ ��
	public math2(int z) {
		this.no=20;
		System.out.println("math2");
	}
}