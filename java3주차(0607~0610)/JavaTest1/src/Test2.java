
public class Test2 {

	public static void main(String[] args) {
		int G = 100;
		String Grade;
		
		if (G >= 90) {
			Grade = "��� A";
		} else if ((G <= 89) && (G >= 70)) {
			Grade = "��� B";
		} else if ((G <= 69) && (G >= 50)) {
			Grade = "��� C";
		} else {
			Grade = "�Ϲ� ���";
		}

		System.out.printf("%s�Դϴ�.", Grade);
	}

}
