package swing1;

//progress바 사용법(대부분 로딩바를 많이쓰지 그닥..)
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class swing8 extends JFrame {
	JProgressBar progress = null;
	JLabel lb = null;
	JPanel Pan =null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		this.progress.setIndeterminate(true);
		this.progress.setStringPainted(true);
		this.progress.setBounds(10, 190, 418, 20);
		contentPane.add(this.progress);
		
		this.Pan = new JPanel();
		Pan.setVisible(false);
		Pan.setBounds(10, 214, 418, 51);
		contentPane.add(Pan);
		Pan.setLayout(null);
		
		this.lb= new JLabel("설치가 완료되었습니다.");
		lb.setFont(new Font("돋움체", Font.PLAIN, 13));
		lb.setBounds(10, 22, 153, 19);
		Pan.add(lb);
		lb.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton nextbtn = new JButton("Next >>");
		nextbtn.setBounds(333, 20, 75, 23);
		Pan.add(nextbtn);
		nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		/*swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되도록 적용함.*/
		Timer T = new Timer();
		TimerTask TT = new TimerTask() { // 그래서 이렇게 시간지연을 시켜주는것.
			@Override
			public void run() {
				pstart();
			}
		};
		T.schedule(TT, 1000); 
		
	}
	public void pstart() {
		int per=0;
		try {
			while(per<=100) {
				this.progress.setValue(per);
				Thread.sleep(100); //바로 이렇게 하면 얘가 실행하다가 갑자기 멈춰버림
				per++;
			}
			
		} catch(Exception K) {
			System.out.println("오류발생");
		}
		if(this.progress.getValue()==100) {
			this.Pan.setVisible(true);
		}
	}
}
