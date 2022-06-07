/*응용문제 #1(0607)*/
/* 인수값 2개의 숫자를 적용하여 계산 되도록 합니다.
 * 최종 계산을 받아서 결과를 출력하시오.
 * 157, 45
 * 157*45
 * 최종 결과값 출력 : 7065 */
/*#2*/
/*다음 숫자 하나를 해당 메소드롤 전달 하게 됩니다.
 * 해당 메소드에서는 다음과 같이 처리 합니다.
 * 숫자 3을 전달하면 3*1~3*9까지 모든 결과값을 더하여 sysout으로 출력 되도록 하십시오.*/
public class Method3 {

	public static void main(String[] args) {
		cal C = new cal();
		int result = C.Num(157, 45);
		//System.out.println(result);
		//C.Num2();
		
		/*#2*/
		int result2 = C.M1(3);
		System.out.println(result2);
		
		String ck = C.mb("park");
		System.out.println(ck);
	}
}
class cal {
	public int Num(int A, int B) {
		int Multi = A * B;
		return Multi;
	}
	public void Num() { 
		//동일한 변수명으로 쓸순 있는데 같은 변수명이 여러개면 헷갈려서 안쓰는 것일뿐, 
		System.out.println("연습입니다.");
	}
	public void Num2() {
		int z = Num(100,200);
		System.out.println(z);
	}
	public int M1(int A) {
		/*#2 연결*/
		int i = 1;
		int total = 0;
		do {
			total+=(A*i);
			i++;
		} while(i<=9);
		return total; //반복문 안에는 return 사용 불가 / 조건문이라도 더블로 return 사용 불가
	}
	public String mb(String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		} return msg; 
		/* 해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴 */
	}

}