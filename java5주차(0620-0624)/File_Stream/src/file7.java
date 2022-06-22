import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/* 공통 명령어 사항 : read(), readLine(), next(), nextLine() 
 ~ Line() : 문장 단위 / read(), next() : 단어 단위 */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException {
		try {
			FileReader FR = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt",Charset.forName("UTF8"));
//			System.out.println((char) FR.read());
			
			//BufferedReader : Temp (임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있습니다.
			BufferedReader bf = new BufferedReader(FR);
//			BufferedReader bf = new BufferedReader(FR2);
//			BufferedReader bf = new BufferedReader(FR3); // 이렇게 한 개를 가지고 여러 개의 파일을 열 수 있음
//			System.out.println(bf.readLine()); //해당 임시 저장소에서 저장된 내용 중 한 개의 라인으로 로드하게 됩니다.
			
			/*중요>> buffer는 최초 값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됩니다.
			 * 그래서 buffer을 재사용할 경우 재귀함수/ return, method등등을 사용한다.
			 * 요구하는 조건이 많음에도 사용하는 이유 : 실행속도가 빨라서*/
			/*웃긴건 이거 한번 로드했다 종료하면 기능하는 범위가 끝나서 처음부터 다시 로드해야함 휘발성이라는 것!
			 조건문 사용시에도 한번 작동이 이루어지게 됩니다.*/
//			if(bf.readLine()!=null) { //여기서 한 번 써버려서 끝났음
//			int i = 0;
//			while(i<=2) {
//				System.out.println(bf.readLine()); 
//				i++;
//			}
//			}
			/*buffer는 속도가 빠른 대신 사용부분에 무조건 변수 또는 배열로 받은 후 사용하는것을 권장 합니다.*/
			String line="";
			while((line=bf.readLine())!=null){
				System.out.println(line);
			} 
			/*데이터 문서의 라인갯수를 확인*/
			//.LineNumberReader() : 파일 전체 라인갯수를 확인하는 클래스 입니다.
			FileReader FR2 = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt",Charset.forName("UTF8"));
			LineNumberReader li = new LineNumberReader(FR2);
			int ea = li.getLineNumber();
			while (li.readLine()!=null) {
				ea+=li.getLineNumber(); //여기서 이미 소모해서 나머지 sysout줄은 실행이 안된다
			} 
//			System.out.println(ea);
//			System.out.println(FR2);
			
			
			
//			bf.close(); //얘를 이렇게 종료하면 열려있던 파일들이 다 닫힘
			/*데이터문서의 라인갯수를 확인*/
		} catch (Exception e) {
			System.err.println(e);
		} 
	}

}
