import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class awt1 {
	
	public awt1() {
	}
	
	public static void main(String[] args) {
		// Frame > Bound > Object �ļ�����
		Frame Fr = new Frame();
		Fr.setTitle("AWT ���� ȭ��");
		Fr.setVisible(true);
		Fr.setLayout(null); //�г� ��� ����
		Fr.setBounds(200, 200, 500, 500); // (X��ǥ,Y��ǥ,���α���,���α���)
		
		Button btn = new Button("Ŭ��");
		Button closebtn = new Button("�ݱ�");
		Label msg = new Label("");
		//msg.setBackground(Color.LIGHT_GRAY);
		//setBackground(Color C) : ���� �Է� 
		
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		Fr.add(msg);
		Fr.add(btn);
		Fr.add(closebtn); //=> Object�� Frame�� �����ϰ� �˴ϴ�. �̰��� Panel ��� setBounds�� ����߱� ������ ������ ��
		
		//addActionListener  : �̺�Ʈ �޼ҵ� ��, this ��� ���� �ȵ�
		closebtn.addActionListener(new ActionListener() {
			//new ActionListener() : Override �޼ҵ� �ڵ����� 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn.addActionListener(new ActionListener() {
			String a= "����ƾ"; //addActionListener : �̺�Ʈ �޼ҵ� �ʵ忡 String�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);
			}
		});
	}

}
