package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList(�迭 ��) - add, remove,get,size
		//Map (�迭 Ű,�迭 ��) -put, remove, get, size
		/*Map�� �迭 Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�.(�ӵ� �ֻ��)
		 ���� Ű�� ���� �������� ����� ������ ���� �˴ϴ�. Ű ���� ���� �ߺ����� ����*/
		Map<String,String> m = new HashMap<>();
		m.put("hong", "ȫ�浿"); //hong�� �Է��ؾ� ȫ�浿�� �۵���
		m.put("kang", "������");
		//hong-> hash function(HashMap) -> 0x21949CB �̷��� �ؽ��ڵ�� ��ȯ�ؼ� �����ص�.
		//(�ߺ����� �߻����� ����. �ֳ�, �ؽ��ڵ� ���� �ٸ��� ��� �Ȱ��� ����?)
//		System.out.println(m.get("kang"));
		m.put("park", "");// Ű�� ������ ���� ������� ���� �����
		m.put("", "�����ż�"); //�̷��� �迭 Ű�� ������ ���·� �ֵ� �� �� �ֱ� ������ Map�� �������� �ùٸ��� ����.
		//���� ���Ÿ� arraylist�� ���.
		if(m.get("park").equals("")) { // �̷��� ��ư�� ������ ���� ����Ǵ� ��쿡 ���
			m.put("park", "��");
		}
		m.remove("hong"); // remove �Ҷ� �迭 ���� �ƴ϶� Ű�� �־���Ѵ�.
//		System.out.println(m);
		
		
		Map<String, Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
//		System.out.println(m2.get("age"));
		System.out.println(m2.keySet()); //Ű�� ���
		System.out.println(m2.values()); //���� ��� ���⼭�� ���� ����� value��! �����ϸ� "����"
		System.out.println(m2.containsKey("age")); //�ش� Ű�� �ִ� �� Ȯ�� (false : ����, true : ����)
	} /*���� ȸ�������� ���� ������ ����... �ϴ� ���� ȸ�������� ������ ������ ���� ����ΰ� ���̵� ����� �Է��ϰ� ��.*/

}
