import java.util.Arrays;

/*#2
 <배열 + 기본(클래스) 메소드 문제>
 product : 수박, 참외, 사과,배,딸기, 키위, 바나나, 망고
 중 참외, 배, 키위를 삭제함.
 해당 삭제후 배열 을 다시 재 리스트하는 코드를 작성하시오.
 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며
 반복문은 자유
 결과 : [수박,사과,딸기,바나나,망고]*/
public class Example2 {

	public static void main(String[] args) {
		String product[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		Example2 I = new Example2();
		I.P(product);
		
	}
	
	
	public void P(String product[]) {
		int i = 0;
		int j = 0;
		boolean yes = false;
		String item[] = new String[j];
		do { 
			do {
				if(!product.equals("참외")&&!product.equals("배")||!product.equals("키위")) {
					product[i]=item[j];
				}
				yes = true;
				j++;
			}while(j<item.length);
			i++;
		} while(i<product.length);
		System.out.println(Arrays.toString(item));
		
		//System.out.println(product[1]);
	}

}
