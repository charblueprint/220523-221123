import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*전송 형태의 프로토콜*/
public class net2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해 주세요 >>");
		String Url = sc.nextLine();
		//URL
		URL u = new URL(Url); 
		URLConnection con = u.openConnection();
		//.openConnection() 해당 경로를 연결
		//System.out.println(con); //연결 확인까지만
		
		//.getContentLength()
		int imgsize = con.getContentLength();
		//System.out.println(imgsize); // 존재 여부 출력
		String imgtype = con.getContentType();
		//.getContentType()
		//System.out.println(imgtype);
		long date = con.getDate();
		//System.out.println(date);
		
		//.openStream()
		InputStream is = u.openStream();// URL에서 파일을 읽어올때 사용함
		//URL에서 읽은 파일을 
		BufferedInputStream bi = new BufferedInputStream(is); 
		FileOutputStream fo = new FileOutputStream("wonwoo.jpg"); //저장형태 지정
		byte data[] = new byte[1024]; //1024=1KB 해당 파일을 조각냄
		
		int imgdata=0;
		int cnt=0; //반복값
		
		while ((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata); 
			cnt += imgdata;
			System.out.println("다운로드 중...." + (cnt*100)/imgsize  + "%");
		} fo.flush();
		fo.close();
		System.out.println("다운로드가 완료되었습니다.");
	}

}
