package Java_test;
//프로세스 칸은 thread 써서 try~catch쓰면 되었음

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField adultsum;
	private JTextField kidsum;
	private JTextField dateinput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		lb1.setFont(new Font("돋움체", Font.PLAIN, 16));
		lb1.setBounds(29, 25, 158, 30);
		contentPane.add(lb1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBorder(new TitledBorder("캠핑장소를 선택하세요"));
		panel.setBounds(29, 63, 518, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton local1 = new JRadioButton("\uB0A8\uC591\uC8FC");
		local1.setFont(new Font("굴림체", Font.PLAIN, 14));
		local1.setBounds(108, 19, 76, 23);
		panel.add(local1);
	
		
		JRadioButton local2 = new JRadioButton("\uCDA9\uBD81 \uC74C\uC131");
		local2.setFont(new Font("돋움체", Font.PLAIN, 14));
		local2.setBounds(215, 19, 96, 23);
		panel.add(local2);
		
		JRadioButton local3 = new JRadioButton("\uCD98\uCC9C");
		local3.setFont(new Font("굴림체", Font.PLAIN, 14));
		local3.setBounds(330, 19, 76, 23);
		panel.add(local3);
		
		ButtonGroup BG = new ButtonGroup();
		BG.add(local1);
		BG.add(local2);
		BG.add(local3);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(29, 121, 518, 85);
		panel_1.setBorder(new TitledBorder("인원수를 입력하세요"));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel adult = new JLabel("\uC131\uC778  :");
		adult.setFont(new Font("돋움체", Font.PLAIN, 14));
		adult.setBounds(51, 30, 66, 24);
		panel_1.add(adult);
		
		adultsum = new JTextField();
		adultsum.setBounds(106, 32, 96, 21);
		panel_1.add(adultsum);
		adultsum.setColumns(10);
		
		JLabel kids = new JLabel("\uCCAD\uC18C\uB144(\uB9CC 10\uC138 \uC774\uC0C1) :");
		kids.setFont(new Font("돋움체", Font.PLAIN, 13));
		kids.setBounds(237, 32, 163, 21);
		panel_1.add(kids);
		
		kidsum = new JTextField();
		kidsum.setBounds(382, 32, 96, 21);
		panel_1.add(kidsum);
		kidsum.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLACK));
		panel_2.setBorder(new TitledBorder("캠핑날자 입력"));
		panel_2.setBounds(29, 211, 518, 66);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel date = new JLabel("\uCEA0\uD551 \uC77C\uC790");
		date.setFont(new Font("돋움체", Font.PLAIN, 14));
		date.setBounds(40, 29, 65, 16);
		panel_2.add(date);
		
		dateinput = new JTextField();
		dateinput.setFont(new Font("돋움체", Font.PLAIN, 13));
		dateinput.setBounds(115, 27, 96, 21);
		panel_2.add(dateinput);
		dateinput.setColumns(10);
//		dateinput.addKeyListener(new KeyAdapter){
//			@Override
//				public void keyTyped(KeyEvent Ke) {  
//					int i = dateinput.getText().length(); 
//					if(i>=11) { 
//						Ke.consume(); //제한걸음
//					}
//		}

		
		JLabel example = new JLabel("*\uC608\uC2DC) 2022-06-24");
		example.setFont(new Font("돋움체", Font.PLAIN, 14));
		example.setBounds(315, 27, 152, 18);
		panel_2.add(example);
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.BLACK);
		progressBar.setStringPainted(true);
		progressBar.setBounds(29, 287, 319, 30);
		contentPane.add(progressBar);
		
		JButton sendinfo = new JButton("\uC608\uC57D\uD558\uAE30");
		sendinfo.setForeground(SystemColor.desktop);
		sendinfo.setBackground(SystemColor.textHighlight);
		sendinfo.setBounds(446, 287, 101, 30);
		contentPane.add(sendinfo);
		
		JLabel loding = new JLabel("\uC7A0\uC2DC\uB9CC \uAE30\uB2E4\uB824 \uC8FC\uC2ED\uC2DC\uC624");
		loding.setBounds(29, 327, 158, 20);
		contentPane.add(loding);
		loding.setVisible(false);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(UIManager.getColor("Button.focus")));
		panel_3.setBackground(UIManager.getColor("CheckBox.background"));
		panel_3.setBorder(new TitledBorder("확인 및 입금하실 금액"));
		panel_3.setBounds(29, 357, 518, 67);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setVisible(false);
		
		JButton close = new JButton("\uC885\uB8CC");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		close.setBounds(454, 434, 93, 23);
		contentPane.add(close);
		
		sendinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				loding.setVisible(true);
				
//				("일자 및 장소 : "+dateinput.getText()+"성인 : "+adultsum.getText()
//				+"청소년"+kidsum.getText()+"\n"+"총 입금하실 금액 : ");
			}
		});
	}
}
