import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class awt4_class {
	//awt4.java����
	public void view(){
		//AWT�� ������Ʈ�� ��������Ʈ�� ������ �Ѵ�.
		decorate de1 = new decorate(); //awt4.java �ڽ� class �ε�
		String msg;
		Frame F = new Frame();
		TextArea LA = new TextArea();
		F.setTitle("������ ����� ����~");
		F.setBounds(200, 200, 300, 300);
		F.setVisible(true);
		F.setLayout(null);
		
		Button btn[] = {new Button("���"),new Button("����")};
		TextField input = new TextField();
		LA.setBackground(Color.lightGray);
		input.setBounds(50, 50, 100, 25);
		btn[0].setBounds(180, 50, 80, 25);
		btn[1].setBounds(50, 200, 80, 25);
		LA.setBounds(50,100,200,100);
		F.add(LA);
		F.add(input);
		F.add(btn[0]);
		F.add(btn[1]);
		
		btn[0].addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = 0;
				try {
					x = Integer.parseInt(input.getText());
					de1.Btn_push(x); // ����ڰ� �Է��� ���� Btn_push�޼ҵ�� ����
					LA.setText(de1.calls()); //awt.java�� �ִ� getter�޼ҵ� �� ����
				} catch (Exception EE) {
					LA.setText("���ڸ� �Է��ϼ���");
				} 
				
				
				
			}
		});
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		}
	}

