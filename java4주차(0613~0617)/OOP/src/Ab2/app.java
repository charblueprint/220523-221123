package Ab2;

public class app {

	public static void main(String[] args) {
//		//(�ڽ�) = (�ڽ�)
//		members mb = new members();
//		mb.oop();
//		mb.oop2();
		
		//(�θ�) = (�ڽ�) => �������̽� �������� ����� �������̵常 ȣ��(����ȯ)
		members mb = new members(); 	//�ڽ� class ����
		app_data2 ap2 = mb; //�������̽� ���� (Ŭ����->�������̽� ����)
		//app_data1 ap1 = new members(); // app_data1�� ����ϰڴٴ� �ǹ�		
		//ap2.opp();=> �ν� ����
	
		app_data2 ap = new members();
		members mb2 = (members)ap2; //�ڽ� class�� �������̽��� �纯ȯ
		//(�������̽� -> Ŭ���� ��ȯ) 
	
	
	}

}
//class members implements app_data1 => app_data1�� ������ �ڷ��� �����ϴ� ���
class members implements app_data2{
	public void opp() {
		System.out.println("TEST1");
		oop();
	}
	@Override
	public void oop() {
		System.out.println("TEST2");
	}

	@Override
	public void oop2() {
		System.out.println("TEST3");
	}

}