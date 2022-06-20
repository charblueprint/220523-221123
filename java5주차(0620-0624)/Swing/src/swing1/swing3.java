package swing1;

import java.util.*;

public class swing3 {

	public static void main(String[] args) {
		// 반복문을 이용하여 키생성 및 배열 값을 split으로 분리작업
		String data[] = {"홍길동","강감찬","이순신","유관순"};
		Map<String, String> m = new HashMap<>(); //여기에 대입 시 Arrays.asList하면 안된다!
		//배열 키가 존재하는 것이지 map이 이차 배열 형태는 아니다!
		int w = 0;
		do {
			m.put(String.valueOf(w), data[w]); // 중복되지 않은 키값 생성 + 해당 배열에 있는 index 번호
			w++;			
		} while (w<data.length); 
		//키는 숫자로 안만드는 이유 : 키를 더해서 더한 키 만큼의 값이 나와야하는데 진짜로 덧셈한 키의 값이 튀어나오기 때문..
		System.out.println(m); 
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			m2.put(names, names); //foreach로 키,값이 동일하게 적용
		}
//		System.out.println(m2);
		
		String alldata[]= {"names=홍길동","email=test@gmail.com","age=25"};
		Map<String, String> m3 = new HashMap<String, String>(); 
		for(int f=0; f<alldata.length; f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3.get("email"));
	}

}
