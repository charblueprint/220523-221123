package swing1;
/*ŰŸ��,�ƽ�Ű�ڵ�*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		tel.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		tel.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 13));
		tel.setBounds(23, 25, 271, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton = new JButton("������ȣ ã��");
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton.setBounds(304, 25, 124, 21);
		contentPane.add(btnNewButton);
		
		JLabel LAA = new JLabel("");
		LAA.setBounds(23, 56, 271, 15);
		contentPane.add(LAA);
		tel.addKeyListener(new KeyAdapter() { //Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ����
			//keyPressed  : Ű�� ���� �� | keyReleased : Ű�� �����ٰ� up�� �Ǿ��� �� | KeyTyped : Ű���� ���ڸ� �Է¹��� ��
			
			@Override
			public void keyTyped(KeyEvent Ke) {  
				//�Է¹޴� ���� ���Ѱ���
				int i = tel.getText().length(); 
				if(i>11) {  //11�ڰ� ������?
					Ke.consume(); //���Ѱ���
				}
				
				//System.out.println(Ke.getKeyChar());
//				System.out.println(Ke.getKeyCode());
				int n= Integer.valueOf(Ke.getKeyChar()); 
				//.getKeyChar�� ���ڷ� �νĵǰ� ����!! �ٵ� �̷��� int �ڷ������� �ٲٴ� ���� �ƽ�Ű �ڵ�� ���ع���
				if(n >= 48 && n <= 57) {  // �׷��� �ƽ�Ű �ڵ� �������� �޴� ������ ���������!!
					LAA.setText("");
				} else {
					LAA.setText("���ڸ� �Է��ϼ���");
					Ke.consume(); //consume : keyTyped����'��' ����. ���� �Է½� null�� ���ֵǾ� �Էµ��� ����.
				}
			}
		});
		//�ƽ�Ű �ڵ�
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			}
		});
	}

}
