package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.SwingConstants;

public class swing10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing10 frame = new swing10();
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
	public swing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String list[]= {"통신사","SKT","KT","LG","알뜰폰"};
		JComboBox comB = new JComboBox(list);
		comB.setFont(new Font("돋움", Font.PLAIN, 14));
		comB.setBounds(10, 20, 136, 23);
		contentPane.add(comB);
		
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("돋움체", Font.PLAIN, 16));
		lbl.setBounds(10, 53, 136, 23);
		contentPane.add(lbl);
		
		comB.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//.getItem의 기본은 object다!
				int v = comB.getSelectedIndex(); //이게 가능한 이유는 comB가 배열이기 때문이다!
				System.out.println(comB.getSelectedItem()); //68번째와 연결
				//배열에 index 형태로 로드. 단, 필드에 배열이 선언되어야함.
				
				//lbl.setText((String) e.getItem());
				//String data = String.valueOf(comB.getSelectedItem());
				//String data = comB.getSelectedItem().toString(); <<java 14이후
				//String data = String.valueOf(e.getItem());
				String data = e.getItem().toString(); //위에 3줄은 다 되므로 걍 골라쓰면 된다.
				//lbl.setText(list[v]);
			}
		});
		
	}

}
