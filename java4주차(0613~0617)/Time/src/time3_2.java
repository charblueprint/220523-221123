import java.util.Timer;
import java.util.TimerTask;

public class time3_2 {

	public static void main(String[] args) {
		Ac A = new Ac();
		A.ACC();
	}

}
class Ac{ // timetask ��� 
	public void ACC() {
		Timer time = new Timer();
		System.out.println("��ø� ��ٷ��ּ���.\nó�����Դϴ�.");
		TimerTask Tt = new TimerTask() {
			int i=1;
			@Override
			public void run() {				
				System.out.print(".");
				i++;
				if(i>4) {					
					System.out.println("\n\n�Ա��� ��� ó���Ǿ����ϴ�.");
					System.exit(0);
				}
			}
		};
		time.scheduleAtFixedRate(Tt, 0, 2000);
	}
}