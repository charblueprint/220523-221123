//(0602) 시작점
public class Class3 {

	public static void main(String[] args) {
		//자료형(데이터형) 변환
		//double->int 변환
		double a = 1.37;
		int b = (int) a;
		
		//int -> double 변환
		int c = 35;
		double d = (double) c;
		System.out.println(d);
		
		//String->int 변환
		String x = "35";
		String y = "156";
		//int z = Integer.parseInt(x); // parseInt (int형에 사용하는 산술연산 언어임)
		int z = Integer.valueOf(x); //valueOf 클래스 메소드(메소드함수) ->(포함) parseInt 
		int total = Integer.parseInt(x)+ Integer.parseInt(y); //문자형을 숫자로 변환하여 산술계산을 처리함
		System.out.println(total);
		
		//Long 사용시 Long.parseLong 사용함.
		String j = "999996789";
		String j2 = "999997899";
		//int total2= Integer.parseInt(j)+Integer.parseInt(j2);
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3= (double) total2;
		System.out.println(total2);
		System.out.println(total3);
		
		//문자 (char)-> 문자(String) : 기본 지식만 제공
		char part = '셉';
		String f = String.valueOf(part); // 문자 -> 문자 변환 함수. valueOf만 사용! 
		System.out.println(f);
		
		
		
	}

}
