package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("���� ����");
		btn.setFont(new Font("���� ��� Semilight", Font.PLAIN, 12));
		
		btn.setBounds(170, 74, 93, 23);
		contentPane.add(btn);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 29, 418, 35);
		contentPane.add(panel);
		
		JRadioButton credit = new JRadioButton("�ſ�ī��");
		credit.setSelected(true);
		credit.setName("CREDIT");
		credit.setFont(new Font("����ü", Font.PLAIN, 12));
		panel.add(credit);
		
		JRadioButton accountmove = new JRadioButton("������ü");
		accountmove.setFont(new Font("����ü", Font.PLAIN, 12));
		accountmove.setName("BANK"); // setName�� ������� ������, background���� �ش� �Ӽ��� ���� �����ϴ� ���� ���մϴ�.
		panel.add(accountmove);
		
		JRadioButton noaccount = new JRadioButton("�������Ա�"); 
		noaccount.setFont(new Font("����ü", Font.PLAIN, 12));
		noaccount.setName("NOBANK");
		panel.add(noaccount);
		
		ButtonGroup gp = new ButtonGroup(); //radio���� ButtonGroup�� ����Ͻñ� �ٶ��ϴ�.
		gp.add(credit);
		gp.add(accountmove);
		gp.add(noaccount);
		
		JPanel mu = new JPanel();
		mu.setBorder(new LineBorder(new Color(153, 102, 204)));
		mu.setFont(new Font("����ü", Font.PLAIN, 13));
		mu.setVisible(false);
		mu.setBounds(10, 134, 418, 121);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("�������Ա�")); 
		//�������Ա��� �������� �� â �ߴ� �� ����? .setBorder�� �װ� Ÿ��Ʋ ������ִ� �Լ���
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		btn.addActionListener(new ActionListener() { //���� ����
			public void actionPerformed(ActionEvent e) {
				String pay = ""; //
				
				
				//.isSelected() : �ش� �׸��� ���õǾ�����
				if(credit.isSelected()==true) { // �ſ�ī�尡 ~
					System.out.println("�ſ�ī�� ����"); 
					mu.setVisible(false);
				}else if (accountmove.isSelected()==true) {
					System.out.println("������ü ����");
					mu.setVisible(false);
				} else {
					mu.setVisible(true);
				}
			}
		});
	}
}
