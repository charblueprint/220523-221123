/*#10*/
/*���빮�� #11
 *{"�ܹ���","����","ġŲ","Ŀ��"} : epdlxj
 *"�ֹ��ϰ��� �ϴ� ������ ������ �ּ���"
 * �ش� ������ �� 4���� ����� �˴ϴ�.
 * ��, "�ֹ� ����"��� ����ڰ� �Է½� �� ��� �ֹ��� ����Ǹ�,
 * �ֹ������� ����Ͻø� �˴ϴ�. */
/*#12
 * ����ڰ� ��ٱ��Ͽ� ������ �����ϰ� �˴ϴ�.
 * ��, �ش� �ݾ� ����Ʈ�� ������� ���� ,���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�.
 * 1,500 22,000 13,000 14,500 113,800 45,000*/

package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int ArrayT [] = {5,10,15,20,25,30,35};
		/*for each���� ����Ҷ��� �ε��� ��ȣ�� �ʿ���� ���
		 *for - do~while���� ����Ҷ��� �ε��� ��ȣ�� �ʿ��Ҷ� ���
		 *[0] [1] [2] - �ε��� ��ȣ*/
		for(int f : ArrayT) { // int f�� ���������� data�迭 ���� �޾Ƽ� ���� ��ŵ�ϴ�.
			if(f%2==0) {
				//System.out.println(f);				
			}
		}
		String pay[] = {"������ �Ա�","�ſ�ī��", "�޴���", "��ǰ��","����"};
		//System.out.print("�����ϰ��� �ϴ� ���¸� ������ �ּ���: ");
		//Scanner sc = new Scanner(System.in);
		//String pm = sc.next();
		for(String Z : pay) { 
			/* ������ ���� ���� ���󰡾ߵ�. 
			 * �迭 �����Ͱ� �����̹Ƿ� �޴� �������� ���� �������� ����ؾ� �մϴ�.*/
			//if(pm.equals(Z)) {
				if(Z.equals("�޴���")) {
					//System.out.println("���� �ý��� �������� �ش� ������ �̿��Ͻ� �� �����ϴ�.");
				} else {
					//System.out.println(pm+"(��)�� ���� ����˴ϴ�.");
				}
			}
		
		/*#11*/
		Scanner Meal = new Scanner(System.in);
		String[] choose = new String[4]; //�ֹ� ���� �� 4��
		String Menus [] = {"�ܹ���","����","ġŲ","Ŀ��"}; //������ ����?
		System.out.println("�ܹ���, ����, ġŲ, Ŀ�� \n�ֹ��ϰ��� �ϴ� ������ ������ �ּ���. >> ");
		String k = Meal.next();
		int i = 0;//�ε��� ��ȣ ����
		for(String C : Menus) {
			if(C.equals("�ܹ���")|| C.equals("����")||C.equals("ġŲ")||C.equals("Ŀ��")) {
				Menus[i] = C;
				i++;
			}
		int chooses = Menus.length;
		System.out.println("�ֹ����� \n" + Arrays.toString(choose));
			}
		
		
		String[] names = new String[3];//���� ���� �迭 ������ ��������
		String m[] = {"ȫ�浿","�̼���","������"};//�迭���� �����Ͱ� �ִ� ����
		int ct = 0;//for each���� �ε��� ��ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� ������ �ֱ� ���� ����
		for(String a : m) {
			if (a.equals("ȫ�浿")||a.equals("������")) {
				//�ش� (����)�迭���� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���
				names[ct] = a;
				ct++; //�ε��� ��ȣ�� ���������� �����ϱ� ���� ������
			}
		}
		int name_ea = names.length;
		//System.out.println(Arrays.toString(names));
		}
		
		
	}


