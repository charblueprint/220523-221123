import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//java "C:\java6\Net\src\chat_server.java"
/*1:1 ä�� ���α׷�*/
/* ��Ʈ 9090
[Server]
"�������� ����Ͻ� ���̵� �Է����ּ���"
�����...
ȫ�浿 : �ݰ����ϴ�.
"������ �Է��� �ּ���:" �������~
"ȫ�浿���� �����ϼ̽��ϴ�.

[Client]
"ä�ÿ� ����Ͻ� ���̵� �Է��� �ּ���"
ȫ�浿
"������ �Է��� �ּ���:" �ݰ����ϴ�
������ : �������~
"������ �Է��� �ּ���:" exit
"ä���� ���� �Ǿ����ϴ�."
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
			System.out.print("���� ���� ��� ��!\n");
			sk = ss.accept(); // 1. ServerSocket-> Socket ����

			for (;;) {
				InputStream is = sk.getInputStream(); //
				OutputStream os = sk.getOutputStream();

				byte[] data = new byte[4072];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);

				sr = new Scanner(System.in);
				System.out.print("���� �Ϸ�!\n[�Է��Ͻ� ������ �����ּ���] >> ");
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
		System.out.print("[�������� ����Ͻ� ���̵� �Է��� �ּ���] >> ");
		this.nick = Nicck.next();
	}

	public String getName() {
		return this.nick;
	}
}