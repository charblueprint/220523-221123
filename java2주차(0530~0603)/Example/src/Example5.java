
/*#5
 <2�� �迭 + �⺻(Ŭ����)�޼ҵ� ����>
 ��ϵ� ���� vip ���� ����Ʈ�� ����Ͻÿ�
 
 *user_list : ȫ�浿, �̼���, ������, ������,�������, ������, ����屺
 *user_level : gold, vip,guest, gold, vip, vip, guest
 *
 *��� ��� : �̼���, �������, ������*/
public class Example5 {
	// public (class��) <= ��� ��� ����!!
	public static void main(String[] args) { // 2�� �迭 : (�迭��)[�׷��ε���][�������ε���]
		String user_list[][] = { { "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺" },
				{ "gold", "vip", "guest1", "gold", "vip", "vip", "guest2" } };
		Example5.list(user_list);
	}

	public static void list(String l[][]) {
		
		int x = l.length;
		int y = l[0].length;
		/*
		 * ������ ���� 
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
				if (l[i][j].equals("vip")) { // �ڲ� ���⼭ ������!
					System.out.printf("%s ", l[0][j]);
				}
				j++;
			} while (j < y);
			i++;
		} while (i < x);
	}

}
