package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing4 {

	public static void main(String[] args) {
		String [][] data = {{"d1","123456"},{"d1","456789"},{"d2","ȫ�浿"},{"d2","�̼���"},{"d3","hong@naver.com"}};
//		Map<String, String> m2 = new HashMap<>(); // ����,����
		HashMap m2 = new HashMap<>(); //������ �ڷ����� �������
//		Map m2 = new HashMap<>(); //������ �ڷ����� �������
		
		//System.out.println(data[0][0]); 
		//data[0][0] : Ű �� | data[0][1] : ������ ��
		
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
