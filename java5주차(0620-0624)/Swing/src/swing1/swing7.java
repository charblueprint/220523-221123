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
		
		JButton btn = new JButton("결제 진행");
		btn.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		
		btn.setBounds(170, 74, 93, 23);
		contentPane.add(btn);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 29, 418, 35);
		contentPane.add(panel);
		
		JRadioButton credit = new JRadioButton("신용카드");
		credit.setSelected(true);
		credit.setName("CREDIT");
		credit.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel.add(credit);
		
		JRadioButton accountmove = new JRadioButton("계좌이체");
		accountmove.setFont(new Font("돋움체", Font.PLAIN, 12));
		accountmove.setName("BANK"); // setName은 노출되지 않으며, background에서 해당 속성에 값을 적용하는 것을 말합니다.
		panel.add(accountmove);
		
		JRadioButton noaccount = new JRadioButton("무통장입금"); 
		noaccount.setFont(new Font("돋움체", Font.PLAIN, 12));
		noaccount.setName("NOBANK");
		panel.add(noaccount);
		
		ButtonGroup gp = new ButtonGroup(); //radio사용시 ButtonGroup을 사용하시길 바랍니다.
		gp.add(credit);
		gp.add(accountmove);
		gp.add(noaccount);
		
		JPanel mu = new JPanel();
		mu.setBorder(new LineBorder(new Color(153, 102, 204)));
		mu.setFont(new Font("돋움체", Font.PLAIN, 13));
		mu.setVisible(false);
		mu.setBounds(10, 134, 418, 121);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("무통장입금")); 
		//무통장입금을 선택했을 때 창 뜨는 거 알지? .setBorder는 그거 타이틀 만들어주는 함수임
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 27, 96, 21);
		mu.add(textField);
		textField.setColumns(10);
		btn.addActionListener(new ActionListener() { //결제 수단
			public void actionPerformed(ActionEvent e) {
				String pay = ""; //
				
				
				//.isSelected() : 해당 항목이 선택되었는지
				if(credit.isSelected()==true) { // 신용카드가 ~
					System.out.println("신용카드 선택"); 
					mu.setVisible(false);
				}else if (accountmove.isSelected()==true) {
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				} else {
					mu.setVisible(true);
				}
			}
		});
	}
}
