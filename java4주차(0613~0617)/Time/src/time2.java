import java.util.Timer;
import java.util.TimerTask;

public class time2  {
	
	public static void main(String[] args) {
		Timer timer = new Timer(); //Timer util�� �̿��Ͽ� �ð��Լ� ���
		//timer.scheduleAtFixedRate(new gogo(), 0, 5000);
		//(������ �޼ҵ�/Ŭ����,���ʵڿ� ����, �ݺ��ð�)
		//scheduleAtFixedRate : ���������� �ݺ��۾��� �� ��
		TimerTask TT = new TimerTask() { // ��ʳ� �ε�ȭ�� �Ҷ�!
			int a = 0;
			String adata[] = {"ȫ�浿","�̼���","������","������"};
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
//class gogo extends TimerTask{ // TimerTask : �ð� �۾� 
//	public void run() { //Task���� �����ϴ� �޼ҵ�
//		int i;
//		for(i=0; ;i++) {			
//			System.out.println(i);
//		}
//	}
//}
