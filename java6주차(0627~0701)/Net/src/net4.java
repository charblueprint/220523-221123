import java.io.*;
import java.net.URL;

//ũ�Ѹ�2
public class net4 {

	public static void main(String[] args) throws IOException {
		
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL U = new URL(page);
		/*Stream�� ����ϸ� read�� ���(byte �̿�), Reader�� ����ϸ� readLine(String)
		 flush() ������´� BufferedOutputStream*/
		
		InputStream is = U.openStream();
		BufferedInputStream bs = new BufferedInputStream(is); // Buffer�� ����Ͽ��� ������ �迭 (byte[])���� �ε�
		byte html[] = new byte[1024]; //�� ���� ���� 
//		FileOutputStream fs = new FileOutputStream("game.html"); //�迭 ���� �ε��Ͽ� ������ 
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));
		int s = 0;
		while((s=bs.read(html))!=-1) { //Stream�� read�� byte	�迭���� �Է�
			fs.write(html,0,s);
		} bs.close();
		fs.close();
	}

}
