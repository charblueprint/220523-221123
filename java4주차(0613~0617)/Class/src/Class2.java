
public class Class2 {

	public static void main(String[] args) {
		/*���빮��
		���� Ŭ������ �̿��Ͽ� �ڽ�Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		Ŭ������ 2������ �ֽ��ϴ�.
		�θ� Ŭ���� : mother
		�ڽ� Ŭ���� : child
		���� Ŭ�������� motherŬ������ ���� ���� ���� 30 50 
		���� �� ����
		child���� �θ� Ŭ������ �ִ� ���� �޾� �ΰ��� ���ڸ� ���� ��� ���� ����Ͻÿ�.
		*/
		mother mo = new mother();
		mo.momo(30, 50);;
		mother.child Birth= mo.new child();
		Birth.Multi();
		
	}
}
class mother{
	int Nums1,Nums2;
	public void momo(int Num1,int Num2) {
		this.Nums1 = Num1;
		this.Nums2 = Num2;
	}	
		class child{
			int A = mother.this.Nums1;
			int B = mother.this.Nums2;
			public void Multi() {
				int total = A*B;
				System.out.println("A*B="+total);
			}
		}
	
}