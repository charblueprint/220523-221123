import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//이미지 읽기,쓰기
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r : (read) : 읽기, w(write) : 쓰기, x(excute) : 실행
		//RandomAccessFile()  : 사용자가 해당 파일 속성 권한을 설정할 수 있음
		try {
			String files = "C:\\java5주차(0620-0624)\\File_Stream\\src\\cat1.jpg";
			String cp = "img222.jpg";
		RandomAccessFile RAF = new RandomAccessFile(files, "r");
		RandomAccessFile RAF2 = new RandomAccessFile(cp, "rw");
		
		//FileChannel : IO(FileInputStream, FileOutputStream)와 같은 형태
		//.getChannel() : RandomAccessFile 해당 메소드를 가져오는 역할
		FileChannel fc = RAF.getChannel();
		FileChannel target = RAF2.getChannel();
		
		//transferTo,transferFrom(복사 형태)
		//fc.transferTo(0, fc.size(), target); //(배열0번, 배열 끝번호, 복사위치)
		target.transferFrom(fc, 0, fc.size()); //(복사할 파일, 배열 0, 배열 끝 번호)
		
		//System.out.println(fc); //얘의 경우 몇번이나 읽을 수 있음!
		} catch (Exception e) {
			
		}
		
	}

}
