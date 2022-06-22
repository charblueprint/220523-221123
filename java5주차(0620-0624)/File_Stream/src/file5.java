import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Scanner을 이용해 파일 로드를 하는 법
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
