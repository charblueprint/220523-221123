import java.io.FileReader;
import java.io.IOException;

//IOException + Exception
public class file3 {

	public static void main(String[] args) throws Exception {
		filein FN = new filein();
	}
}

class filein {
	FileReader fr = null;

	public filein() throws IOException,Exception {
		try {
			this.fr = new FileReader("C:\\java5주차(0620-0624)\\File_Stream\\src\\data.dat");
			this.word();
		} catch (IOException e) {
			if (e.getMessage() != null) {				
				System.out.println(e);
			}
		} catch (Exception e2) { //이렇게 해주는 게 완벽
			if (e2.getMessage() != null) {
				System.out.println(e2);
			}
		}
	}

	public void word() throws IOException {
		try {
			int W=0;
			while (true) { // 무한루프 돌린다? 문서를 전체를 찍는다
				W = this.fr.read();
				if(W==-1) {
					break;
				} System.out.print((char)W);
			} this.fr.close(); //FileReader 종료
			
		} catch (Exception e3) { //IOException은 Exception이 부모클래스라 상관 x
			if(e3.getMessage()==null) {
				System.exit(0);
			}
		}
	}
}