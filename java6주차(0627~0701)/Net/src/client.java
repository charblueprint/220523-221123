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
			System.out.println("서버에 접속되었습니다.");
			for(;;) {
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			sn = new Scanner(System.in);
			System.out.print("입력하실 내용을 적어주세요 >> ");
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
				System.out.println("현재 접속 장애가 발생하였습니다.");
			}
		}finally { // 클라이언트가 접속 종료시 해당 소켓 및 각종 Stream, Scanner 모두 종료
			try {
				sc.close();
				sn.close();
				os.close();
				is.close();
				System.out.println("종료");
				
			} catch (Exception aa) {
				
			}
		}
	}

}
