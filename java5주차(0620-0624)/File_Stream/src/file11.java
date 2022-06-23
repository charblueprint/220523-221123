import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream Fs = new FileInputStream("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt");
			//InputStream is = new FileInputStream("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt");  둘이 동일함!
			byte temp[] = new byte[Fs.available()]; 
			//.available() : 파일의 전체크기! 이걸 쓰면 지가 알아서 인식함. 
			//거의 무제한인데(파일크기에 따라서 유동성있게 변화하기 때문이지!), 웹하드같은 곳에서 쓰임
			//문서 하나만 작동시킬 때는 stream 안 씀
			
			/*
			byte temp[] = new byte[1000]; // 블로그나 게시판에 사진이나 동영상 파일 첨부할때 파일 용량 제한 걸어놓는 것을 이렇게 표현!
			int ea = Fs.read(temp); //아스키 코드로 전체를 읽어서 ea에 받도록 함
			String a = new String(temp,"UTF8"); //String 문자형태로 배열을 받아서 출력
			System.out.println(a); =>원시형태의 코드 */ 
			
		} catch (Exception e) {
		}
	}

}
