import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class awt4_class {
	//awt4.java연계
	public void view(){
		//AWT는 연산파트와 디자인파트를 나눠야 한다.
		decorate de1 = new decorate(); //awt4.java 자식 class 로드
		String msg;
		Frame F = new Frame();
		TextArea LA = new TextArea();
		F.setTitle("프레임 만들기 성공~");
		F.setBounds(200, 200, 300, 300);
		F.setVisible(true);
		F.setLayout(null);
		
		Button btn[] = {new Button("계산"),new Button("종료")};
		TextField input = new TextField();
		LA.setBackground(Color.lightGray);
		input.setBounds(50, 50, 100, 25);
		btn[0].setBounds(180, 50, 80, 25);
		btn[1].setBounds(50, 200, 80, 25);
		LA.setBounds(50,100,200,100);
		F.add(LA);
		F.add(input);
		F.add(btn[0]);
		F.add(btn[1]);
		
		btn[0].addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				try {
					x = Integer.parseInt(input.getText());
					de1.Btn_push(x); // 사용자가 입력한 값을 Btn_push메소드로 전달
					LA.setText(de1.calls()); //awt.java에 있는 getter메소드 값 받음
				} catch (Exception EE) {
					LA.setText("숫자만 입력하세요");
				} 
				
				
				
			}
		});
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
	}

