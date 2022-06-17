import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class awt8 {

	public static void main(String[] args) {
		Frame Fri = new Frame();
		Button Bu1i = new Button("검색");
		Button Bu2i = null;
		Button closei = null;
		TextField Search = new TextField();
		Label chi = new Label();
		Font Fon1i = new Font("바탕체", Font.PLAIN, 13);
		Font Fon2i = new Font("바탕체", Font.PLAIN, 17);

		Fri.setTitle("검색");
		Fri.setBounds(200, 200, 350, 180);
		Fri.setLayout(null);
		Fri.setVisible(true);
		Bu1i = new Button("검색");
		Bu1i.setBackground(Color.green);
		Bu1i.setBounds(195, 80, 100, 25);
		Bu1i.setFont(Fon1i);
		Search.setFont(Fon2i);
		

		Search.setBounds(10, 30, 150, 25);
		Bu1i.setBounds(200, 30, 80, 25);
		Fri.add(Search);
		Fri.add(Bu1i);

		Bu1i.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh = Search.getText();
				if (sh.equals("")) {
					System.out.println("검색어를 입력해 주세요");
				} else {
					System.out.println(sh);
					try {
						//Desktop.getDesktop().browse : awt에서 운영체제 환경에 있는 기본 프로그램중 기본으로 설정되어있는 브라우저를 사용하게 됩니다.
						//URI : java.net API함수 (네트워크 파트) - 경로외의 파라미터 값을 말합니다.
						Desktop.getDesktop().browse(new URI("https://search.naver.com/search.naver?query="+sh));
					} catch (Exception e1) {
						System.out.println("URI 오류 발생");
					}
				}
			}
		});

	}
}