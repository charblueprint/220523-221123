import java.awt.*;
import java.awt.event.*;

//awt ȯ�� ���� 
public abstract class awt5_abstract {
	public abstract String signalok(); //getter
	public abstract void Search(String ID); //setter
	public abstract void dataload(); // database
	Frame F= new Frame();
	Button Bt = null;
	Button close = null;
	TextField Mid = null;
	Label LAb = new Label();
	
	public void design() {
		this.F.setTitle("LOGIN");
		this.F.setBounds(200, 200, 300, 450);
		this.F.setLayout(null);
		this.F.setVisible(true);
		
		this.Bt = new Button("�ߺ�üũ");
		this.Bt.setBackground(Color.lightGray);
		this.Bt.setBounds(190, 160, 80, 25);
		
		this.close = new Button("����");
		this.close.setBackground(Color.lightGray);
		this.close.setBounds(200, 400, 80, 25);
		
		this.Mid = new TextField();
		this.Mid.setBounds(25, 160, 150, 25);
//		Font Fon = new Font("����ü",Font.PLAIN,16);
		
		this.LAb.setBackground(Color.lightGray);
		this.LAb.setBounds(25, 200, 250, 25);
		
		this.F.add(this.Bt);
//		this.F.add();
		this.F.add(this.close);
		this.F.add(this.Mid);
		this.F.add(this.LAb);
		this.click(); //awt ������ �Ϸ��� �ش� �ڵ鸵 �޼ҵ�� �̵�
	}	
		public void click() {
			this.Bt.addActionListener(new ActionListener() { //�ߺ�Ȯ�ι�ư
				@Override
				//setText(���), getText(�Է°� ��������)
				public void actionPerformed(ActionEvent e) {
					String userid = awt5_abstract.this.LAb.getText();
					if(userid.equals("")) {
						LAb.setText("���̵� �Է��ϼ���");
					} else {
						Search(userid);
						String result = signalok();
						if(result.equals("")) {
							LAb.setText("��� ������ ���̵��Դϴ�!");
						} else {
							LAb.setText("�ٸ� ���̵� �Է��� �ּ���.");
						}
					}
				}
			});
			this.close.addActionListener(new ActionListener() { //�����ư
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		
	
	}
