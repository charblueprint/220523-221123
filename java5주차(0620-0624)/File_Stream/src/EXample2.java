import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*응용문제#1
 해당정보는 각 지점별 댐 수위현황을 적용한 데이터 입니다.
 해당 데이터 중 100미만의 수위를 가진 댐만 20220623.txt파일로 내용이 저장되도록 하십시오.*/
public class EXample2 {

	public static void main(String[] args) throws IOException {
		Path newdata = Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\20220623.txt");
		Files.createFile(newdata);
		
		Daam DAM = new Daam();
		DAM.rain();
	}
}
class Daam{ 
	private FileReader FR = null;
	private ArrayList<String> koreariver = null;
	
	public void rain() throws IOException {
		this.FR = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\info.txt");//읽어내는 데 성공
		System.out.println(FR);
		this.koreariver = new ArrayList<String>();
//		int r = 0;
//		do {
//			try {
//				if() {
//					
//				}
//			}catch (Exception e) {
//			}finally {
//				
//			}
//		} while(r<this.koreariver.size());
	}
}