package ClassTime;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Double_loop1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYYҴMM��dd��");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		//mm: �ð��� �� MM:������� 
		System.out.println(date.format(today));
		//format : �԰�ȭ �� ���·� ���� ǥ���Ҷ� ����ϰ� �˴ϴ�.
		System.out.println(time.format(today));
		
		int u;
			for(u=1;u<=10;u=u+2) {
				System.out.println(u+" ");
			}
	}

}
