import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {

	public static void main(String[] args) throws UnknownHostException {
		//UnknownHostException
		InetAddress IA = InetAddress.getByName("naver.com");
		//InetAddress, .getHostName()
		//System.out.println(IA); //IA.toString과 같은데 버전이 올라가면서 안 써도 되게끔 되었음!
		//System.out.println(IA.getHostName()); //도메인 명
		//System.out.println(IA.getHostAddress());//DNS에 연결된 IP주소
		
		//.getAllByName
		InetAddress ia2[] = InetAddress.getAllByName("localhost");
//		System.out.println(ia2[0].getHostAddress());
		System.out.println(ia2.length); //해당DNS에 IP갯수
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}
}
