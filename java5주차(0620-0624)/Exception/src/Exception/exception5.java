package Exception;

public class exception5 {

	public static void main(String[] args) { //���� : �� �ְ�, ��¸� ��
		try {
			words Wd = new words();
			String result = Wd.files("");
			System.out.println(result);
		}catch (Exception a) {
			System.out.println("�� ���� ������ �Ǿ� �ùٸ� ���� ���޹��� ����");
			/*if(a!=null) {
				System.out.println(a);				
			}*/
		} finally { // ���⿡�� ��ĥ���� �־� �߼��ϴ°�.
			try {
			words Wd2 = new words();
			String result = Wd2.files("ȫ�浿");
			System.out.println(result);
			} catch (Exception e) {
				System.exit(0);
			}
			
		}
	}

}
class words{ //���� : ���� �ް� ���� �� return
	public String files(String aa) throws Exception{
		if(aa==null||aa.equals("")) {
//			Exception EX = new Exception();
//			throw EX; //�� ���� �����ϸ� 
			throw new Exception("���� �������"); //�̷��� �ٷ� ����������
		} else {
			String msg = aa+"�� ȯ���մϴ�.";
			return msg;
		}
	}
}