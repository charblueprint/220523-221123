import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file6 {
//Scanner를 이용한 파일쓰기 사용법(output)
	public static void main(String[] args) throws IOException{
		try {			
			FileWriter Fw = new FileWriter("C:\\java5주차(0620-0624)\\File_Stream\\src\\FII.txt",true);
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
