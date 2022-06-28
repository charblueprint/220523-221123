import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip = "192.168.1.117";
		int port = 9090;
		Socket sc = null;
		Scanner sn = null;
		OutputStream os=null;
		InputStream is =null;
		try {
			sc = new Socket(ip,port);
			System.out.println("������ ���ӵǾ����ϴ�.");
			for(;;) {
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			sn = new Scanner(System.in);
			System.out.print("�Է��Ͻ� ������ �����ּ��� >> ");
			String msg = sn.nextLine();
			
			os.write(msg.getBytes());
			
			byte[] data = new byte[1024];
			int n = is.read(data);
			String message = new String(data, 0, n);
			System.out.println(message);
			
			os.flush();
		}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			if(e.getMessage()!=null) {
				System.out.println("���� ���� ��ְ� �߻��Ͽ����ϴ�.");
			}
		}finally { // Ŭ���̾�Ʈ�� ���� ����� �ش� ���� �� ���� Stream, Scanner ��� ����
			try {
				sc.close();
				sn.close();
				os.close();
				is.close();
				System.out.println("����");
				
			} catch (Exception aa) {
				
			}
		}
	}

}
