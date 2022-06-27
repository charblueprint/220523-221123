import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//bufferedwriter 
//Bufferes : read,writer 단독으로 사용은 하지 않음
public class file17 {

	public static void main(String[] args) throws IOException{
		try {
		OutputStreamWriter Os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(Os);
		bw.write("홍길동입니다.");
		bw.close();
		
		//네트워크에 패킷을 보낼때 쓰이는게 Stream계열이라고 함
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //이렇게 한줄로 쓰려면 한번 감싸서 넣어야된다
		/* 늘리면 */
		InputStreamReader is = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(is);
		
		String test = br.readLine();
		System.out.println(test);
		} catch (Exception e) {
			
		}
	}

}
