
public class Example2 {
	private int user_choose;
	private int pc_choose;
	private String msg2 = null;

	public void User(int user, int pc, String msg) {
		// ����ڰ� ���� ���ڿ� ��ǻ�Ͱ� ���� ���� ���ʿ� ���� ���޹��� (setter)
		this.user_choose = user;
		this.pc_choose = pc;
		this.msg2 = msg;

		if (this.pc_choose == this.user_choose) { // � �������� ���ڸ� ����
			this.msg2 = "����"; // �������� �̰� ��¸޼��� �ް� ���������� �׸�
		} else if (this.pc_choose > this.user_choose) {
			this.msg2 = "UP!";
		} else if (this.pc_choose < this.user_choose) {
			this.msg2 = "DOWN!";
		}
	}

	public String PC() { // ��������� ��(getter)
		return this.msg2;
	}

}
