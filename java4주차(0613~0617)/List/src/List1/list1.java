/*0615 시작점*/
package List1;

import java.util.*;

public class list1 {

	public static void main(String[] args) {
		/*add(추가), get(데이터 로드), remove(삭제), size(index갯수) : ArrayList라는 util 메소드에서 사용하는 부분
		 Arrays.asList  : 로드할 배열 변수를 적용
		 중요 : add는 일반적으로 무조건 맨 뒤에 데이터가 추가됨. 단, index번호를 적용후 실행하면 해당 index부분에 추가가 됩니다.
		 */
		
		String member[]= {"최승철","윤정한","이지훈","이석민"};
		ArrayList<String> svt = new ArrayList<>(Arrays.asList(member));
		System.out.println(svt);
		int i = svt.size();
		//System.out.println(i);
		svt.add("최한솔"); //근데 이렇게 되면 항상 추가된 멤버가 맨 끝에 옴
		//System.out.println(svt);
		svt.remove(1);
//		System.out.println(svt);
		svt.add(3,"전원우");
//		System.out.println(svt);
		String checks = svt.get(2);
//		System.out.println(checks);
		
		Integer numbers[] = { 15,22,37,8,11,19,41 };
		//ArrayList에는 int 대신 Integer 사용
		/*응용문제#1*/
		/*본 데이터는 15,22,37,8,11,19,41입니다.
		 해당 본 데이터를 커스텀하여 다음 결과처럼 출력하시오.
		 [7,15,22,8,11,39,41]*/
		ArrayList<Integer> Num = new ArrayList<Integer>(Arrays.asList(numbers));
		Num.remove(2); Num.remove(4); Num.add(0,7); Num.add(5,39);
		System.out.println(Num);
		
		
	}

}