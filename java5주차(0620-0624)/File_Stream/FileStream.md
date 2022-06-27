
# I/O (InputStream, outputStream) 입,출력 
**입력 스트림**은 프로그램으로 **들어오는** 스트림 (inputStream : 키보드, 마우스, HDD)을 의미하고,   
**출력 스트림**은 프로그램에서 **밖으로 나가는** 부분을 (outputStream : 모니터, HDD, 프린터) 의미합니다.   
사용자 처리 JAVA.io(API)   
File, FileReader (원시코드) -> StreamAPI (FileinputStream)   
FileWriter -> StreamAPI (FileoutputStream)

이 함수를 사용할 경우 IOException을 throws와 필수로 사용해야 합니다.


```java
import java.io.FileReader;
import java.io.IOException;

public class file1 {
	public static void main(String[] args) throws IOException,Exception  {
		String a;
		try {
			FileReader FR = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt");	
			a = "a1";
			tests(a);
		} catch (IOException e) { //IOException에 대한 예외처리
			System.out.println(e.getMessage());
		} catch(Exception e2) { // 일반 Exception에 대한 예외처리 방식
			System.out.println(e2.getMessage());
		} //이건 넘겨 줄 곳이 없어서 throw 쓸 필요가 없지만, 다른 클래스에 파일도 같이 넘길 일이 생긴다면 IOException도 같이 넘어가야 함
	}
	public static void tests(String data) throws IOException,Exception { //얘도
		int k =Integer.parseInt(data);
		Exception ex = new Exception();
		throw ex;
	}
}
```
***
```java
FileReader Fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt");   
FileReader Fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\list.txt",
Charset.forName("UTF8"));
```
둘의 차이가 무엇이냐고 물으신다면 윗줄의 첫번째줄은 java 버전 8이전의 코드이고, 아랫줄은 버전 8 이후에 만들어진 코드입니다.
***
```java
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader Fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\
			list.txt",Charset.forName("UTF8"));
			//System.out.println(Fr.getEncoding());
			//System.out.println(Fr.read()); 
			while(true) { 
				int m = Fr.read(); 
				System.out.print((char)m); 
				if(m==-1) { 
					break;
				}
			} Fr.close(); // FileReader 종료
		} catch (IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}	
	}
}
```
- **Charset.forName("인코더 형식")** : Java12 이후에 나온 함수로, EUCKR(ANSI), UTF8, UTF16 등으로 인코더의 형식을 바꾸는 함수입니다.  
- **.getEncoding()** : 해당 파일의 인코더 형식을 확인하는 함수입니다.  
- **.read()** : 해당 파일의 데이터 크기를 읽어서 숫자로 표현하는 함수입니다. indexOf()함수와 비슷한데 **-1**이 산출될 경우 **읽을 자료가 없음을 의미**합니다.

```java
	while(true) { 
				int m = Fr.read(); 
				System.out.print((char)m); 
				if(m==-1) { 
					break;
				}
			}
```
위와 같이 루프를 돌리는 이유는,
```java
System.out.print((char)m); 
```
반복문을 돌리지 않고 위의 코드처럼 한 줄만 돌리면 char이 2byte이므로 문자의 맨 첫 글자 하나만 출력되게 됩니다.   
결국 파일의 내용을 화면에 모두 띄우기 위해서는 반복문(사실상 루프) 돌리는 것밖에 없다는 거죠.  
루프를 돌리고 싶으면 while의 경우 true로 설정하고, for문의 경우는 for(;;){} 으로 설정하면 됩니다.
***
#//IOException + Exception
```java
import java.io.FileReader;
import java.io.IOException;

public class file3 {
	public static void main(String[] args) throws Exception {
		filein FN = new filein();
	}
}
class filein {
	FileReader fr = null;
	public filein() throws IOException,Exception {
		try {
			this.fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\data.dat");
			this.word();
		} catch (IOException e) {
			if (e.getMessage() != null) {				
				System.out.println(e);
			}
		} catch (Exception e2) { //이렇게 해주는 게 완벽
			if (e2.getMessage() != null) {
				System.out.println(e2);
			}
		}
	}
	public void word() throws IOException {
		try {
			int W=0;
			while (true) { 
				W = this.fr.read();
				if(W==-1) {
					break;
				} System.out.print((char)W);
			} this.fr.close();
		} catch (Exception e3) { 
			if(e3.getMessage()==null) {
				System.exit(0);
			}
		}
	}
}
```
상기의 코드를 통해서 우리가 알 수 있는 것은 catch부분에 꼭 IOException을 쓰지 않아도 된다는 것입니다.  
IOException은 Exception이 부모클래스라 자식클래스로써 상속 받는 관계임으로 속성이 동일하기 때문이죠.

# 파일쓰기(write), FileWriter
FileWriter를 사용하기전 FileReader-> FileWriter 수순이어야 함을 알고있으므로 
```java
import java.io.FileWriter;
import java.io.IOException;

public class file4 {
//JDK 개선사항 정보를? JEP에서
	// Java +Python = Jython(파이썬에 자바구현이 가능하도록)
	// JEP = Java + Python + Interpreter
	public static void main(String[] args) throws IOException, Exception {
		try {
			String user[] = { "이순신60", "김유신80", "강감찬100", "유관순300" };
			FileWriter FW = new FileWriter("C:\\java5주차(0620-0624)\\File_Stream\\src
			\\array.txt",true);
			//FileWriter true를 사용하면 기존 입력된 사항을 초기화 하지 않음
			FW.write("바보!");
			for (int f = 0; f < user.length; f++) {
				FW.write(user[f]);//. write() : 문자,또는 배열 데이터값을 파일에 적용함
			}
			FW.close();
		} catch (Exception e1) {
			System.out.println("test");
		}
	}
}
```
# Scanner을 이용해 파일 로드를 하는 법

```java
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class file5 {
	public static void main(String[] args) throws IOException {
		//system.in : input 
		//system.out : output
		try {
			FileReader FR =  new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\FII.txt");
			//file 함수보다 FileReader 함수를 사용하길 추천함.
			Scanner sc = new Scanner(FR); //system.in(사용자가 직접), FileReader : 파일을 로드
			int count = 0;
			while(sc.hasNext()) { //.hasNext() : boolean(true,false) 형태
					sc.nextLine();
					count++;
			} System.out.println(count);
			
			/*while(true) { // loop시 예외처리로 빠질 수 있음				
				String result = sc.nextLine();				
				if(result != null) {
					System.out.print(result); // 파일로드된 입력값을 result 전달
				} else { sc.close(); break; }
			}*/ 
			sc.close();
			FR.close();	
		} catch (Exception e) { 
			System.out.println(e);
		}	
	}
}
```
# Scanner를 이용한 파일쓰기 사용법(output)
```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file6 {
	public static void main(String[] args) throws IOException{
		try {			
			FileWriter Fw = new FileWriter("C:\\java5주차(0620-0624)\\File_Stream\\src\\FII.txt"
			,true);
			Scanner sc = new Scanner(System.in);
			System.out.println("내용을 입력해 주세요");
			
			for(int i=0; i<3;i++) { //3번 반복
				String notice = sc.nextLine()+ "\n";
				Fw.write(notice); // 해당 입력사항을 FII.txt에 저장시킴
			}
			sc.close();
			Fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
```
```java
import java.io.*;
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
```
```java
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
```
```java
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
```