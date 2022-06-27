import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 파일 용량 제한
public class file15 {
//*주의 : BufferedInputStream이나 InputStream같은 Stream계열 함수들은 휘발성을 띄고있어 한번 실행되면 다시 실행되지 않는다!
	public static void main(String[] args) throws IOException {
		String file = "C:\\java5주차(0620-0624)\\File_Stream\\src\\cat1.jpg";
		InputStream is = new FileInputStream(file); // =>위에 썼는데
		
		//FileInputStream을 buffer로 사용하게 되면, 더 이상 FileInputStream을 사용하지 못함
		//그 수단으로 buffer에 new FileInputStream을 생성하여 별도로 사용할 수 있도록 셋팅함
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file)); //=> 요거 이 난리 나면 안된다고
		
		byte filesize[] = new byte[bi.available()];
		
		int total = is.read(filesize);
		if(total > 92160) { //90KB이상이면 제한걸기
			System.out.println("이미지 제한 용량은 90KB까지 입니다.");	
		} else {
			System.out.println("정상적으로 등록 되었습니다.");
			FileOutputStream fo = new FileOutputStream("img_copy.jpg");
			fo.write(total);
		}
	}

}
