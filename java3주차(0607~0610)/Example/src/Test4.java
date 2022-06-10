
public class Test4 {

	public static void main(String[] args) {
		int array[]= {5,3,1,10,6,12};
		int i ;
		for(i=0; i<array.length; i++) {
			if((array[i]>=7)&&(array[i]%3==0)) {
				//System.out.print(array[i]+" ");
			}
		}
		//해당 배열값중 짝수 값 및
		int array2[]= {55,44,33,22,11,10,9,8,7,6,5,4,3,2,1};
		int j = 0;
		do {
			if((array2[j]%2== 0) && (array2[j]<10)) {
				System.out.print(array2[j]+" ");
			}
			j++;
		} while(j<array2.length);
		
	}

}
