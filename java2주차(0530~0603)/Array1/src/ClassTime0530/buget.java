package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class buget {

	public static void main(String[] args) {
		String[] chooses = new String[4]; //�ֹ� ���� �� 4��
		String Menu [] = {"�ܹ���","����","ġŲ","Ŀ��"}; //������ ����?
		System.out.println("�ܹ���, ����, ġŲ, Ŀ�� \n�ֹ��ϰ��� �ϴ� ������ ������ �ּ���. >> ");
		Scanner Meal = new Scanner(System.in);
		String choose = Meal.next();//�Է¹��� ������?
		int i = 0;
		for(String C : Menu) {
			do {
				if(C.equals("�ܹ���")|| C.equals("����")||C.equals("ġŲ")||C.equals("Ŀ��")) {
					chooses[i]=C;
					int pick = chooses.length;
				} else if(C.equals("�ֹ�����")) {
					System.out.println("�ֹ����� : "+Arrays.toString(chooses));
				}
				
				i++;
			}while(i<4);
		}
	}
}
		