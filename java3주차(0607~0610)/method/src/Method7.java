import java.util.Arrays;

public class Method7 {
	// ������ �� �������� ��� �� : �н�����, ������(���� ���̵� �ٸ� pc�Ͻ�)

	public static void main(String[] args) {
		apink A = new apink("ȫ�浿", 25, "test@test.com", -1000);
//		A.names();
		System.out.println(A.data());
	}
}

class apink {
	// private ������ class �ʵ忡�� �����ؾ� �մϴ�.
	// String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;

	public void names() {
		if(this.nm=="ȫ�浿") {
			this.nm ="hong";	
			String e[] = this.email.split("@"); //�̸��� �߿� �̸��� ȸ�� ������ �������� ���� �迭�� ������ �۾�
			//System.out.println(Arrays.toString(e));
			this.email_cp = e[1];
		} 
	}

	public apink(String nm, int age, String email, int point) { // private�� �ȿ��� �̿����� ����
		//setter ����
		this.nm = nm;
		this.email = email;
		if (point < 0) {
			this.point = 0;
		} else {
			this.point = point;
		}
	}

	public String data() {
		names();
		return this.email_cp;
		//return this.nm;
		//<warning!> return�� �̹� ���� �Ŷ� �Ʒ��� �ƹ��͵� ���� �ȵȴ�! ���� ������ 
	}

	public int data2() {
		//getter ����
		return this.point;
	}
}