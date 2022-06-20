package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order frame = new order();
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
	public order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel member = new JPanel();
		member.setBorder(new LineBorder(SystemColor.desktop));
		member.setBounds(10, 44, 291, 75);
		contentPane.add(member);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.desktop));
		panel_1.setBounds(10, 142, 418, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton food1 = new JRadioButton("\uC74C\uC2DD1");
		food1.setBounds(21, 23, 88, 23);
		panel_1.add(food1);
		
		JRadioButton food2 = new JRadioButton("\uC74C\uC2DD2");
		food2.setBounds(111, 23, 95, 23);
		panel_1.add(food2);
		
		JRadioButton food3 = new JRadioButton("\uC74C\uC2DD3");
		food3.setBounds(208, 23, 88, 23);
		panel_1.add(food3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC74C\uC2DD4");
		rdbtnNewRadioButton.setBounds(297, 23, 95, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 218, 418, 37);
		contentPane.add(lblNewLabel);
		
		JButton btn = new JButton("\uCD9C\uB825\uD558\uAE30");
		btn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn.setBounds(311, 44, 117, 75);
		contentPane.add(btn);
	}
}
