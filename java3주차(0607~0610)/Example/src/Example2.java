
public class Example2 {
	private int user_choose;
	private int pc_choose;
	private String msg2 = null;
	// Example1 E1 = new Example1();

	public void User(int user, int pc) { // ����ڰ� ���� ���ڿ� ��ǻ�Ͱ� ���� ���� ���ʿ� ���� ���޹���
		// this.msg2 = msg2;
		this.user_choose = user;
		this.pc_choose = pc;
		this.msg2 = msg2;
		
		if (this.pc_choose == this.user_choose) { // � �������� ���ڸ� ����
			this.msg2 = "�����Դϴ�!!"; // �������� �̰� ��¸޼��� �ް� ���������� �׸�
		} else if (this.pc_choose > this.user_choose) {
			this.msg2 = "UP!";
		} else if (this.pc_choose < this.user_choose) {
			this.msg2 = "DOWN!";
		}
	}

	public String PC() { // ��������� ��
		return this.msg2;
	}

}
