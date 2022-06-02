import java.util.Scanner;

/*응용문제#4
 * 다음문자 배열 데이터 값이 있습니다.
 * a1 : 홍길동 이순신 강감찬 유관순 김유신
 * a2 : 100 80 39 60 55
 * "검색하고자 하는 이름을 적어주세요" 출력
 * 검색어에 이순신이라고 검색을 하게 되면
 * 이순신님은 80점 입니다. 라고 출력이 되어야 합니다.
 * msg = "이순신"+님은 +"80점"+" 입니다." */

public class Class_Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색하고자 하는 이름을 적어주세요 >> ");
		String N = sc.next();
		String Search[][] = {{"홍길동", "이순신", "강감찬", "유관순", "김유신" }, { "100", "80", "39", "60", "55" }} ;
		List.thing(Search,N); //여기까지 설명하심
		
	}
}

class List {
	public static void thing(String A[][], String B) {
		int I = A.length; //몇번째서랍인지
		int J = A[0].length; // 서랍의 그 층에서 어디있는가.
		String result []= new String[J]; //새 배열 만듦.
		int i = 0; //I 증가값
		int j = 0; //J 증가값
		do {
			do {
				if (B.equals(A[0][j]) || B.equals(A[1][j])) {
					System.out.printf("%s님은 %s점 입니다.", B, A[i][j]);
					break;
				}
				j++;
			} while (j < J);
		 i++;
		} while (i < I);
			

	}
}
