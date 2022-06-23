import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class file12 {

	public static void main(String[] args) throws IOException{
		String test = "연습입니다.";
		OutputStream os = new FileOutputStream("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt",true);
		//여기도 (파일경로,true/false)로 저장유무를 정할 수 있다!
		byte[] data = test.getBytes();// 문자 자료형인 test 객체를 data라는 Byte자료형(아스키코드)로 변환함
		os.write(data);
		os.flush(); 
		//Stream에 저장된 모든 값을 메모리에 있게 됩니다.
		//flush() : 메모리 값을 모두 비우는 작업을 실행하게 됩니다.
	}

}
