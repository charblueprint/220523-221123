
public class Method10 {
	//���ڿ� ���Խ� �ڵ�
	public static void main(String[] args) {
		//getter setter ��� ����ؼ� ���� ���� ����!
		/*setter : ����ڰ� �Է��� �� �Ǵ� ���İ� �� �����ϴ� �޼ҵ�
		  getter : ������ ��ģ �� return���� ���� ������ �޼ҵ�*/
		met m = new met();
		m.setUser_name("ȫ�浿");
		m.setUser_pass("a123456");
		m.setUser_email("hong1234@gmail.com");
//		System.out.println(m.getUser_name());
//		System.out.println(m.getUser_pass());
//		System.out.println(m.getUser_email());
		
		//replace : ġȯ������ �Լ��Դϴ�. 
		//replaceAll : replace���� ���� ������ ġȯ������ �Լ�
		//���� ������ replace�� replaceAll�� �����ߴٰ� �ϴµ� �ֱ� ���������� �� �� ȥ���Ѵ� ��
		String str = "ȫ�浿�� ȯ���մϴ�.";
		String str2 = str.replace("��", "����"); 
		// trim ��ﳪ��? �´� �����ڸ��� �ٲٰ� ��� �߰��� �ٲٰ�
		System.out.println(str2);
		
		String nm = "ȫ �� ��";
		String rnm = nm.replace(" ", ""); //���� ���ִ� ġƮŰ
		System.out.println(rnm);
		String nm2 = "�ڹٰ� ��¥ ����� ��ƿ�";
		String rnm2= nm2.replaceAll("�ڹ�", "java");
		System.out.println(rnm2);
	}

}
class met{
	private String user_name;
	private String user_pass;
	private String user_email;
	
	public String getUser_name() {
		return this.user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return this.user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_email() {
		return this.user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
}