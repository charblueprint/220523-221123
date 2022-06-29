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
		// ���� Stream�� close���� �ʽ��ϴ�. �ֳ��ϸ�, ��� Stream�� ���ϰ� ������ �Ǿ� �����Ƿ� close�� ���ϵ� �Բ� ���ᰡ
		// �˴ϴ�.
		// Socket�� �����Ͱ� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻��� �� �ֽ��ϴ�.

		try {
			setName();

			while (true) {
				sk = new Socket(this.ip, this.port);
				is = sk.getInputStream();
				os = sk.getOutputStream();
				
				if (this.count == 0) {
					this.msg = "<[" + getName() + "]���� �����ϼ̽��ϴ�. ���濡�� �λ縦 �� ������.\n ä���� �����Ͻ÷��� 'exit' Ȥ�� '����'�� �Է����ּ���>";
				} else {
					sr = new Scanner(System.in);
					System.out.println("������ �Է��� �ּ���");
					this.check = sr.nextLine().intern();
					if(this.check=="exit" || this.check=="����") {
						this.msg = getName() +"���� ä���� �����ϼ̽��ϴ�.";
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
			System.out.println("ä���� ����Ǿ����ϴ�.");
		}
	}

	private String nick = null;

	public void setName() throws IOException {
		sr = new Scanner(System.in);
		System.out.print("[�������� ����Ͻ� ���̵� �Է��� �ּ���] >> ");
		this.nick = sr.next();
	}
	public String getName() {
		return this.nick;
	}
}
