package Ab2;

public class Example1 {
	public static void main(String[] args) {
		home h[] = { new computer(), new moniter(),  };
		home2 h2[] = {new phone()}; //extends�� home�� �ε��Ͽ���
		h[0].broken(40);
		h[1].broken(89);
		h2[0].broken(40);
//		h[2].broken(10);
	}
}
class computer implements home {
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ� ");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("��ǻ�� ����!");
		} else if ((this.bk > n) && (n > 0)) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}
class moniter implements home {
	@Override
	public void poweron() {
		System.out.println("����� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ� ");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("����� ����!");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}
/* �޴����� �߰� ����� �ʿ��մϴ�. �޴��� ����� �ּ� ����(20) -> ���� ���� (40~79) / 80 �̻� : ����
 1.ȭ�� �� ������ ���޵����� ȭ���� ����(���� �� �۵��� �ȵǴ� ���) - 20���� 39����
 2.������ ���޽�Ű����, ���͸� ������ �� �� ���.(������ �ƿ� �ȵǴ� ���) - 20���� ������ ���
 */
class phone implements home2 {
	@Override
	public void poweron() {
		System.out.println("�޴��� ���� ������!!");
	}
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�!!");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("�޴��� ����!!");
		} else if (this.bk > n && n >= 0) {
			if (n >= 40) { this.poweron();} 
			else if(n >= 20 && n<= 39) { this.powerchk1();}				
			else if(n < 20) { this.powerchk2();}
			else { this.poweroff(); }
		}
	}
	@Override
	public void powerchk1() {
		System.out.println("ȭ�� ����. ���� ���͸� �湮�ϼ���");
	}
	@Override
	public void powerchk2() {
		System.out.println("���͸� ���� ����");
	}
}