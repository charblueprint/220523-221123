package swing1;

import java.util.*;

public class swing3 {

	public static void main(String[] args) {
		// �ݺ����� �̿��Ͽ� Ű���� �� �迭 ���� split���� �и��۾�
		String data[] = {"ȫ�浿","������","�̼���","������"};
		Map<String, String> m = new HashMap<>(); //���⿡ ���� �� Arrays.asList�ϸ� �ȵȴ�!
		//�迭 Ű�� �����ϴ� ������ map�� ���� �迭 ���´� �ƴϴ�!
		int w = 0;
		do {
			m.put(String.valueOf(w), data[w]); // �ߺ����� ���� Ű�� ���� + �ش� �迭�� �ִ� index ��ȣ
			w++;			
		} while (w<data.length); 
		//Ű�� ���ڷ� �ȸ���� ���� : Ű�� ���ؼ� ���� Ű ��ŭ�� ���� ���;��ϴµ� ��¥�� ������ Ű�� ���� Ƣ����� ����..
		System.out.println(m); 
		
		Map<String, String> m2 = new HashMap<>();
		for(String names : data) {
			m2.put(names, names); //foreach�� Ű,���� �����ϰ� ����
		}
//		System.out.println(m2);
		
		String alldata[]= {"names=ȫ�浿","email=test@gmail.com","age=25"};
		Map<String, String> m3 = new HashMap<String, String>(); 
		for(int f=0; f<alldata.length; f++) {
			String key[] = alldata[f].split("=");
			m3.put(key[0], key[1]);
		}
		System.out.println(m3.get("email"));
	}

}
