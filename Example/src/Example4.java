
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� #2 ����������� ���缭 �ڵ尡 ��� �ǵ��� �Ͻÿ�. �ش��ڵ�� for������ �ۼ��մϴ�.
		 * 
		 * 45 35 25 15 10
		 */
		int N, M, FinalP;
		for (N = 1; N <= 4; N++) {
			M = 55 - (10 * N);
			System.out.print(M + " ");
			if (M <= 15) {
				FinalP = M - 5;
				System.out.println(FinalP);
			}
		}
		
		/* ����...
		 * int f;
		 * int v;
		 * for(f=9;f>0;f--) {
		 * 		v=5*f;
		 * 		if(f%2==1||f>=2) {
		 * 			if(f!=1){
		 * 				System.out.println(v+" "); 
		 * 			}
		 * 		}
		 * }
		 */
	}

}
