package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing4 {

	public static void main(String[] args) {
		String [][] data = {{"d1","123456"},{"d1","456789"},{"d2","홍길동"},{"d2","이순신"},{"d3","hong@naver.com"}};
//		Map<String, String> m2 = new HashMap<>(); // 문자,문자
		HashMap m2 = new HashMap<>(); //데이터 자료형과 관계없이
//		Map m2 = new HashMap<>(); //데이터 자료형이 관계없음
		
		//System.out.println(data[0][0]); 
		//data[0][0] : 키 값 | data[0][1] : 데이터 값
		
		for(int a=0; a<data.length; a++) {
			if(!m2.containsKey(data[a][0])) {
				m2.put(data[a][0],data[a][1]);
			} else {
				m2.put(data[a][0]+a,data[a][1]);
			}
		}
		System.out.println(m2);
	}

}
