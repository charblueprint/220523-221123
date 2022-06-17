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
		FF.setTitle("인증번호");
		FF.setBounds(200, 200, 350, 180);
		FF.setLayout(null);
		FF.setVisible(true);
		
		Checkbox ckb = new Checkbox("동의");
		Choice se = new Choice();
		ckb.setBounds(30, 40, 150, 30);
		se.setBounds(30, 80, 100, 30);
		se.add("통신사");
		se.add("SKT");
		se.add("KT");
		se.add("LGU+");
		se.add("알뜰폰");
		
		FF.add(ckb);
		FF.add(se);
		/*addItemListener : Checkbox, choice에서 사용함*/
		ckb.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				/*String checks = (String)e.getItem();
				System.out.println(checks);*/
				System.out.println(e.getStateChange());
				if(e.getStateChange()==1) {
					agree=false;
//					System.out.println("동의하셨습니다.");
				} else {
					agree=true;
//					System.out.println("동의하셔야 합니다.");
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
