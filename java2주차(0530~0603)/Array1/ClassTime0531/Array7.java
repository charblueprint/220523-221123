/*���빮�� #2
 * �ش� ����� ���� ������ �� �� �����u �����͵� �Բ� �����˴ϴ�.
 * �� �� ���������� ���� 3�̸� (������) ���� Ȯ���Ͽ�
 * �迭 �����͸� �簡�� �մϴ�.
 * 
 * ȫ�浿, �̼���, ������, �������, ������, ������
 * 4, 3, 1, 1, 2, 2
 * 
 * ["������", "�������","������","������"]*/
package ClassTime0531;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		String member[] = { "ȫ�浿", "�̼���", "������", "�������", "������", "������" };
		int level[] = { 4, 3, 1, 1, 2, 2 }; // ������ ��

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
