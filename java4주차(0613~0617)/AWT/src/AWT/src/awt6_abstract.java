import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {
	public abstract void setdata();//인증번호 발송

	public abstract String getdata();//인증확인 버튼

	Frame Fr = new Frame();
	Button Bu1 = null;
	Button Bu2 = null;
	Button close = null;
	TextField Pass = null;
	Label ch = new Label();

	public void setting() { // 작동 시작2
		this.Fr.setTitle("인증번호");
		this.Fr.setBounds(200, 200, 350, 180);
		this.Fr.setLayout(null);
		this.Fr.setVisible(true);

		this.Bu1 = new Button("인증번호 발송");
		this.Bu1.setBackground(Color.lightGray);
		this.Bu1.setBounds(45, 50, 100, 25);

		this.Bu2 = new Button("인증번호 확인");
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
		this.clickB(); //클릭하면 작동하는 것 3
	}

	public void clickB() {
		this.close.addActionListener(new ActionListener() { //닫기버튼 눌렀을 때 4-1
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.Bu1.addActionListener(new ActionListener() {// 눌러서 인증 번호 발송 작동시킴 4-2.1
			@Override
			public void actionPerformed(ActionEvent e) {
				setdata(); //getdata로 이동 4-2.2
			}
		});
		this.Bu2.addActionListener(new ActionListener() { // 받은 값과 컴퓨터의 값 비교
			@Override
			public void actionPerformed(ActionEvent e) {
				String pass = awt6_abstract.this.Pass.getText(); //비번 입력한걸 받음
				
				if (pass.equals("")) { //빈칸 거르기
					ch.setText("인증번호 4자리를 입력하세요");
				}  else {
					String result = getdata(); //컴퓨터가 뽑은 인증번호 비교
					if(pass.equals(result)) {
						ch.setText("인증이 완료되었습니다.");
					} else {
						ch.setText("인증을 다시 한번 확인해 주세요.");
					}
				}
			}
		});
		;

	}

}
