import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner turn = new Scanner(System.in);
		System.out.print("On, Off 중에 하나를 선택하십시오.>> ");
		String own = turn.nextLine();

		if (own.equals("on") || own.equals("On") || own.equals("ON")) {
			System.out.println("true");
		} else if (own.equals("off") || own.equals("Off") || own.equals("oFF") || own.equals("OFF") || own.equals("ofF")
				|| own.equals("oFf")) {
			System.out.println("false");
		}

		turn.close();
	}

}
