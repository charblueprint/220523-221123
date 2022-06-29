import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//0629 시작점 어제했던 채팅프로그램 갈아엎고 재시작
public class chat_server_real {

	public static void main(String[] args) throws Exception {
		chat ch = new chat();
		ch.chattingserver();
	}
}

class chat {
	private int port = 8009;
	ServerSocket ss = null;
	Socket sk = null;
	Scanner sr = null;
	InputStream is = null;
	OutputStream os = null;
	private String msg = null;
	private String cmsg = null;
	private String check = null;

	public void chattingserver() throws IOException  {
		ss = new ServerSocket(port);
		sr = new Scanner(System.in);
		setName();
		
		System.out.println("서버 연결 대기 중!");
		System.out.println("채팅방 개설되었습니다♡");
		
		while(true) {
		sk = ss.accept();
		is = sk.getInputStream();
		os = sk.getOutputStream();
		
		byte[] data = new byte[4072];
		int n = is.read(data);
		this.msg = new String(data, 0, n);
		System.out.println(this.msg);
//		if(this.msg.indexOf("종료")!=-1 || this.msg.indexOf("exit")!=-1) {
//			sk.close();
//			break;
//		}
		
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
		os.write(this.cmsg.getBytes());
		os.flush();
			
		}
	}
	private String nick = null;

	public void setName() {
		System.out.print("[서버에서 사용하실 아이디를 입력해 주세요] >> ");
		this.nick = this.sr.next();
	}

	public String getName() {
		return this.nick;
	}
}