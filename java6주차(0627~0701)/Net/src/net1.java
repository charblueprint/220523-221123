import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {

	public static void main(String[] args) throws UnknownHostException {
		//UnknownHostException
		InetAddress IA = InetAddress.getByName("naver.com");
		//InetAddress, .getHostName()
		//System.out.println(IA); //IA.toString�� ������ ������ �ö󰡸鼭 �� �ᵵ �ǰԲ� �Ǿ���!
		//System.out.println(IA.getHostName()); //������ ��
		//System.out.println(IA.getHostAddress());//DNS�� ����� IP�ּ�
		
		//.getAllByName
		InetAddress ia2[] = InetAddress.getAllByName("localhost");
//		System.out.println(ia2[0].getHostAddress());
		System.out.println(ia2.length); //�ش�DNS�� IP����
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
	}
}
