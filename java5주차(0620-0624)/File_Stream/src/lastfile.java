import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class lastfile {
	/* 
	<올바른 순서>
	InputStream > InputStreamReader > BufferedReader (o)
	InputStream > BufferedReader (x)
	InputStream > BufferedInputStream (o)
	InputStreamReader > BufferedReader (o)
	
	※Warning※
	BufferedReader - close() : 메모리 종료 
	BufferedWriter - flush() : 메모리 초기화 , close() : 메모리 종료
	*/

	public static void main(String[] args) throws IOException{
		try {
			String URL = "src\\Buffer.txt";
			FileInputStream fs = new FileInputStream(URL); //파일을 가져와 읽음
//			BufferedInputStream bs = new BufferedInputStream(fs);
//			System.out.println(bs.read());
//			byte a[] = new byte[400];
			InputStreamReader ir = new InputStreamReader(fs,"UTF8"); //여기에 넘겨줘야 제대로 읽고 인식함
			BufferedReader br = new BufferedReader(ir); //이건 한번만 쓰라고
			System.out.println(br.readLine());
			
		} catch (Exception e) {
		}
	}

}
