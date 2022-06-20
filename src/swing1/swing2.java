package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList(배열 값) - add, remove,get,size
		//Map (배열 키,배열 값) -put, remove, get, size
		/*Map은 배열 키 기반이기 때문에 키를 통해서 데이터를 확인합니다.(속도 최상급)
		 같은 키를 사용시 마지막에 적용된 값으로 갱신 됩니다. 키 값을 절대 중복하지 않음*/
		Map<String,String> m = new HashMap<>();
		m.put("hong", "홍길동"); //hong을 입력해야 홍길동이 작동함
		m.put("kang", "강감찬");
		//hong-> hash function(HashMap) -> 0x21949CB 이렇게 해시코드로 변환해서 저장해둠.
		//(중복값이 발생하지 않음. 왜냐, 해시코드 값이 다른데 어떻게 똑같은 값임?)
//		System.out.println(m.get("kang"));
		m.put("park", "");// 키는 있으나 값이 비어있을 경우는 사용함
		m.put("", "박혁거세"); //이렇게 배열 키가 공란인 상태로 둬도 쓸 수 있긴 하지만 Map의 원리에는 올바르지 않음.
		//차라리 쓸거면 arraylist를 써라.
		if(m.get("park").equals("")) { // 이렇게 버튼을 누르면 값이 적용되는 경우에 사용
			m.put("park", "박");
		}
		m.remove("hong"); // remove 할때 배열 값이 아니라 키를 넣어야한다.
//		System.out.println(m);
		
		
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
//		System.out.println(m2.get("age"));
		System.out.println(m2.keySet()); //키만 출력
		System.out.println(m2.values()); //값만 출력 여기서는 값이 영어로 value임! 직역하면 "값들"
		System.out.println(m2.containsKey("age")); //해당 키가 있는 지 확인 (false : 없음, true : 있음)
	} /*간편 회원가입을 통해 잠재적 고객을... 일단 간편 회원가입을 했을때 나머지 값은 비워두고 아이디 비번만 입력하게 함.*/

}
