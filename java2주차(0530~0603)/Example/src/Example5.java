
/*#5
 <2차 배열 + 기본(클래스)메소드 문제>
 등록된 고객중 vip 고객만 리스트를 출력하시오
 
 *user_list : 홍길동, 이순신, 강감찬, 유관순,세종대왕, 김유신, 계백장군
 *user_level : gold, vip,guest, gold, vip, vip, guest
 *
 *결과 출력 : 이순신, 세종대왕, 김유신*/
public class Example5 {
	// public (class명) <= 얘는 사용 못함!!
	public static void main(String[] args) { // 2차 배열 : (배열명)[그룹인덱스][데이터인덱스]
		String user_list[][] = { { "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군" },
				{ "gold", "vip", "guest1", "gold", "vip", "vip", "guest2" } };
		Example5.list(user_list);
	}

	public static void list(String l[][]) {
		
		int x = l.length;
		int y = l[0].length;
		/*
		 * 강제로 돌림 
		 * int w=0; 
		 * while(w<ea) { 
		 * 		if(l[0][w].equals("vip")) {
		 * 			System.out.println("%s",l[0][j]); 
		 * 		} 
		 * 		w++; 
		 * }
		 */
		int i = 0;
		do {
			int j = 0;
			do {
				if (l[i][j].equals("vip")) { // 자꾸 여기서 막힌다!
					System.out.printf("%s ", l[0][j]);
				}
				j++;
			} while (j < y);
			i++;
		} while (i < x);
	}

}
