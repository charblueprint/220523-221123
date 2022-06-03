/*#7
 <다차원 배열로 생성 + 외부 class 및 메소드 사용>
 [data]
String data = {{"홍길동","합격"}, {"이순신","합격"}, {"강감찬","불합격"}, {"김유신","합격"}, {"유관순","불합격"}, {"장보고","불합격"}};
 
 다차원 배열 형태이며, 해당값중 합격자만 출력되도록 합니다.
 단, 배열값을 외부틀래스 안에 메소드에서 처리가 되도록 합니다.
 결과 : 홍길동 이순신 김유신
 
 
 * */
public class Example7 {

	public static void main(String[] args) {
		Data3.Pass(); // 넘길게 없는 경우 그냥 빈칸으로 둡시다. 빈손이면 빈손으로 넘어가도 된다는의미!

	}

}

class Data3 {
	public static void Pass() {
		String data[][] = { { "홍길동", "합격" }, { "이순신", "합격" }, { "강감찬", "불합격" }, { "김유신", "합격" }, { "유관순", "불합격" },
				{ "장보고", "불합격" } };

		int i = 0;// i는 큰 묶음으로 6개
		do {
			int j = 0; // j는 구성품으로 2개
			do {
				if (data[i][j].equals("합격")) {
					System.out.print(data[i][0] + " ");
				}
				j++;
			} while (j < data[0].length);
			i++;
		} while (i < data.length);
	}
}