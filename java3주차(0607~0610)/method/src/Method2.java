
public class Method2 {

	public static void main(String[] args) {
		/*
		 * (default package) 사용시 해당 class명을 호출하면 됨 
		 * 단, package로 묶여 있을 경우는 제일 상단에 package를 선언해야함
		 tests ts = new tests(); 
		 ts.a2++; 
		 System.out.println(ts.a2);
		 */
		info i = new info();
		// System.out.println(i.data1(20));
		// System.out.println(i.data2(20));

		/* 이게 될 때 */ // public int data3(int A) 줄 참고
		System.out.println(i.data3(20));
		String result = i.data4("홍길동");
		System.out.println(result);
		/*Data4 메소드 RESULT 값을 Result 변수로 받아서 처리*/
	}

}

class info {
	/* static 또는 void메소드에는 return이라는 명령어를 사용하지 못함 */
	public static void data1(int A) {
		int z = A + 20;
		System.out.println(z);
		// return z; <- 이렇게 써봤자 백날 천날 안됨
	}

	public void data2(int A) {
		int z = A + 20;
		System.out.println(z);
		// return z; <- 2222
	}

	public int data3(int A) {
		/* 자료형의 메소드라고 말하며, 무조건 return 사용 해야합니다. 단, sysout을 사용하지 못합니다. */
		int z = A + 20;
		return z;
	}

	public String data4(String A) {
		String z = A + "님 환영합니다.";
		return z; //얘 없으면 의미가 없다고
	}
}
