import java.awt.*;
import java.awt.event.*;


public abstract class awt6_abstract {
	public abstract void data();
	public abstract void doublecheck();
	public abstract int Num();
	Frame Fr = new Frame();
	Button Bu1 = null;
	Button Bu2 = null;
	Button close = null;
	TextField Pass = null;
	Label ch = new Label();
	
	public void setting() {
		this.Fr.setTitle("������ȣ");
		this.Fr.setBounds(200, 200, 350, 180);
		this.Fr.setLayout(null);
		this.Fr.setVisible(true);
	
		this.Bu1 = new Button("������ȣ �߼�");
		this.Bu1.setBackground(Color.lightGray);
		this.Bu1.setBounds(45, 50, 100, 25);
		
		this.Bu2 = new Button("������ȣ Ȯ��");
		this.Bu2.setBackground(Color.lightGray);
		this.Bu2.setBounds(195, 80, 100, 25);
	
		this.close = new Button("x");
		this.close.setBackground(Color.lightGray);
		this.close.setBounds(265, 50, 30, 25);
	
		this.Pass = new TextField();
		this.Pass.setBounds(45, 80, 140, 25);
		
		this.ch.setBackground(Color.lightGray);
		this.ch.setBounds(45, 115, 250, 25);
		
		this.Fr.add(this.Bu1);
		this.Fr.add(this.Bu2);
		this.Fr.add(this.close);
		this.Fr.add(this.Pass);
		this.Fr.add(this.ch);
		this.clickB();
	}
	public void clickB(){
		this.close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.Bu1.addActionListener(new ActionListener() {// ������ �۵���Ŵ
			@Override
			public void actionPerformed(ActionEvent e) {
				start ST = new start();
				ST.data();
			}
		});
		this.Bu2.addActionListener(new ActionListener() { //���� ���� ��ǻ���� �� ��
			@Override
			public void actionPerformed(ActionEvent e) {
				String pass = awt6_abstract.this.Pass.getText();
				if(pass.equals("")) {
					ch.setText("������ȣ 4�ڸ��� �Է��ϼ���");
				} else {
					
				}
//				int vaildnum = Integer.parseInt(pass);
//				start ST = new start();
//				ST.doublecheck(vaildnum);
				
				
//				if() {
//					this.operate=true;
//					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
//				} else {
//					System.out.println("������ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.");
//				}
				
			}
		});;
		
	}
	
	
}
