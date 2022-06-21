import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	 * I/O InputStream, outputStream 
	 * 입력 스트림 : 프로그램으로 들어오는 스트림 (inputStream : 키보드,마우스,HDD) 
	 * 출력 스트림 : 프로그램에서 밖으로 나가는 부분 (outputStream : 모니터, HDD, 프린터) 
	 * Stream: input, output 
	 * 사용자 처리 JAVA.io(API) 
	 * File,FileReader(원시코드)-> StreamAPI (FileinputStream) 
	 * FileWriter-> StreamAPI (FileoutputStream)
	 */
	public static void main(String[] args) throws IOException,Exception  {
		String a;
		/*FileReader : 
		 * 1.문자 데이터를 파일로부터 읽는 클래스
		 * 2.파일이름을 생성자 인수값으로 사용해서 FileReader 객체를 생성합니다.
		 public void abc(String a) { }
		 여기서 String a는 파라미터,즉 인수값인데 실제로 다른 언어에 파라미터라는 다른 용어가 있어 인수값이라고 부르는게 나음*/
		try {
			FileReader FR = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt");	
			a = "a1";
			tests(a);
		} catch (IOException e) { //IOException에 대한 예외처리
			System.out.println(e.getMessage());
		} catch(Exception e2) { //일반 Exception에 대한 예외처리 방식
			System.out.println(e2.getMessage());
		} //이건 넘겨 줄 곳이 없어서 throw 쓸 필요가 없지만, 다른 클래스에 파일도 같이 넘길일이 생긴다면 IOException도 같이 넘어가야 함
	}
	public static void tests(String data) throws IOException,Exception { //얘도
		int k =Integer.parseInt(data);
		Exception ex = new Exception();
		throw ex;
	}
}