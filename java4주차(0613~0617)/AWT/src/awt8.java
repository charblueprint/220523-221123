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
		Button Bu1i = new Button("�˻�");
		Button Bu2i = null;
		Button closei = null;
		TextField Search = new TextField();
		Label chi = new Label();
		Font Fon1i = new Font("����ü", Font.PLAIN, 13);
		Font Fon2i = new Font("����ü", Font.PLAIN, 17);

		Fri.setTitle("�˻�");
		Fri.setBounds(200, 200, 350, 180);
		Fri.setLayout(null);
		Fri.setVisible(true);
		Bu1i = new Button("�˻�");
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
					System.out.println("�˻�� �Է��� �ּ���");
				} else {
					System.out.println(sh);
					try {
						//Desktop.getDesktop().browse : awt���� �ü�� ȯ�濡 �ִ� �⺻ ���α׷��� �⺻���� �����Ǿ��ִ� �������� ����ϰ� �˴ϴ�.
						//URI : java.net API�Լ� (��Ʈ��ũ ��Ʈ) - ��ο��� �Ķ���� ���� ���մϴ�.
						Desktop.getDesktop().browse(new URI("https://search.naver.com/search.naver?query="+sh));
					} catch (Exception e1) {
						System.out.println("URI ���� �߻�");
					}
				}
			}
		});

	}
}