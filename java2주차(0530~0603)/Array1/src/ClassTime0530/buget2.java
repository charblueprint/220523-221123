package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class buget2 {

	public static void main(String[] args) {
		String[] chooses = new String[4]; // �ֹ� ���� �� 4��
		String Menu[] = { "�ܹ���", "����", "ġŲ", "Ŀ��" }; // ������ ����?
		System.out.print("�ܹ���, ����, ġŲ, Ŀ�� \n�ֹ��ϰ��� �ϴ� ������ ������ �ּ���. >> ");
		Scanner Meal = new Scanner(System.in);
		int i = 0;
		for(String C : chooses) {
			chooses[i] = Meal.next();//�Է¹��� ������?
			if(C.equals("�ܹ���")|| C.equals("����")||C.equals("ġŲ")||C.equals("Ŀ��")) {
				C
				i++;
			}
		}
		System.out.println(chooses);
	}
}