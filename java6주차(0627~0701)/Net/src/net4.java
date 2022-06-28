import java.io.*;
import java.net.URL;

//크롤링2
public class net4 {

	public static void main(String[] args) throws IOException {
		
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL U = new URL(page);
		/*Stream을 사용하면 read만 사용(byte 이용), Reader를 사용하면 readLine(String)
		 flush() 사용형태는 BufferedOutputStream*/
		
		InputStream is = U.openStream();
		BufferedInputStream bs = new BufferedInputStream(is); // Buffer를 사용하였기 때문에 배열 (byte[])값을 로드
		byte html[] = new byte[1024]; //그 값을 담을 
//		FileOutputStream fs = new FileOutputStream("game.html"); //배열 값을 로드하여 저장함 
		BufferedOutputStream fs = new BufferedOutputStream(new FileOutputStream("game.html"));
		int s = 0;
		while((s=bs.read(html))!=-1) { //Stream은 read에 byte	배열명을 입력
			fs.write(html,0,s);
		} bs.close();
		fs.close();
	}

}
