//������ȣ �߼� �ý��� awt6_abstract ����
/**/
public class awt6 {

	public static void main(String[] args) {
		start st = new start(); 
		// �̰� �ѹ� ���� �̻��� �� start��� ��ü�� ��� st��� �������� ���ư���!
		st.setting(); // awt �õ����� 1
	}

}

class start extends awt6_abstract {
	private String code = ""; 

	@Override
	public String getdata() {
		return this.code;
	}
	
	@Override
	public void setdata() {
		int i = 0;
		do {
			this.code += (int)(Math.random()*10);
			i++;
		} while (i < 4);

		System.out.println("������ȣ : " + this.getdata()); // ��ǻ�Ͱ� ���� ����
	}
	
}
