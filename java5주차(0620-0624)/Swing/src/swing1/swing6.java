package swing1;
/*키타입,아스키코드*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		tel.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		tel.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 13));
		tel.setBounds(23, 25, 271, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("인증번호 찾기");
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton.setBounds(304, 25, 124, 21);
		contentPane.add(btnNewButton);
		
		JLabel LAA = new JLabel("");
		LAA.setBounds(23, 56, 271, 15);
		contentPane.add(LAA);
		tel.addKeyListener(new KeyAdapter() { //키를 누를 경우 적용되는 이벤트 클래스
			//keyPressed  : 키를 누를 때 | keyReleased : 키를 눌렀다가 up이 되었을 때 | KeyTyped : 키에서 문자를 입력받을 때
			
			@Override
			public void keyTyped(KeyEvent Ke) {  
				//입력받는 숫자 제한걸음
				int i = tel.getText().length(); 
				if(i>11) {  //11자가 넘으면?
					Ke.consume(); //제한걸음
				}
				
				//System.out.println(Ke.getKeyChar());
//				System.out.println(Ke.getKeyCode());
				int n= Integer.valueOf(Ke.getKeyChar()); 
				//.getKeyChar은 문자로 인식되고 있음!! 근데 이렇게 int 자료형으로 바꾸는 순간 아스키 코드로 변해버림
				if(n >= 48 && n <= 57) {  // 그래서 아스키 코드 기준으로 받는 기준을 정해줘야함!!
					LAA.setText("");
				} else {
					LAA.setText("숫자만 입력하세요");
					Ke.consume(); //consume : keyTyped에서'만' 사용됨. 문자 입력시 null로 간주되어 입력되지 않음.
				}
			}
		});
		//아스키 코드
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			}
		});
	}

}
