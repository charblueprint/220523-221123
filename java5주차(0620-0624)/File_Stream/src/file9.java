//0623 시작점
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
//import java.io.Reader;

//Reader(최상위) 
//- (하위) BufferReader, FileReader, CharArrayReader => 문서파일 ASCII
//- (하위) InputStreamReader - 이미지,동영상,오디오
//Inputstream(입력)
public class file9 {

	public static void main(String[] args) {
		//Stream : 이미지,동영상, 오디오 같은 파일을 로드하기 위해서 (binaray)	
		//InputStream : 입력장치에 대한 값을 받는 클래스 입니다. 기본(int) - ASCII
			//InputStream(최상위 입력장치)
			//(하위 클래스) FileInputStream, AudioInputStream, ObjectInputStream
		
		InputStream is = new InputStream() { //기본 클래스를 로드하여 오버라이드 메소드를 부름
			@Override
			public int read() throws IOException { //이거 있어서 무조건 try catch넣어야 함
				int a = 15;
				return a;
			}
		};
		//InputStreamReader(언어패킷 변경)
		//InputStreamReader("파일명",EUCKR) 또는 InputStreamReader("파일명",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8")); //이렇게 로드 해서 할수도 있고 
		try {
			System.out.println(ir.read());//여기에 그냥 위에 InputStream에서 선언한 생성자(is) 던져도 되지만.. 그러지 않는 이유는 안에 뭐가 들어있을지 모르기 때문이다.
//			System.out.println(is.read()); //이렇게!
		} catch (Exception z) {
		}
		
		//키보드값 로드
		InputStream user = System.in;
		try {
			int code = user.read(); //키보드 입력 ASCII코드값을 반환함
			if(code ==13) {
				System.out.println("엔터키는 사용하실 수 없습니다."); //엔터키 아스키코드가 13번인데, 이걸 막음으로써 입력받는 것을 방지 할 수 있음
			}
			//System.out.println(code);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
