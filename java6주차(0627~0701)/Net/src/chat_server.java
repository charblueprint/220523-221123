import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//java "C:\java6\Net\src\chat_server.java"
/*1:1 채팅 프로그램*/
/* 포트 9090
[Server]
"서버에서 사용하실 아이디를 입력해주세요"
대기중...
홍길동 : 반갑습니다.
"내용을 입력해 주세요:" 어서오세요~
"홍길동님이 퇴장하셨습니다.

[Client]
"채팅에 사용하실 아이디를 입력해 주세요"
홍길동
"내용을 입력해 주세요:" 반갑습니다
유관순 : 어서오세요~
"내용을 입력해 주세요:" exit
"채팅이 종료 되었습니다."
*/
public class chat_server {

	public static void main(String[] args) throws IOException {
		Socket sk = null;
		ServerSocket ss = null;
		Scanner sr = null;
		int port = 9090;
		String msg = null;

		nickname2 nnm = new nickname2();
		nnm.setName();
		String nickname = nnm.getName();
		String notice = null;
		try {

			ss = new ServerSocket(port);
			System.out.print("서버 연결 대기 중!\n");
			sk = ss.accept(); // 1. ServerSocket-> Socket 연결

			for (;;) {
				InputStream is = sk.getInputStream(); //
				OutputStream os = sk.getOutputStream();

				byte[] data = new byte[4072];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);

				sr = new Scanner(System.in);
				System.out.print("연결 완료!\n[입력하실 내용을 적어주세요] >> ");
				notice = sr.nextLine();
				msg = nickname + " : " + notice;

				os.write(msg.getBytes());
				os.flush();

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class nickname2 {
	String nick = null;

	public void setName() {
		Scanner Nicck = new Scanner(System.in);
		System.out.print("[서버에서 사용하실 아이디를 입력해 주세요] >> ");
		this.nick = Nicck.next();
	}

	public String getName() {
		return this.nick;
	}
}