
public class Test5 {

	public static void main(String[] args) {
		int i = 1;
		int total=0;
		while(i<=100) {
			if(total>4000) {
				System.out.println(total);
				break;
			} else{
				total=total+i;
				i++;
			}
		}
		
	}

}
