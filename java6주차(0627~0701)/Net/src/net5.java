import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class net5 {
	// server
	public static void main(String[] args) {
		System.out.println("Server Connect");
		int port = 8080;
		String msg = "Connect Success!!";

		try {
			ServerSocket ss = new ServerSocket(port);
			//������ ���������� �����ϱ� ���ؼ��� ���� ServerSocket�� ��ε��ؼ��� �ȵȴ�.
			while (true) {
				System.out.println("���� �����..");
				Socket sc = ss.accept();
				System.out.println("ȣ��Ʈ : ��� ���� ����");

				/* Server���� ���� ���� �ޱ� ���� ��� */
				InputStream is = sc.getInputStream();
				// Client���� ������ ���� �о����

				/* Client�� �޴� ��� */
				OutputStream os = sc.getOutputStream();//Client�� ���� ����

				byte data[] = new byte[1024]; // Client���� �޴� ���� byte�� ����
				int n = is.read(data); // �ش� ���� �о����
				String msgclient = new String(data, 0, n); // �ش� ���� �迭�� Ȯ���Ͽ� ������ �̰�
				System.out.println(msgclient); // �̰��� ���� ���

				String aws = "�ݰ����ϴ�."; // �������� ������ �޼���
				os.write(aws.getBytes());// Ŭ���̾�Ʈ�� ������ ���� �޸� ����
				os.flush();

				is.close();
				os.close();
				sc.close();
			}
		} catch (Exception e) {
			System.out.println("���� ���� ��Ʈ�� �ߺ��Ǿ� ������ ���������մϴ�."); 
		}
	}

}
