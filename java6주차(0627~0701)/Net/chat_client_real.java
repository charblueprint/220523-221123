import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client_real {

	public static void main(String[] args) {
		try {
			chattingclient Cc = new chattingclient();
			Cc.chat();
		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e);
			}
		}
	}
}

class chattingclient {
	private final int port = 8009;
	private final String ip = "127.0.0.1";
	Socket sk = null;
	Scanner sr = null;
	InputStream is = null;
	InputStream is2 = null;
	OutputStream os = null;
	OutputStream os2 = null;
	private String msg = null;
	private String servermsg = null;
	private String notice = null;
	private int count = 0;
	private String check=null;

	public void chat() {
		// 각종 Stream을 close하지 않습니다. 왜냐하면, 모든 Stream이 소켓과 연결이 되어 있으므로 close시 소켓도 함께 종료가
		// 됩니다.
		// Socket은 데이터가 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생할 수 있습니다.

		try {
			setName();

			while (true) {
				sk = new Socket(this.ip, this.port);
				is = sk.getInputStream();
				os = sk.getOutputStream();
				
				if (this.count == 0) {
					this.msg = "<[" + getName() + "]님이 입장하셨습니다. 상대방에게 인사를 해 보세요.\n 채팅을 종료하시려면 'exit' 혹은 '종료'를 입력해주세요>";
				} else {
					sr = new Scanner(System.in);
					System.out.println("내용을 입력해 주세요");
					this.check = sr.nextLine().intern();
					if(this.check=="exit" || this.check=="종료") {
						this.msg = getName() +"님이 채팅을 종료하셨습니다.";
						os.write(this.msg.getBytes());
						os.flush();
						sk.close();
					} else {
						this.msg = "[" + getName() + "]:" + this.check;
						os.write(this.msg.getBytes());
						os.flush();
					}
				} 

				byte[] data = new byte[4072];
				int n = is.read(data);
				this.servermsg = new String(data, 0, n);
				System.out.println(this.servermsg);
				this.count++;
			}
		} catch (Exception e) {
			System.out.println("채팅이 종료되었습니다.");
		}
	}

	private String nick = null;

	public void setName() throws IOException {
		sr = new Scanner(System.in);
		System.out.print("[서버에서 사용하실 아이디를 입력해 주세요] >> ");
		this.nick = sr.next();
	}
	public String getName() {
		return this.nick;
	}
}
