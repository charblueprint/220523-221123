package Exception;

import java.io.IOException;

public class exception4 {

	public static void main(String[] args) {
		try {
//			ex E = new ex();
//			E.loader("data"); // ���⼭ loader�� ���� ��������
			Exception exception = new Exception(); //throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ�dmf ȣ���� class return.
			throw exception; //try�� �� �������ٿ� ���� 
			
//			} catch (IOException e) {
//			System.out.println(e);
			// } catch (Exception | NumberFormatException e1) { //�̷��Ե� ���߼��� �� �� ����!
		} catch (Exception e) {
			System.out.println(e);
		}
		// IOException : FileReader,FileWriter�� ������ �ε��ϰų� �����Ҷ� / SQL ��� Ư���� ���� �����Ͽ� �����
		// ��
		// (��) Exception : �������� ���
	}

}

class ex {
	Exception ep = null;

	// IOException IO = null;
	public void loader(String a) throws Exception { // throws�� try~catch���� �ޱ����� class�� �ε���.
		//�߸��� ���� ����(�ڽ��� ������ �ڱ��� main class�� ��� �����ϴ� ��Ȳ��)
		if (a == "ok") {
			int keycode = Integer.valueOf(a); //������������, loader class ��ü���� ������ �߻�
		} else {
			System.out.println("test"); //�ش� ������ �ڽ��� �������׿� ���� ����ó���� �߸��� ���
			try {
//			} catch (Exception e) {
//				this.ep = new Exception();
//				// this.IO = new IOException();
//				throw this.ep;
			}catch (Exception e) {
				System.out.println(e.getMessage()); //�ڽ��� ������ ���Ϲ޾Ƽ� Ȯ����
				this.ep = new Exception();
				throw this.ep;
			}
		}

	}
}