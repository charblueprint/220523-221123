import java.awt.*;
import java.awt.event.*;

//awt 환경 설정 
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
		
		this.Bt = new Button("중복체크");
		this.Bt.setBackground(Color.lightGray);
		this.Bt.setBounds(190, 160, 80, 25);
		
		this.close = new Button("종료");
		this.close.setBackground(Color.lightGray);
		this.close.setBounds(200, 400, 80, 25);
		
		this.Mid = new TextField();
		this.Mid.setBounds(25, 160, 150, 25);
//		Font Fon = new Font("굴림체",Font.PLAIN,16);
		
		this.LAb.setBackground(Color.lightGray);
		this.LAb.setBounds(25, 200, 250, 25);
		
		this.F.add(this.Bt);
//		this.F.add();
		this.F.add(this.close);
		this.F.add(this.Mid);
		this.F.add(this.LAb);
		this.click(); //awt 디자인 완료후 해당 핸들링 메소드로 이동
	}	
		public void click() {
			this.Bt.addActionListener(new ActionListener() { //중복확인버튼
				@Override
				//setText(출력), getText(입력값 가져오기)
				public void actionPerformed(ActionEvent e) {
					String userid = awt5_abstract.this.LAb.getText();
					if(userid.equals("")) {
						LAb.setText("아이디를 입력하세요");
					} else {
						Search(userid);
						String result = signalok();
						if(result.equals("")) {
							LAb.setText("사용 가능한 아이디입니다!");
						} else {
							LAb.setText("다른 아이디를 입력해 주세요.");
						}
					}
				}
			});
			this.close.addActionListener(new ActionListener() { //종료버튼
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		
	
	}
