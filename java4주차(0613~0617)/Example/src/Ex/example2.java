import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 외부 클래스를 사용하여 다음 프로세서를 작성하시오.
		/* 다음 2개의 배열 데이터가 있습니다. 단, 2개의 배열을 하나의 배열로 합치도록 합니다.
		 그 대신 중복된 값은 하나로 처리를 하셔야 합니다.
		 1번 DB : 11,22,33,44,55 
		 2번 DB : 8,10,11,19,44
		 
		 결과 출력
		 [8,10,19,22,33,44,55]
		 */
public class example2 {
	public static void main(String[] args) {
		duplicate dup = new duplicate();
		dup.Dup();
	}
}
class duplicate{
	private ArrayList<Integer> Du1=null; private ArrayList<Integer> Du2=null;
	public void Dup(){
		Integer A[] = {11,22,33,44,55};
		Integer B[] = {8,10,11,19,44};
		this.Du1 = new ArrayList<Integer>(Arrays.asList(A));
		this.Du2 = new ArrayList<Integer>(Arrays.asList(B));
		
		int I = 0;
		do {
			int J = 0;
			do {
				if(this.Du1.get(I)==this.Du2.get(J)) {
					//Du1의 I번째 자료와 DU2의 J번째 자료가 같다면
					this.Du2.remove(J); //J번째 자료를 제거후
					this.Du2.add(J,0); //0을 추가 >> 즉 0은 중복된 자료라는 의미
				} J++;
			}while (J<this.Du2.size());
			I++;
		} while(I<this.Du1.size());
		 
		int K=0;
		do {
			if(this.Du2.get(K)!=0) {
				this.Du1.add(this.Du2.get(K)); //>>중복되는 자료인 0을 제거한다
			} K++;
		} while(K<this.Du2.size());
		Collections.sort(this.Du1); //오름차순 으로 정렬 >> Arraylist일때만 사용가능 
		System.out.println(this.Du1); 
	}
}