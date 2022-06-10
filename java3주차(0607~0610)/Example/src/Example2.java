
public class Example2 {
	private int user_choose;
	private int pc_choose;
	private String msg2 = null;

	public void User(int user, int pc, String msg) {
		// 사용자가 뽑은 숫자와 컴퓨터가 뽑은 숫자 애초에 같이 전달받음 (setter)
		this.user_choose = user;
		this.pc_choose = pc;
		this.msg2 = msg;

		if (this.pc_choose == this.user_choose) { // 어떤 상태인지 숫자를 정함
			this.msg2 = "정답"; // 옆에서는 이거 출력메세지 받고 끝내버리면 그만
		} else if (this.pc_choose > this.user_choose) {
			this.msg2 = "UP!";
		} else if (this.pc_choose < this.user_choose) {
			this.msg2 = "DOWN!";
		}
	}

	public String PC() { // 결과보내는 곳(getter)
		return this.msg2;
	}

}
