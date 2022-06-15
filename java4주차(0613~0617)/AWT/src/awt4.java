
public class awt4 {

	public static void main(String[] args) {
		// awt4_class.java 연계
		decorate de = new decorate();
		de.view();
	}

}

class decorate extends awt4_class {
	public String aws = "";
	protected int N;

	public void Btn_push(int Num) {
		/* 사용자가 입력한 숫자를 기준으로 구구단을 작성 */
		this.N = Num;
		int i = 1;
		String result = "";
		do {
			result += this.N + "*" + i + "=" + this.N * i + "\n";
			i++;
		} while (i < 10);

		this.aws = result;

		decorate d = new decorate();
		d.calls();
	}

	public String calls() {

		return this.aws;

	}

}