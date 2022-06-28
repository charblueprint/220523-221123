import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Client 
	public static void main(String[] args) throws Exception{
		System.out.println("클라이언트");
		String ip = "127.0.0.1"; //localhost 상태
		int port = 8080;
		try {
			Socket sc = new Socket(ip,port);
			System.out.println("서버에 연결되었습니다.");
			String cmsg = "안녕하세요!";
			
			/*Client에서 Server로 보내는 통로*/
			OutputStream os = sc.getOutputStream();
			
			/*Server에서 보내는 값을 받는 통로*/
			InputStream is = sc.getInputStream();
			
			os.write(cmsg.getBytes());
			os.flush();
			
			/*Server에서 회신된 내용을 byte배열로 받은 후 출력*/
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String (data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
		} catch (Exception e) {
			System.err.println("오류가 발생하였습니다.");
		}
	}

}
