
public class Test3 {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		int total=0;
		do {
			do {
				total+=(i+j);
				j++;
			} while(j<=9);
			i++;
		} while(i<=5);
		System.out.println("최종 결과 값 : "+total);
	}

}
