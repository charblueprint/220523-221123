package List1;
/*응용문제 #2*/
/*해당 데이터값 중 휴면고객 데이터는 모두 삭제되어야 합니다.
 고객데이터 : {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"}
 결과 : 정재욱, 하윤성
 */

/*응용문제 #3*/
/* 짝수의 숫자를 모두 삭제합니다.
 10,7,6,1,11,37,41,22
 
 결과 : 7,1,11,37,41 */
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		//#2
		String data[] = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> Sleep = new ArrayList<>(Arrays.asList(data));
		int i = 0;
		while(i<Sleep.size()) {
			int j=0;
			while(j<=0) { //node의 갯수를 다시 확인함
				if(!Sleep.get(j).equals("정재욱")&&!Sleep.get(j).equals("하윤성")) {
					Sleep.remove(0);
					System.out.println(Sleep);
					j++;
					}
			}
			i++;
		}
		//#3
		Integer not_odd[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(not_odd));
		
		int A = 0;
		int o1 = arr1.size();
		while(A<o1); {
			int o2 = arr1.size();
			int B=0;
				do {
					if(arr1.get(B) % 2 == 0) {
						arr1.remove(B);
						break;
					}
					B++;
				} while(B<o2);
			A++;
			System.out.println(arr1.get(B));
		} 
		
	}

}
