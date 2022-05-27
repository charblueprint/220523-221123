package ClassTime;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Double_loop1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY年MM月dd日");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		//mm: 시간의 분 MM:몇월인지 
		System.out.println(date.format(today));
		//format : 규격화 된 형태로 값을 표현할때 사용하게 됩니다.
		System.out.println(time.format(today));
		
		int u;
			for(u=1;u<=10;u=u+2) {
				System.out.println(u+" ");
			}
	}

}
