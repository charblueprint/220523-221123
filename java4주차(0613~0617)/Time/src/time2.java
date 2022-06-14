import java.util.Timer;
import java.util.TimerTask;

public class time2  {
	
	public static void main(String[] args) {
		Timer timer = new Timer(); //Timer util을 이용하여 시간함수 사용
		//timer.scheduleAtFixedRate(new gogo(), 0, 5000);
		//(시작할 메소드/클래스,몇초뒤에 시작, 반복시간)
		//scheduleAtFixedRate : 지속적으로 반복작업을 할 때
		TimerTask TT = new TimerTask() { // 배너나 로딩화면 할때!
			int a = 0;
			String adata[] = {"홍길동","이순신","강감찬","유관순"};
			@Override
			public void run() {
				if(a>=4) {
					a = 0;
				}
				System.out.println(adata[a]);
				a++;
			}
		};
		timer.scheduleAtFixedRate(TT, 0, 4500);
	}	
}
//class gogo extends TimerTask{ // TimerTask : 시간 작업 
//	public void run() { //Task에서 실행하는 메소드
//		int i;
//		for(i=0; ;i++) {			
//			System.out.println(i);
//		}
//	}
//}
