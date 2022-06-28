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
			System.out.println("[서버에서 사용하실 아이디를 입력해 주세요] >> ");
			myid = sc.nextLine();
			System.out.println("<매칭 대기 중...>");

			int i = 0;
			Socket sk = new Socket(ip, port);
			OutputStream os = sk.getOutputStream();
			InputStream is = sk.getInputStream();
			String notice = myid + "님이 입장하셨습니다.";
			os.write(notice.getBytes());
			os.flush();
			//os.close(); 는 OutputStream,InputStream 
			
			while (true) {
				sc = new Scanner(System.in);
				System.out.println("내용을 입력해 주세요");
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
