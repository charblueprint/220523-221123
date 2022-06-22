import java.util.Scanner;

public class datatype {
	//String pool 영역에 같이 있으면 : ==,equals
	//String pool 영역,HEAP 영역 : Equals
	//HEAP 영역에 있을 때 비교 : equals
	//intern()의 효과는 String pool에 가상으로 있다고 가정하게 하는것으로, 단순하게 말하면 양다리 걸치기가 가능해진다고 보는것임다.

	public static void main(String[] args) {
		//intern() : equals를 사용하지 않고 ==(부등호 기호로 사용가능)
		String data2[] = new String[] {"홍길동"};
		String data[] = {"홍길동","홍길동"};
		String a = "홍길동"; //String pool에 있음
		String b = "홍길동"; // 얘도
		
		//new String : 소속이 없는 자유분방한 자료형 (문자,배열값)
		String c = new String("홍길동").intern();
		String d = new String("홍길동");
		
		String h = new String(data[0]).intern();
		String h2 = new String(data[1]).intern();
		String h3 = new String(data[1]).intern();
		String e = data[0];
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next().intern();
		String g = new String(a);
		
		System.out.println(a==b);
		System.out.println(a.equals(b)); //둘 다 가능한 이유가 지금 둘 다 String pool에 있기 때문이다.
		
		
		
	}

}
