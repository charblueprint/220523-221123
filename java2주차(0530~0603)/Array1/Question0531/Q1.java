/*응용문제 (0531)
 * 다음 배열 값이 있습니다. 해당 배열 값을 비교하여 사용자 정보를 출력하시오
 * 
 * Adata = hong kim park jang lee soun
 * Bdata = 80 100 46 38 65 88
 * 
 * 결과 배열에 따른 조건은 60점 이상(포함) 중 합격자만 출력합니다.
 * 결과배열 >> [hong,kim,lee,soun]*/
package Question0531;

public class Q1 {

	public static void main(String[] args) {
		String data [][] = {{"hong", "kim", "park", "jang", "lee", "soun"},{"80", "100", "46", "38", "65", "88"}};
		
		int A = data[0].length;
		int B = data.length;
		
		String newdata [] = new String [A];
		int i = 0;
		do {
			int total = 0;
			int total1 = 0;
			int j =0;
			do{
				if(j==0){
					total = data[i][j];
				} else {
					total1 = data[i][j];
				}
				j++;
			}while(j<B);
			newdata[i]=total+total1;
			i++;
		} while(i<A);
		
		if(newdata[i]>=60){
			
		}

	}

}
