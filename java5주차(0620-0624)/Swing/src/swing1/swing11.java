package swing1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class swing11 extends JFrame {
	/*ImageIcon : �̹��� ������ �ε��� �� ����մϴ�.*/
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("�̹��� �ε�");
		btn.setFont(new Font("����ü", Font.PLAIN, 13));
		btn.setBounds(882, 932, 119, 23);
		contentPane.add(btn);
		
		JLabel lbl = new JLabel("");
		lbl.setBorder(new LineBorder(new Color(0, 0, 0)));
		lbl.setBounds(10, 10, 978, 912);
		contentPane.add(lbl);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java5����(0620-0624)\\Swing\\src\\swing1\\hawol");
				Image reimg = img.getImage(); //�̹��� ���� ��θ� �ε�
				//.getScaledInstance(����ũ��,����ũ��,��ȯ���)
				//SCALE_SMOOTH : �ε巴�� | SCALE_FAST : ������ ���� (�ٸ� pixel�� ����) | SCALE_DEFAULT : �̹����� ������ �ִ� �ػ󵵿� ���� ���� 
				// SCALE_AREA_AVERAGING : ����� �ػ� ��հ����� ����
				Image resize = reimg.getScaledInstance(410, 208, Image.SCALE_SMOOTH);
				ImageIcon rimg = new ImageIcon(resize);
				lbl.setIcon(rimg);
			}
		});
	}

}
