
public class Test2 {

	public static void main(String[] args) {
		int G = 100;
		String Grade;
		
		if (G >= 90) {
			Grade = "등급 A";
		} else if ((G <= 89) && (G >= 70)) {
			Grade = "등급 B";
		} else if ((G <= 69) && (G >= 50)) {
			Grade = "등급 C";
		} else {
			Grade = "일반 등급";
		}

		System.out.printf("%s입니다.", Grade);
	}

}
