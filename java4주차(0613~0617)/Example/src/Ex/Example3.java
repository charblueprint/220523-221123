package Ex;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		/* ���빮��(����) */
		/*
		 1)���Ե� ȸ�� ���� �� ���� ������ ����Ʈ�� ���� ������� ����� �̸��� �����Ͽ� ����մϴ�. //�̰� ���� ����� 
		 2) ���Ե� ��� ȸ���� ����Ʈ �� ���� ���Ͻÿ�.->��� : "ȸ�� ��ü�� ����Ʈ �հ�� : 34390�Դϴ�."
		 */
		sorting ST = new sorting();
		ST.setter();
	}

}

abstract class sort {
	public abstract int getter();

	public abstract void setter();

	public abstract void data();

	String DDD[][];
	// �̸� �̴� ĭ
}

class sorting extends sort {
	ArrayList<Integer> PO = new ArrayList<Integer>();
	protected int total = 0;

	@Override
	public void setter() {
		data();

		int i = 0;
		int j = 0;
		do {
			this.PO.add(Integer.parseInt(this.DDD[i][6]));
			i++;
		} while (i < this.DDD.length);
		do {
			this.total += this.PO.get(j);
				j++;
			} while (j < this.PO.size());

		System.out.printf("ȸ�� ��ü�� ����Ʈ �հ� : %d", getter());

	}

	@Override
	public void data() {
		this.DDD = new String[][] { { "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
				{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" },
				{ "���Ѽ�", "LG", "010-1267-4112", "37", "���α�", "soso4112@naver.com", "1200" },
				{ "���缺", "SKT", "010-3221-8871", "41", "������", "jsung_kks@naver.com", "700" },
				{ "�ѿ�", "KT", "010-2455-4879", "22", "��õ��", "han1004@nate.com", "920" },
				{ "������", "SKT", "010-3770-4009", "34", "���α�", "kans32@gmail.com", "1250" },
				{ "���", "KT", "010-1606-3137", "20", "����", "kimsil_love@nate.com", "4505" },
				{ "���Ѱ�", "SKT", "010-3412-0902", "31", "��õ��", "hanso12@nate.com", "2125" },
				{ "������", "LG", "010-4557-8282", "30", "����", "jehyuk@naver.com", "8160" },
				{ "�̼���", "KT", "010-3738-4800", "55", "������", "sunyoung@nate.com", "4510" },
				{ "������", "SKT", "010-5242-0879", "42", "������", "chreey@gmail.com", "6720" } };
	}

	@Override
	public int getter() {
		return this.total;
	}

}