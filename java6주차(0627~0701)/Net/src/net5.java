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
			//연결을 지속적으로 유지하기 위해서는 절대 ServerSocket를 재로드해서는 안된다.
			while (true) {
				System.out.println("연결 대기중..");
				Socket sc = ss.accept();
				System.out.println("호스트 : 통신 연결 성공");

				/* Server에서 보낸 값을 받기 위한 통로 */
				InputStream is = sc.getInputStream();
				// Client에서 보내는 값을 읽어들임

				/* Client로 받는 통로 */
				OutputStream os = sc.getOutputStream();//Client로 값을 전송

				byte data[] = new byte[1024]; // Client에서 받는 값을 byte로 받음
				int n = is.read(data); // 해당 값을 읽어들임
				String msgclient = new String(data, 0, n); // 해당 값을 배열로 확인하여 변수를 이관
				System.out.println(msgclient); // 이관된 값을 출력

				String aws = "반갑습니다."; // 서버에서 보내는 메세지
				os.write(aws.getBytes());// 클라이언트로 보내기 위한 메모리 저장
				os.flush();

				is.close();
				os.close();
				sc.close();
			}
		} catch (Exception e) {
			System.out.println("현재 서버 포트가 중복되어 서버를 강제종료합니다."); 
		}
	}

}
