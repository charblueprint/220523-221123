import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
//java "C:\java6\Net\src\chat_client.java"

public class chat_client {

	public static void main(String[] args) throws Exception {
		String ip = "127.0.0.1";
		Scanner sc = null;
		int port = 9090;
		String myid = null;

		try {
			sc = new Scanner(System.in);
			System.out.println("[�������� ����Ͻ� ���̵� �Է��� �ּ���] >> ");
			myid = sc.nextLine();
			System.out.println("<��Ī ��� ��...>");

			int i = 0;
			Socket sk = new Socket(ip, port);
			OutputStream os = sk.getOutputStream();
			InputStream is = sk.getInputStream();
			String notice = myid + "���� �����ϼ̽��ϴ�.";
			os.write(notice.getBytes());
			os.flush();
			//os.close(); �� OutputStream,InputStream 
			
			while (true) {
				sc = new Scanner(System.in);
				System.out.println("������ �Է��� �ּ���");
				String sendMessage = myid + " : " + sc.nextLine();
				String word = sc.nextLine().intern();
				if(word=="exit") {
					
				}
				os.write(sendMessage.getBytes());
				os.flush();

				byte[] data = new byte[1024];
				int n = is.read(data);
				String getMessage = new String(data, 0, n);
				System.out.println(getMessage);

				os.close();
				is.close();
				sk.close();
				sc.close();
			}
		} catch (Exception e) {

		}

	}

}
