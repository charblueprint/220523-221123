/*0615 ������*/
package List1;

import java.util.*;

public class list1 {

	public static void main(String[] args) {
		/*add(�߰�), get(������ �ε�), remove(����), size(index����) : ArrayList��� util �޼ҵ忡�� ����ϴ� �κ�
		 Arrays.asList  : �ε��� �迭 ������ ����
		 �߿� : add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���. ��, index��ȣ�� ������ �����ϸ� �ش� index�κп� �߰��� �˴ϴ�.
		 */
		
		String member[]= {"�ֽ�ö","������","������","�̼���"};
		ArrayList<String> svt = new ArrayList<>(Arrays.asList(member));
		System.out.println(svt);
		int i = svt.size();
		//System.out.println(i);
		svt.add("���Ѽ�"); //�ٵ� �̷��� �Ǹ� �׻� �߰��� ����� �� ���� ��
		//System.out.println(svt);
		svt.remove(1);
//		System.out.println(svt);
		svt.add(3,"������");
//		System.out.println(svt);
		String checks = svt.get(2);
//		System.out.println(checks);
		
		Integer numbers[] = { 15,22,37,8,11,19,41 };
		//ArrayList���� int ��� Integer ���
		/*���빮��#1*/
		/*�� �����ʹ� 15,22,37,8,11,19,41�Դϴ�.
		 �ش� �� �����͸� Ŀ�����Ͽ� ���� ���ó�� ����Ͻÿ�.
		 [7,15,22,8,11,39,41]*/
		ArrayList<Integer> Num = new ArrayList<Integer>(Arrays.asList(numbers));
		Num.remove(2); Num.remove(4); Num.add(0,7); Num.add(5,39);
		System.out.println(Num);
		
		
	}

}