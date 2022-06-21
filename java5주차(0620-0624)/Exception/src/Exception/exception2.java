package Exception;

public class exception2 {

	public static void main(String[] args) {
		
		try {
			//test(); // 메소드 호출은 자제해야 합니다. 왜냐, 여기의 error은 그냥 호출의 에러라 Exception과 관계가 없기 때문
			exception2 e2 = new exception2();
			String a = "홍길동";
			e2.test(a);
		} catch (Exception z) {
			System.out.println(z);
		}
	}
	public void test(String b) throws Exception,NumberFormatException{ //이 throw가 없더라도 가능은 한데 이 test클래스에서 받을때 오류남.. 그냥 쓰자
		//throws는 main 메소드에서 예외 처리 없이 해당메소드를 호출할 경우를 막기 위해 사용합니다.
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c;	
		//코드 맨 밑에 사용을 하며 throw = return과 비슷한 성격을 가지고 있습니다.
		//예외처리 결과에 대한 값을 main메소드로 다시 return시킴
	}

}
