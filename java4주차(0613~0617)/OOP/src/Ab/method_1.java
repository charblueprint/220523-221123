package Ab;
//method_1a.java
public class method_1 extends ide_mth1 {
//package Ab2에서 import 할 수 있도록 하며, 외부 클래스도 동일하게 모두 가져오게 함.
//원래 ide_mth1는 외부 클래스라 그냥은 외부에서 끌고오지 못하는데 public class에 상속하면 쓸 수 있다!!(그리고 public class는 한번밖에 쓰지 못함)
/* Arrays.sort() : 배열 오름차순 정렬(숫자,한글,영문)
 단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬 됩니다.*/
	public void recall() {
		System.out.println("Test");
	} public void name() {
		System.out.println("홍길동");
	}
	//protected 써야 공유가능함
	public static void main(String[] args) {
//		int number_data[] = {5,7,1,4,9,2};
//		Arrays.sort(number_data); //숫자 오름차순 정리
		/*String user_data[]= {"홍길동","이순신","장보고","김유신"};
		Arrays.sort(user_data);
		System.out.println(Arrays.toString(user_data));*/
		
		ide_mth1 imt1 = new ide_mth1();
		String a= "seo"; int b = 2000;
		imt1.setter(a, b);
		
		System.out.println(imt1.getter());
		
		/*변수를 2개 생성해서 하나는 문자, 숫자
		 현재 가입된 사용자에 아이디를 확인 후 해당 포인트가 적립 되도록 합니다.
		 단, 기본 포인트 + 적립금 포인트에 대한 결과를 출력하셔야 합니다.
		 출력은 main class에서 사용함.
		 배열 데이터  : String membership[][]={
		 {"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
		 {"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
		 */
	}
}
class ide_mth1 extends mth1{
	protected String data1;
	protected int data2;
	private int result=0;
	private String membership[][];
	
	public ide_mth1() {
		this.membership = new String[][] {{"kim","park","seo","oh","lee","jang","jeong","cho","ha","hwang"},
			 {"1500","800","2000","1000","4200","2200","3000","500","1000","1800"}};
	}
	@Override
	public void setter(String data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
		int i = 0;
		do {
			if(this.membership[0][i].equals(this.data1));{
				this.result = Integer.parseInt(this.membership[1][i],10) + this.data2;
			}
			i++;
		} while (i<this.membership[0].length);
		
	}

	@Override
	public void setter(int data3[]){} //안쓸것임

	@Override
	public String getter() {
		String msg = this.data1+"님의 현재 포인트는 "+this.result+"점입니다.";
		return msg;
	}
}