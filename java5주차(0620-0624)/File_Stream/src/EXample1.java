import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*응용문제
 해당사용자가 영화제목을 검색합니다 자료) http://mekeyace.dothome.co.kr/movie_db.txt
 해당 영화 제목에 맞는 데이터 값이 있을 경우
 영화 전체에 대한 정보를 출력하게 됩니다.
 힌트 : Scanner 사용
 
 "검색할 영화제목을 입력하세요. >>" 범죄도시2
 [범죄도시2] - 추천 5 2022년 4월 개봉

 "검색할 영화제목을 입력하세요. >>" 뽀로로
 "검색한 영화는 확인되지 않습니다. 
 
 */
public class EXample1 {

	public static void main(String[] args) throws IOException {
		List<String> movie = Files.readAllLines(Paths.get("C:\\java5주차(0620-0624)\\File_Stream\\src\\movie_DB.txt"),
				Charset.forName("UTF8"));
		System.out.print("검색할 영화제목을 입력하세요. >>");
		Scanner search = new Scanner(System.in);
		String title = search.nextLine();
		boolean con = movie.contains(title);
		
		int dou =0;
		do {
			if(con==true) {
				System.out.println(movie.get(dou));
			} else {
				System.err.println("검색한 영화는 확인되지 않습니다.");
				return;
			}
			dou++;
		} while(dou<movie.size());
		
//		int i = 0;
//		while (i < movie.size()) {
//			if (movie.get(i).indexOf(title) != -1) {
//				System.out.println(movie.get(i));
//			} else {
//				System.err.println("검색한 영화는 확인되지 않습니다.");
//				return;
//			}
//			i++;				
//		}
		

	}

}
	