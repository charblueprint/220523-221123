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
		
		
		String list[]= {"��Ż�","SKT","KT","LG","�˶���"};
		JComboBox comB = new JComboBox(list);
		comB.setFont(new Font("����", Font.PLAIN, 14));
		comB.setBounds(10, 20, 136, 23);
		contentPane.add(comB);
		
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("����ü", Font.PLAIN, 16));
		lbl.setBounds(10, 53, 136, 23);
		contentPane.add(lbl);
		
		comB.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				//.getItem�� �⺻�� object��!
				int v = comB.getSelectedIndex(); //�̰� ������ ������ comB�� �迭�̱� �����̴�!
				System.out.println(comB.getSelectedItem()); //68��°�� ����
				//�迭�� index ���·� �ε�. ��, �ʵ忡 �迭�� ����Ǿ����.
				
				//lbl.setText((String) e.getItem());
				//String data = String.valueOf(comB.getSelectedItem());
				//String data = comB.getSelectedItem().toString(); <<java 14����
				//String data = String.valueOf(e.getItem());
				String data = e.getItem().toString(); //���� 3���� �� �ǹǷ� �� ��󾲸� �ȴ�.
				//lbl.setText(list[v]);
			}
		});
		
	}

}
