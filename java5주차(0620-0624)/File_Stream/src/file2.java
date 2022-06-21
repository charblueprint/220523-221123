import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		try {
//			FileReader Fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt"); //8버전
			FileReader Fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt",Charset.forName("UTF8"));
			//Charset.forName : Java12 이후 => EUCKR(ANSI), UTF8, UTF16 등으로 인코더의 형식을 바꿈
//			System.out.println(Fr.getEncoding()); //인코더 형식을 확인
//			System.out.println(Fr.read()); // 해당파일의 데이터 크기를 읽어서 숫자로 표현

			while(true) { //파일의 내용을 화면에 모두 띄우기 위해서는 반복문(사실상 루프) 돌리는것밖에 없음
				int m = Fr.read(); //-1 : 내용이 없음(더이상 문자가 없을 경우)
				System.out.print((char)m); //2byte
				if(m==-1) { //더 이상 가져올 문자가 없을 경우 loop 빠져나감
					break;
				}
			}
			Fr.close(); // 파일이 열려있던걸 닫음 즉, FileReader 종료
		} catch (IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		
	}

}
