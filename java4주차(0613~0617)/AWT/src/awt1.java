import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class awt1 {
	
	public awt1() {
	}
	
	public static void main(String[] args) {
		// Frame > Bound > Object 꼼수버전
		Frame Fr = new Frame();
		Fr.setTitle("AWT 기초 화면");
		Fr.setVisible(true);
		Fr.setLayout(null); //패널 사용 안함
		Fr.setBounds(200, 200, 500, 500); // (X좌표,Y좌표,가로길이,세로길이)
		
		Button btn = new Button("클릭");
		Button closebtn = new Button("닫기");
		Label msg = new Label("");
		//msg.setBackground(Color.LIGHT_GRAY);
		//setBackground(Color C) : 색상 입력 
		
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		Fr.add(msg);
		Fr.add(btn);
		Fr.add(closebtn); //=> Object를 Frame에 적용하게 됩니다. 이것은 Panel 대신 setBounds를 사용했기 때문에 가능한 것
		
		//addActionListener  : 이벤트 메소드 단, this 사용 절대 안됨
		closebtn.addActionListener(new ActionListener() {
			//new ActionListener() : Override 메소드 자동생성 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn.addActionListener(new ActionListener() {
			String a= "세븐틴"; //addActionListener : 이벤트 메소드 필드에 String을 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);
			}
		});
	}

}
