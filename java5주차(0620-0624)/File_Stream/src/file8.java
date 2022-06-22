import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class file8 {
// List는 최상위 배열 클래스
// Files : 신규 IO클래스 입니다. readAllLines : 전체내용을 한번에 모두 읽음
//files + Paths.get("경로");
	public static void main(String[] args) throws IOException{
		List<String> data = Files.readAllLines(Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt"),Charset.forName("UTF8"));
		System.out.println(data);
		
		//단점 : 메모리 할당이 많아짐,한글 언어패킷을 조정해야함
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt"));
		System.out.println(new String (data2)); //Byte
	
	}

}
