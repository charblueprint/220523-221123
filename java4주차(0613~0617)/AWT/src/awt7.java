import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ckb=null;
	static boolean agree = false;
	
	public static void main(String[] args) {
		Frame FF = new Frame();
		FF.setTitle("������ȣ");
		FF.setBounds(200, 200, 350, 180);
		FF.setLayout(null);
		FF.setVisible(true);
		
		Checkbox ckb = new Checkbox("����");
		Choice se = new Choice();
		ckb.setBounds(30, 40, 150, 30);
		se.setBounds(30, 80, 100, 30);
		se.add("��Ż�");
		se.add("SKT");
		se.add("KT");
		se.add("LGU+");
		se.add("�˶���");
		
		FF.add(ckb);
		FF.add(se);
		/*addItemListener : Checkbox, choice���� �����*/
		ckb.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				/*String checks = (String)e.getItem();
				System.out.println(checks);*/
				System.out.println(e.getStateChange());
				if(e.getStateChange()==1) {
					agree=false;
//					System.out.println("�����ϼ̽��ϴ�.");
				} else {
					agree=true;
//					System.out.println("�����ϼž� �մϴ�.");
				}
				//1 : check 2 : uncheck
			}
		});
		se.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String) e.getItem();
				System.out.println(change);
			}
		});
		
	}

}
