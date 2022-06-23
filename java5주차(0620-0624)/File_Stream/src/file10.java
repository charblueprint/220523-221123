import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

//Outputstream (output) - 최상위
//(하위) fileOutputStream,ObjectOutputStream,AudioOutputStream
public class file10 {

	public static void main(String[] args) {
		String a = "a1";
		byte[] b= a.getBytes(); //로드할 언어패킷이 없어서 비워둔것 뿐임
		//.getBytes("언어패킷") 메소드 
		//byte[] : 문자열은 ASCII키 형태의 배열로 변경할 때 사용
		System.out.println(Arrays.toString(b));
		OutputStream OS  = System.out; //출력만 사용 System.out.print 역할
		
		try {
			OS.write(b,0,b.length); //(byte배열 이름, 배열 번호, 배열 크기)
			OS.flush(); //출력코드
			
		} catch (Exception e) {
		}
		
	}

}
