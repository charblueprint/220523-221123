import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[�������� ����Ͻ� ���̵� �Է��� �ּ���] >> ");
		String mid = sc.nextLine();
		chatclient ccc = new chatclient(mid);
		

	}

}
class chatclient{
	static final String ip = "127.0.0.1";
	static final int port = 9009;
	Socket sk =null;
	InputStream Is = null;
	OutputStream Os = null;
	String sendmsg = null;
	String getmsg = null;
	
	public chatclient(String mid){
		try {
			System.out.println("["+mid+"]�� ���� �Ϸ�!");
			this.sk = new Socket(this.ip,this.port);
			this.Is = this.sk.getInputStream();
			this.Os = this.sk.getOutputStream();
//			System.out.println("ä���� ����~");
			
			this.sendmsg = mid + "���� �����ϼ̽��ϴ�.";
			this.Os.write(this.sendmsg.getBytes());
			this.Os.flush();
			System.out.println("1");
			while (true) {
				byte data[] = new byte[4096];
				int n = this.Is.read(data);
				this.getmsg = new String (data,0,n);
				System.out.println(this.getmsg);
				
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}