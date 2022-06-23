import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class net {

	public static void main(String[] args) {
		try {
			ServerSocket SS = new ServerSocket();
			SS.bind(new InetSocketAddress("localhost",7070));
			System.out.println("연결 중 입니다.");
			Socket sc = SS.accept();
			InetSocketAddress ia = (InetSocketAddress)sc.getRemoteSocketAddress();
			System.out.println("연결확인");
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
