import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ����
public class awt2 {

	public static void main(String[] args) {
		login log = new login();
	}

}
class loginok extends login{
	public loginok(){
		this.F.setTitle("LOGIN ���� �� ������");
		this.F.setBounds(800, 350, 400, 400);
		this.F.setVisible(true);
		this.F.setLayout(null);
	}
}
class admin extends login{
	public admin() {
		Label msg2 = new Label();
	}
}
class login { //������ > extends abstract(�߻� class)�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ
	public Button[] Btn = { new Button("�α���"), new Button("ȸ������"), new Button("���α׷� ����") };
	Frame F = new Frame();
	Font ft = new Font("����ü", Font.PLAIN, 20); // Font = (�۾�ü, ��Ÿ��, ��Ʈũ��)
	Label msg = new Label();
	TextField mid = new TextField();
	TextField mpw = new TextField();

	public login() {
		this.F.setTitle("LOGIN");
		this.F.setBounds(800, 350, 400, 400);
		this.F.setVisible(true);
		this.F.setLayout(null);
		mid.setBounds(100, 85, 200, 40);
		mpw.setBounds(100, 140, 200, 40);
		mid.setFont(ft);
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // setEchoChar�� ����� ���� '' ����ϱ�!!
		this.msg.setBounds(100, 180, 200, 40);

		this.Btn[0].setBackground(Color.GREEN);
		this.Btn[2].setBackground(Color.darkGray);
		int i = 0;
		while (i <= 2) {
			this.Btn[i].setBounds(100, 220 + (i * 50), 200, 40);
			i++;
		}

		this.F.add(mid);
		this.F.add(mpw);
		this.F.add(msg);
		for (int ii = 0; ii <= 2; ii++) {
			this.F.add(Btn[ii]);
		}
		this.clicks();
	}

	public void clicks() { // ��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		this.Btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				F.setVisible(false); //�ش� ������ ����
				loginok ok = new loginok(); //���� ������ �ε�
				
			}
		});
		this.Btn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				//���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
			}
		});
		this.Btn[0].addActionListener(new ActionListener() {
			//�α��� ��ư ���̵� �� �н����� ����
			
			JOptionPane alert = new JOptionPane(); //swing API ��� �ɼ� �ε�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user_id = mid.getText();//getText (����ڰ� �Է��� ���� �����ö� ���)
				String user_pw = mpw.getText();				
				if(user_id.equals("")) { //null ���� ���� �ִ� ���¶� null ��� ����
					msg.setText("���̵� �Է��ϼ���");
					//alert.showMessageDialog(null, "���̵� �Է��ϼ���","�������ΰ���", JOptionPane.ERROR_MESSAGE);
					//��� JOptionPane�� swing���� ���°ǵ� awt������ ����!
				} else if(user_id.equals("blueprint56")){ //����
					msg.setText("");
					if(user_pw.equals("")) {
						msg.setText("��й�ȣ�� �Է��ϼ���");
					} else if(user_pw.equals("19950506")) {
						alert.showMessageDialog(alert, "admin���� �α����Ͻðڽ��ϱ�?");
					} 
				} else { //�Ϻ�����
					if(user_pw.equals("")) {
						msg.setText("��й�ȣ�� �Է��ϼ���");
					} else {
						msg.setText("�α����� �������Դϴ�!");
					}
				}
				
			}
		});
}}

