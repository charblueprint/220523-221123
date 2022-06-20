package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class swing12 extends JFrame {
	 String imgdata[] = {"hawol.jpg","hawol2.jpg","hawol3.jpg","cat1.jpg","cat2.jpg"};
	protected int count = 0;
	public String url="C:\\java5주차(0620-0624)\\Swing\\src\\swing1\\"; 
	private JPanel contentPane;

	//http://naver.com/1.jpg, C:\\java5주차(0620-0624)\\Swing\\src\\swing1 :  절대경로
	// ./1.jpg 나 ../1.jpg 를 상대경로라 부릅니다.
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbll = new JLabel("");
		lbll.setForeground(SystemColor.desktop);
		lbll.setBounds(10, 41, 668, 614);
		contentPane.add(lbll);
		
		JButton before = new JButton("이전");
		before.setForeground(SystemColor.desktop);
		before.setBounds(10, 10, 93, 23);
		contentPane.add(before);
		
		JButton next = new JButton("다음");
		next.setBounds(585, 10, 93, 23);
		contentPane.add(next);
		
		
		before.addActionListener(new ActionListener() { //이전
			public void actionPerformed(ActionEvent e) { //제일 첫번째 사진 나올거라서 0이라고 표기하는 것
				swing12.this.count--;
				if(swing12.this.count < 0) {
					swing12.this.count=0;
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lbll.setIcon(v);
			}
		});
		next.addActionListener(new ActionListener() { //다음
			public void actionPerformed(ActionEvent e) {
				swing12.this.count++;
				if(swing12.this.count>imgdata.length-1) {
					swing12.this.count=imgdata.length-1;
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lbll.setIcon(v);
			}
		});
	}

}
