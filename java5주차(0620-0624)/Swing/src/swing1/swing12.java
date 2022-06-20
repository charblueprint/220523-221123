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
	public String url="C:\\java5����(0620-0624)\\Swing\\src\\swing1\\"; 
	private JPanel contentPane;

	//http://naver.com/1.jpg, C:\\java5����(0620-0624)\\Swing\\src\\swing1 :  ������
	// ./1.jpg �� ../1.jpg �� ����ζ� �θ��ϴ�.
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
		
		JButton before = new JButton("����");
		before.setForeground(SystemColor.desktop);
		before.setBounds(10, 10, 93, 23);
		contentPane.add(before);
		
		JButton next = new JButton("����");
		next.setBounds(585, 10, 93, 23);
		contentPane.add(next);
		
		
		before.addActionListener(new ActionListener() { //����
			public void actionPerformed(ActionEvent e) { //���� ù��° ���� ���ðŶ� 0�̶�� ǥ���ϴ� ��
				swing12.this.count--;
				if(swing12.this.count < 0) {
					swing12.this.count=0;
				}
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lbll.setIcon(v);
			}
		});
		next.addActionListener(new ActionListener() { //����
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
