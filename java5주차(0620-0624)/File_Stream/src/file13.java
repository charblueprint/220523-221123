import java.io.IOException;
import java.nio.file.*;

public class file13 {

	public static void main(String[] args) throws IOException{
		try {
			Files.createDirectories(Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\test"));
			//.createDirectories() : 신규 디렉토리 생성 짱신기..

			/*파일 복사*/
//			Path data1 = Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\movie_DB.txt");
//			Path data2 = Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\movie_DB.txt");
//			Files.copy(data1, data2);
			
			/*.move(경로1, 경로2, 복사 옵션) : 해당 파일을 다른 디렉토리로 이동*/
			/*Path data3 = Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\movie_DB.txt"); 
			Path directory = Paths.get("C:\\수업내용 메모\\movie_DB.txt"); //로컬에서 사용할 때는 옮기는 곳 뒤에 옮길 파일 명을 같이 붙여줘야함
			Files.move(data3, directory, StandardCopyOption.REPLACE_EXISTING);*/
			
			/*.delete() : 해당 파일 지우기*/
			/*Path data3 = Paths.get("C:\\java5주차(0620-0624)\\Swing\\src\\swing1\\cat2.jpg");
			Files.delete(data3);*/
			
			/*.createFile() : 해당 파일 생성*/
			Path data3 = Paths.get("C:\\java5주차(0620-0624)\\Swing\\src\\swing1\\cat10.txt");
			Files.createFile(data3);
		} catch(Exception z) {
		}
	}

}
