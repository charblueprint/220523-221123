
public class Method6 {

	public static void main(String[] args) {
		//private�� ���� ��ü ���� ���� 2
		String userid = "hong";
		String skey = "a1234567";
		insert i = new insert();
		i.userid = "admin";
		String result = i.checks(userid,skey);
		System.out.println(result);
	}

}

class insert{
	String userid = null;
	private String key = "a1234567";// �ش� Ŭ�������� ����Ǵ� key��
	// ���� / ���밳�߽�
	public String checks(String user_id,String key) {
		String msg = null;
		if(key.equals("a1234567")) {	//�ش� Ű��(private)�� �ܺ� class���� �Ѿ���� �μ����� ��
			if(user_id.equals("hong")){ //���̵� Ȯ��
				msg = "�����͸� Ȯ�� �߿� �ֽ��ϴ�.";
			} else {
				msg = "�ش� ������ ���� Ȯ������ ���߽��ϴ�.";
			}
		} else { //�ܺ� class���� �ùٸ� Ű���� ���޵��� ���� ���
			msg = "error";
		}
		return msg; //���� ����� ���� return���� ȸ����.
	}
}