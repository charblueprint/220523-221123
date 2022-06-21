package Exception;
/*Exception: try,catch�� �Բ� ����� �ϰ� �˴ϴ�.(���� ó�� ����)
 -RuntimeException : Error �߻��� ����ó�� üũ�� ���� => Null,class,Arraysize
 -OtherException : ���� ó�� üũ ���� ��� ��
 <Exception�� ����>
 Arithmetic : 0���� ���� �� �߻�
 Nullpointer : Null ��ü�� ������ ��
 ClassCast : Ŭ������ ��ȯ
 NumberFormat : ���������� ��ȯ
 ArrayIndexOutOfBound : �迭 ������ �ε��� ��ȣ ����
 IOException : ����� ���� �߻� O
 Exception : ��ü ����ó�� ��Ȳ O
 */
//�迭,���,���Ͽ��� ���� ���
public class exception1 {

	public static void main(String[] args) {
		int a;
		String b="a1";
		try { // ���� ��(1)
			a= Integer.valueOf(b); //error���� : a1�̶�� �����ε�, ������ ���ڷ� ��ȯ�� a��� ���ڷ� ���Ͽ� ����(2)
		} catch (Exception e) { //�� Exception���θ� �����൵ �Ǳ�������.. �����̶� �����ϸ鼭 ���濡�� ���� ������ �˷��ֱ� ���ؼ�!
			System.out.println(e); //(3)
		} finally { //��ĥ ���+ ������ �� ó��(4)
			b = b.replaceAll("[a-z][A-Z]", "");
			a = Integer.valueOf(b); //�ٽ� ����(5)
		}
		System.out.println(a); //���� ���(6)
	}

}
