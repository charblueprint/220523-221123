/*응용문제 #2
 * 해당 사용자 정보 데이터 및 각 레벨뱔 데이터도 함께 제공됩니다.
 * 그 중 레벨데이터 값에 3미만 (미포함) 값만 확인하여
 * 배열 데이터를 재가공 합니다.
 * 
 * 홍길동, 이순신, 강감찬, 세종대왕, 유관순, 김유신
 * 4, 3, 1, 1, 2, 2
 * 
 * ["강감찬", "세종대왕","유관순","김유신"]*/
package ClassTime0531;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		String member[] = { "홍길동", "이순신", "강감찬", "세종대왕", "유관순", "김유신" };
		int level[] = { 4, 3, 1, 1, 2, 2 }; // 데이터 값

		String New_m[] = new String[5];
		int Name = member.length;
		int init1 = 0; // member
		int init2 = 0;

		do {
			if (level[init1] < 3) {
				New_m[init2] = member[init1];
				init2++;
			}
			init1++;
		} while (init1 < Name);
		System.out.println(Arrays.toString(New_m));

	}

}
