/*응용문제 #3(0607)*/
/*협업 프로그래머가 해당 DB에 (Database) 값중 홀수값에 대한 총 갯수를 받고자 합니다.
 *데이터 => int odata[] = {15,22,17,14,32,35,19,33};
 *해당 갯수를 출력 될 수 있도록 코드를 작성 하시오.*/
public class Method8 {

	public static void main(String[] args) {
		odbc OD = new odbc();
		System.out.println(OD.Nums());
	}

}
class odbc{
	private int count = 0; //odbc라는 클래스 필드에 선언한 count의 값(여기에 final 선언하면 안바뀜)
	private int ori[];// 배열 값이 변경되지 않도록 사용
	/*private를 어떻게 쓰냐에 따라서 값이 달라짐 >> 보안에도 영향을 미친다.*/
	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.ori = odata;
		
	}
	public int Nums() { //int Nums() 내가 여기서 받아서 안 돌아갔던거임 빈칸으로 두자
		int i=0;
		while(i<this.ori.length) {
			if(this.ori[i]%2==1) {
				this.count++;
			}
			i++;
		}
		return this.count;//(최종 값을 리턴) + 변하면 안되는 값에 this 때리기
		/* <중요> return은
		public int Nums()나
		public String Nums()에서만 가능함
		그리고 return문 시작점 ()에 아무것도 두지말자
		******그리고 static void에 this.___ 사용하면 안 먹힌다.******
		*/
	}
}