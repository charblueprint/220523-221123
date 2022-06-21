import java.io.FileWriter;
import java.io.IOException;

//파일쓰기(write), FileWriter
public class file4 {
//JDK 개선사항 정보를? JEP에서
	// Java +Python = Jython(파이썬에 자바구현이 가능하도록)
	// JEP = Java + Python + Interpreter

	public static void main(String[] args) throws IOException, Exception {
		try {
			String user[] = { "이순신60", "김유신80", "강감찬100", "유관순300" };// FileReader-> FileWriter 수순이어야 함
			FileWriter FW = new FileWriter("C:\\java5주차(0620-0624)\\File_Stream\\src\\array.txt",true);
			//FileWriter true를 사용하면 기존 입력된 사항을 초기화 하지 않음
			FW.write("바보!");
			for (int f = 0; f < user.length; f++) {
				FW.write(user[f]);//. write() : 문자,또는 배열 데이터값을 파일에 적용함
			}
			FW.close(); // 파일을 종료하여 적용합니다.
		} catch (Exception e1) {
			System.out.println("test");
		}
	}

}