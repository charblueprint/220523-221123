import java.util.Arrays;

public class Q2anwser {

	public static void main(String[] args) {
		String product1[] = {"수박", "참외", "사과", "배", "딸기", "키위", "바나나", "망고"};
		Q2anwser I1 = new Q2anwser();
		I1.P1(product1);
	}
	
	public void P1(String pd[]) {
		int no = 5;
		String newproduct1[] = new String[no];
		int id = 0;
		for(String p1 : pd) {
			if(!pd.equals("참외")&&!pd.equals("배")||!pd.equals("키위")) {
				newproduct1[id]=p1;
				id++;
			}
		}
		System.out.println(Arrays.toString(newproduct1));
	}
}
