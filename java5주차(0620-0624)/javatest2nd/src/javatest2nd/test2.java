package javatest2nd;

public class test2  {

	public static void main(String[] args) {
		price pr = new price();
		pr.datas();
		
		System.out.println("�����Ͻð��� �ϴ� �� ���� �ݾ���: "+pr.total+"���Դϴ�.");
	}
}
class price extends test2_data { //split
	static int total = 0; //�߿�
	public void datas() {
		String [] usershipping = {"���=2","����=1","����=1","��=1","��ġĵ=6","���=8"};
		//������ �����ϴϱ� ���ںκ��� ���ذ��鼭 split ������
	
	}
	
}