import java.util.Timer;
import java.util.TimerTask;

public class time3_2 {

	public static void main(String[] args) {
		Ac A = new Ac();
		A.ACC();
	}

}
class Ac{ // timetask 사용 
	public void ACC() {
		Timer time = new Timer();
		System.out.println("잠시만 기다려주세요.\n처리중입니다.");
		TimerTask Tt = new TimerTask() {
			int i=1;
			@Override
			public void run() {				
				System.out.print(".");
				i++;
				if(i>4) {					
					System.out.println("\n\n입금이 모두 처리되었습니다.");
					System.exit(0);
				}
			}
		};
		time.scheduleAtFixedRate(Tt, 0, 2000);
	}
}