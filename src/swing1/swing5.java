package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/*Frame�� absolute ���·� layer�� �����մϴ�.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("���̵� üũ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(mid.equals("")) {
//					msg.setText("���̵� �Է��ϼ���.");
//				}
//			}
//		}); >> �̰� �ȵǴ� ������ msg�� ������ �ڿ� �����ϱ� ������! (�̰�)
		btnNewButton.setBorder(new LineBorder(new Color(153, 180, 209)));
		btnNewButton.setBounds(168, 123, 93, 23);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setFont(new Font("����ü",Font.BOLD,12));
		mid.setBounds(168, 84, 93, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		msg.setBorder(new LineBorder(Color.ORANGE));
		msg.setBounds(56, 170, 315, 15);
		contentPane.add(msg);
		/*�ڵ鸵�� Ŭ������ ������Ʈ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ���մϴ�.(�� �Ҹ�)*/
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				} else {
					int ID = mid.getText().length(); //�Է� ���� ����
					if(ID < 5) {
						msg.setText("���̵�� 5�� �̻� ��밡���մϴ�.");
					} else {
						msg.setText("���̵� �������Դϴ�>>");
					}
					
				}
			}
		});
	}
}
