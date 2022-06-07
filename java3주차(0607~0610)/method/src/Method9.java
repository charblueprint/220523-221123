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
		int i = 0,j=0;
		do {
			if(this.origin[1][i].equals("Y")) {
				choose[j] = this.origin[0][i];
				j++;
			} i++;
		} while(i<this.origin[0].length);
		
		return this.choose;
	} 
}
