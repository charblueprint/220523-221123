import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt 생성
public class awt2 {

	public static void main(String[] args) {
		login log = new login();
	}

}
class loginok extends login{
	public loginok(){
		this.F.setTitle("LOGIN 성공 후 페이지");
		this.F.setBounds(800, 350, 400, 400);
		this.F.setVisible(true);
		this.F.setLayout(null);
	}
}
class admin extends login{
	public admin() {
		Label msg2 = new Label();
	}
}
class login { //연습용 > extends abstract(추상 class)를 먼저 로드하여 필드에 적용시킴
	public Button[] Btn = { new Button("로그인"), new Button("회원가입"), new Button("프로그램 종료") };
	Frame F = new Frame();
	Font ft = new Font("돋움체", Font.PLAIN, 20); // Font = (글씨체, 스타일, 폰트크기)
	Label msg = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();

	public login() {
		this.F.setTitle("LOGIN");
		this.F.setBounds(800, 350, 400, 400);
		this.F.setVisible(true);
		this.F.setLayout(null);
		mid.setBounds(100, 85, 200, 40);
		mpw.setBounds(100, 140, 200, 40);
		mid.setFont(ft);
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // setEchoChar을 사용할 경우는 '' 사용하기!!
		this.msg.setBounds(100, 180, 200, 40);

		this.Btn[0].setBackground(Color.GREEN);
		this.Btn[2].setBackground(Color.darkGray);
		int i = 0;
		while (i <= 2) {
			this.Btn[i].setBounds(100, 220 + (i * 50), 200, 40);
			i++;
		}

		this.F.add(mid);
		this.F.add(mpw);
		this.F.add(msg);
		for (int ii = 0; ii <= 2; ii++) {
			this.F.add(Btn[ii]);
		}
		this.clicks();
	}

	public void clicks() { // 버튼에 관한 모든 핸들링 메소드 집합소
		this.Btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				F.setVisible(false); //해당 프레임 종료
				loginok ok = new loginok(); //다음 프레임 로드
				
			}
		});
		this.Btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				//프로그램 종료 이벤트 핸들링 메소드
			}
		});
		this.Btn[0].addActionListener(new ActionListener() {
			//로그인 버튼 아이디 및 패스워드 검토
			
			JOptionPane alert = new JOptionPane(); //swing API 경고 옵션 로드
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user_id = mid.getText();//getText (사용자가 입력한 값을 가져올때 사용)
				String user_pw = mpw.getText();				
				if(user_id.equals("")) { //null 또한 값이 있는 상태라 null 사용 금지
					msg.setText("아이디를 입력하세요");
					//alert.showMessageDialog(null, "아이디를 입력하세요","눈은어디로갔냐", JOptionPane.ERROR_MESSAGE);
					//사실 JOptionPane은 swing에서 쓰는건데 awt에서는 안함!
				} else if(user_id.equals("blueprint56")){ //어드민
					msg.setText("");
					if(user_pw.equals("")) {
						msg.setText("비밀번호를 입력하세요");
					} else if(user_pw.equals("19950506")) {
						alert.showMessageDialog(alert, "admin으로 로그인하시겠습니까?");
					} 
				} else { //일빈사용자
					if(user_pw.equals("")) {
						msg.setText("비밀번호를 입력하세요");
					} else {
						msg.setText("로그인을 진행중입니다!");
					}
				}
				
			}
		});
}}

