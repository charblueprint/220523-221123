package ClassTime0530;

public class Array1 {

	public static void main(String[] args) {
		//배열이란? 나열된 데이터 형태를 말합니다. (Array)
		//문자로 주느냐 숫자로 주느냐..
		/* 배열기호는 다음과 같습니다 => [], {} */
		int a[] = new int[7]; //a[] 변수이지만 배열값을 받는 변수
		//new int[4] : 숫자로된 4개의 배열값을 생성한다고 선언
		a[0]=5; 
		a[1]=15;
		a[2]=25;
		a[3]=35;
		// new int[배열 범위] : 해당 범위는 실제데이터보다 무조건 커야함
		
		int ae = a.length;//length는 배열의 갯수를 파악할때 사용합니다.
		//System.out.println(ae);
		int f;
		for(f=0;f<ae;f++) {
			System.out.println(a[f]); //a[f] : a[0]~a[4]
		}
		String user[] = new String[3];
		user[0] = "홍길동";
		user[1] = "이순신";
		user[2] = "강감찬";
		int k = user.length;
		int w = 0;
		while(w<k) {
			System.out.println(user[w]);
			w++;
		}
		//int[] z : 배열값을 선언하고 해당 데이터를 직접적으로 자동구분하여 적용
		//int z[] : 배열값을 선언하면서 직접 0부터 선언하여 값을 구분함. << 근데 이거 바뀜
		//일차 배열
		int [] z = new int [] {10,20,30,33,42,11};
		int zea = z.length;
		System.out.println(zea);
		int ww=0;
		do {
			System.out.println(z[ww]);
			ww++;
		} while(ww<zea);
		
		
		//aa[] 배열 사용시 배열범위 + 값을 지속적을 넣어야 하는 불편함이 있음. 버젼이 변경되면서 
		//a[] 배열 값{}로 인식시킬수 있도록 변화됨.
		int aa[] = {10,11,22,33,55}; //(34번째줄) 이렇게!
		int aea = aa.length;
		System.out.println(aea);
		int aw=0;
		while(aw<aea) {
			System.out.println(aa[aw]);
			aw++;
		}
	
	
	}

}
