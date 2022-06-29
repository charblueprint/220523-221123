import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		chatroom ct = new chatroom();
	}

}
class chatroom{ //�⺻���� -> �� ���Ӹ��� thread�� ����
	ServerSocket server = null;
	static final int port = 9009;
	Socket soc = null;
	
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		} System.out.println("***����Ƽ ä�� ���ۢ�***");
		
		while(true) { // ������ ���� �ɵ��� ������ (ī�忡�� ��üī�� 500�� ���ѰŴ� ��ó��)
			try {
				soc = this.server.accept(); //Ŭ���̾�Ʈ ���� �㰡
				chat_thread cth = new chat_thread(soc); //������ accept�� ������ ������ ���� �㰡
				Thread t = new Thread(cth);
				t.start();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
class chat_thread implements Runnable{
	Socket sk = null;
	InputStream Is = null;
	OutputStream Os = null;
	String sendmsg = null;
	String getmsg = null;
	Scanner sc = null;
	//�����迭�� �޸𸮿� ����Ŵ / ���� : �����ؾ���.
	//������ �߻��� Thread�� ���Ӱ� �����ǹǷ� static�� �ø��� ������ �������� ��� �ʱ�ȭ �Ǿ����
	static ArrayList<Socket> user = new ArrayList<>(); //������ ���� �迭�� üũ��
	//������� �����µ� ��ŭ ����ҰŰ� �ϴ����� Thread �޼ҵ忡�� ��°�.
	//Thread ���� ���, �ϴ��� ä�� ���ư��� ���� �˱�
	
	public chat_thread(Socket s) {
		this.sk = s; //��Ʈ�� ���ΰ��ִ� ������ ������ ����
		this.user.add(this.sk);
		try {
			System.out.println("ä�ÿ� ���� �ϼ̽��ϴ�.");
			System.out.println(this.sk);
			this.Is = this.sk.getInputStream();
			this.Os = this.sk.getOutputStream();
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���Ӱ� �ùٸ��� �ʽ��ϴ�.");
		}
	
	}
	
	@Override
	public void run() {
		try {
			byte data[] = new byte[1024];
			int n = this.Is.read(data);
			this.getmsg = new String (data,0,n);
			System.out.println(this.getmsg);
			
			while(true) {
				System.out.println(this.user.size());
				this.sc = new Scanner(System.in);
				System.out.print("���� �޼����� �Է��ϼ���.>> ");
				this.sendmsg = sc.nextLine();
				
				/*�迭�� �ִ� vport(������ port���� ���Ƿ� �־����� ��!)�� ���� ������ ���� �� ��ŭ �ݺ��� �մϴ�. */
				for(int j=0; j<this.user.size(); j++) {
					//�迭�� �ִ� ����� vport�� ������ �ϰ� �˴ϴ�.
					//�ο����� ������ while���̳� do~while������ �ٲ��..
					OutputStream all = this.user.get(j).getOutputStream();
					//����� ���� Stream�� ����
					all.write(this.sendmsg.getBytes()); //����
					all.flush(); //					
				}
				
			}
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
		} finally {
			try {
				this.Is.close();
				this.Os.close();
				this.sk.close();
			} catch (Exception e2) {}
		}
	}
	
}