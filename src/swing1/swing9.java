package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//jEditorPane은 게시판 내용 출력또는 입력등 사용이 되며, 하이브리드 웹앱에서는 HTML을 로드하여
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 1000);
		setTitle("하이브리드 웹 앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 10, 850, 900);
		contentPane.add(editorPane);
		editorPane.setContentType("text/html"); //ContentType  : 문자도 사용 그리고 HTML도 사용
		editorPane.setText(
				"<img src='http://upload2.inven.co.kr/upload/2017/04/12/bbs/i13916143008.jpg'"
				+ "<br><font color=black><h1>귀여움\n동의하십니까?<h1></font>"
				+ "<br><input type='text id='name'>"
				+"<br><input type='checkbox'>AGREE");
	}

}
