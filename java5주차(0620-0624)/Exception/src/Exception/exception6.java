package Exception;

public class exception6 {
/*���빮�� ����ڰ� 45*3+16+5+22*8 �ش� ���갪�� �������� �ܺ�Ŭ������ �����մϴ�. 
 �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ� Ȧ���� ��� �������� ������ �ٽ� ȸ�ŵǵ��� �մϴ�.
 Ȧ���� ��� "Ȧ�����Դϴ�."�� �ٽ� ȸ�ŵǵ��� �մϴ�.
 ¦���� ��� "����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�." ���*/
	public static void main(String[] args) throws Exception{
		int A = 45*3+16+5+22*8;
		Cal Ca = new Cal();
		Ca.name(Integer.valueOf(A));
		
		String result = Ca.name();
	}
}
class Cal {
	 protected String msg = "";
	 public String name(Integer integer) throws Exception{
		try {
			if(Integer.valueOf(integer)%2==0) {
				
			} 
		} catch (Exception e) {
			System.out.println("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�.");
		} finally {
			
		}
		return this.msg;
	}
 }