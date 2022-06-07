import java.util.Arrays;

/*응용문제 #4*/
/* 관리자에서 메뉴를 활성화하는 프로세서입니다. 
해당 메뉴 활성화는 2차배열이며, 메뉴명과 활성화하는 (Y,N)으로 구분합니다.
해당 활성화 값을 대입하여 "Y"로 적용되는 인덱스 번호에 맞는 메뉴명을 
1차 배열로 재구성 후 메인에서 출력 되도록 합니다. 
[결과] : [로켓배송,로켓프레시,골드박스,이벤트,추석]
단, private 및 return을 활용하여 프로그램을 작성합니다.
*/
public class Method9 {

	public static void main(String[] args) {
		Menus M = new Menus();
		System.out.println(Arrays.toString(M.menu()));
	}

}
class Menus{
	private String origin[][];
	private String choose[] = new String[5]; 
	
	public Menus(){
		String Ms[][] = {
				{"로켓배송","로켓프레시","쿠팡비즈","골드박스","이벤트","설날","추석"},
				{"Y","Y","N","Y","Y","N","Y"}};
		this.origin=Ms;
	}
	public String[] menu() {
		int i = 0,j = 0;
		String[] temp = new String[7]; // 기준에 맞는 것만 옮기기 위해 만들어진 temp
		do {
			if(this.origin[1][i].equals("Y")) {
				temp[j] = this.origin[0][i]; // 조건에 맞는것만 옮기는 중
				j++;//그럴때마다 temp의 계수와 this.origin의 계수가 하나씩 같이 증가
			} i++;
		} while(i<this.origin[0].length);
		choose = new String [j]; //choose가 temp와 연동
		for(; j > 0 ;) { //for문 앞에 j=0있고, 실행문 안에 --j가 있음! *저 j>0마저 없으면 무한루프 돈다고함
			choose[--j] = temp[j];			
		}
		return this.choose;
	}
}
