package Javaclass;
public class Var {

	public static void main(String[] args) {
		//������ ���������� ���ϴ� �� (������ �� '����'�� �Ȱ��� ����)
		/*
		 *1. ���� ��� - ������ ����
		 *String : ���� �ڷ��� - �� ���� ���� ����
		 *char/int/double/float/boolean/long/short/byte ��� - ��״� �ڷ�����! 
		 */
		String a1 = "ȫ�浿�Դϴ�"; // a1�� �������� �����Ѱ���.
		// A=B �� B�� ���� A�� �ѱ�ٴ� �ǹ��̰�, A==B�� A�� B�� ���� �����ϴٴ� �ǹ�
		System.out.println(a1);
		 //�������� ���� �� ���� �����Ͽ� �Ѱ��ִ� ����
		/*
		 * 2. ����+���� ���� �����ϴ� ���
		 */
		String b1 = "�̼����Դϴ�.";
		System.out.println(b1);
		
		/* ���� Ȯ�� ���� */
		a1 = "�̼����Դϴ�."; // ������ ������ �ִ� �����ʹ� �����ǰ�, ���ο� ������ �缳����
		System.out.println(a1);

	}

}