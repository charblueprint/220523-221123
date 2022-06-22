import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7에 대한 추가 설명 BufferedReasder+Array (output->input->output)
public class Buffer_file {

	public static void main(String[] args) throws IOException{
		FileReader FF = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\Buffer.txt",Charset.forName("UTF8"));
		BufferedReader BB = new BufferedReader(FF);// 비록 Buffer가 일회성이지만
		ArrayList<String> AA = new ArrayList<>();// 이렇게 배열에 부워버리면
		String word="";
		while((word=BB.readLine())!=null) {
			AA.add(word); // 해당 자료형에 저장된 문자를 배열로 추가시킴.
		} BB.close(); 
		System.out.println(AA); // 제한없이 막 사용가능
		System.out.println(AA.size());
	}
}
