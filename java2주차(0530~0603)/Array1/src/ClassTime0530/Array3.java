/*#10*/
/*응용문제 #11
 *{"햄버거","피자","치킨","커피"} : epdlxj
 *"주문하고자 하는 음식을 선택해 주세요"
 * 해당 질문은 총 4번을 물어보게 됩니다.
 * 단, "주문 종료"라고 사용자가 입력시 그 즉시 주문은 종료되며,
 * 주문내역을 출력하시면 됩니다. */
/*#12
 * 사용자가 장바구니에 내용을 결제하게 됩니다.
 * 단, 해당 금액 리스트를 출력하지 말고 ,최종 전체 결제 금액만 출력되도록 합니다.
 * 1,500 22,000 13,000 14,500 113,800 45,000*/

package ClassTime0530;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int ArrayT [] = {5,10,15,20,25,30,35};
		/*for each문을 사용할때는 인덱스 번호가 필요없는 경우
		 *for - do~while문을 사용할때는 인덱스 번호가 필요할때 사용
		 *[0] [1] [2] - 인덱스 번호*/
		for(int f : ArrayT) { // int f가 순차적으로 data배열 값을 받아서 저장 시킵니다.
			if(f%2==0) {
				//System.out.println(f);				
			}
		}
		String pay[] = {"무통장 입금","신용카드", "휴대폰", "상품권","쿠폰"};
		//System.out.print("결제하고자 하는 형태를 선택해 주세요: ");
		//Scanner sc = new Scanner(System.in);
		//String pm = sc.next();
		for(String Z : pay) { 
			/* 묶음도 원래 형태 따라가야됨. 
			 * 배열 데이터가 문자이므로 받는 변수형태 또한 문자형을 사용해야 합니다.*/
			//if(pm.equals(Z)) {
				if(Z.equals("휴대폰")) {
					//System.out.println("현재 시스템 점검으로 해당 결제는 이용하실 수 없습니다.");
				} else {
					//System.out.println(pm+"(으)로 결제 진행됩니다.");
				}
			}
		
		/*#11 이거 도저히 못함 gg*/
		//Scanner Meal = new Scanner(System.in);
		String[] choose = new String[4]; //주문 받을 값 4개
		String Menus [] = {"햄버거","피자","치킨","커피"}; //데이터 있죠?
		System.out.println("햄버거, 피자, 치킨, 커피 \n주문하고자 하는 음식을 선택해 주세요. >> ");
		String k = Meal.next();
		int i = 0;//인덱스 번호 생성
		for(String C : Menus) {
			if(C.equals("햄버거")|| C.equals("피자")||C.equals("치킨")||C.equals("커피")) {
				Menus[i] = C;
				i++;
			}
		int chooses = Menus.length;
		System.out.println("주문내역 \n" + Arrays.toString(choose));
			}
		
		
		String[] names = new String[3];//값이 없는 배열 공간만 만들어놨음
		String m[] = {"홍길동","이순신","강감찬"};//배열값에 데이터가 있는 상태
		int ct = 0;//for each에는 인덱스 번호가 없으므로 새롭게 인덱스 번호를 지정해 주기 위한 변수
		for(String a : m) {
			if (a.equals("홍길동")||a.equals("강감찬")) {
				//해당 (기존)배열값중 조건에 맞는 값만 추려서 새로운 배열값에 추가함
				names[ct] = a;
				ct++; //인덱스 번호를 순차적으로 적용하기 위한 증가값
			}
		}
		int name_ea = names.length;
		//System.out.println(Arrays.toString(names));
		}
		/*#12 */
		Scanner sc = new Scanner(System.in);
		DecimalFormat dot = new DecimalFormat("###,###");
		int recepit [] = {1500, 22000, 13000, 14500, 113800, 45000};
		int total = 0;
		int i;
		for (i=0;i<recepit.length;i++) {
			total+=recepit[i];
		}
		System.out.println("최종결제 금액은 "+ dot.format(total) + "원 입니다.");
		
	}


