import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) {
		chatroom ct = new chatroom();
	}

}
class chatroom{ //기본사항 -> 각 접속마다 thread를 분할
	ServerSocket server = null;
	static final int port = 9009;
	Socket soc = null;
	
	
	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		} System.out.println("***♡멀티 채팅 시작♡***");
		
		while(true) { // 몇명까지 제한 걸도록 도와줌 (카톡에서 단체카톡 500명 제한거는 것처럼)
			try {
				soc = this.server.accept(); //클라이언트 접속 허가
				chat_thread cth = new chat_thread(soc); //서버에 accept의 정보를 보내며 접속 허가
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
	//누적배열을 메모리에 기억시킴 / 이유 : 누적해야함.
	//접속자 발생시 Thread가 새롭게 생성되므로 static에 올리지 않으면 누적없이 계속 초기화 되어버림
	static ArrayList<Socket> user = new ArrayList<>(); //접속자 수를 배열로 체크함
	//사람들이 들어오는데 얼만큼 허용할거고 하는지를 Thread 메소드에서 잡는것.
	//Thread 쓰는 방법, 일대일 채팅 돌아가는 구조 알기
	
	public chat_thread(Socket s) {
		this.sk = s; //포트를 감싸고있는 소켓을 위에서 받음
		this.user.add(this.sk);
		try {
			System.out.println("채팅에 참여 하셨습니다.");
			System.out.println(this.sk);
			this.Is = this.sk.getInputStream();
			this.Os = this.sk.getOutputStream();
		} catch (Exception e) {
			System.out.println("클라이언트 접속가 올바르지 않습니다.");
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
				System.out.print("보낼 메세지를 입력하세요.>> ");
				this.sendmsg = sc.nextLine();
				
				/*배열에 있는 vport(정해진 port말고 임의로 주어지는 것!)에 대한 정보를 담은 수 만큼 반복을 합니다. */
				for(int j=0; j<this.user.size(); j++) {
					//배열에 있는 사용자 vport로 전송을 하게 됩니다.
					//인원수가 많으면 while문이나 do~while문으로 바꿔라..
					OutputStream all = this.user.get(j).getOutputStream();
					//사용자 별로 Stream을 생성
					all.write(this.sendmsg.getBytes()); //전송
					all.flush(); //					
				}
				
			}
		} catch (Exception e) {
			System.out.println("클라이언트가 종료 되었습니다.");
		} finally {
			try {
				this.Is.close();
				this.Os.close();
				this.sk.close();
			} catch (Exception e2) {}
		}
	}
	
}