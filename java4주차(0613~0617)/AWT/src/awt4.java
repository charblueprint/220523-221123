
public class awt4 {

	public static void main(String[] args) {
		// awt4_class.java ����
		decorate de = new decorate();
		de.view();
	}

}

class decorate extends awt4_class {
	public String aws = "";
	protected int N;

	public void Btn_push(int Num) {
		/* ����ڰ� �Է��� ���ڸ� �������� �������� �ۼ� */
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