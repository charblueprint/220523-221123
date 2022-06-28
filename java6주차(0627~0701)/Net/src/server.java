import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		int port = 8009;
		ServerSocket ss = null;
		Socket sk = null;
		Scanner sr = null;
		try {
			ss = new ServerSocket(port);
			System.out.print("서버 연결 대기중..");
			for (;;) {
				sk = ss.accept();
				InputStream is = sk.getInputStream();
				OutputStream os = sk.getOutputStream();
				
				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);
				
				sr = new Scanner(System.in);
				System.out.print("입력하실 내용을 적어주세요 >> ");
				String msg = sr.nextLine();
				os.write(msg.getBytes());
				
				os.flush();
				os.close();
				is.close();
				sk.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
