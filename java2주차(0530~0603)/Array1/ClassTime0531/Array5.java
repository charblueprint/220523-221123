package ClassTime0531;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		//�� �迭 ������ �����Ͱ� �ִ� �迭�� Ŀ����
		int a[] = new int[3];//3���� ������ ������
		int b[] = {1,2,3,4,5,6,7};//7���� ��ü�� �ִ� ��Ȳ
		int ea = b.length;//b �迭 �ȿ� ��� ������ ��ü
		//System.out.println(a.length);
		int a_ea = a.length;
		int t = 0; //b�迭�� ���� ��
		int tt =0;//a�迭�� ���� ��
		do {
			if (b[t]%2==0 && tt < a_ea) { // if (b �迭�� �� �� ¦���� && ���ο� a�迭�� ��ü ��üũ�� ��ŭ��
				a[tt] = b[t];
				tt++; //���Ǹ� ������ �ε��� ��ȣ�� +1�� ������Ŵ
			}
			t++;
		}while(t<ea);
		System.out.println(Arrays.toString(a));
		//Arrays.toString : ����,����,�Ҽ�[] ���� �迭 �������� ����ϴ� �Լ��Դϴ�.
	}

}
