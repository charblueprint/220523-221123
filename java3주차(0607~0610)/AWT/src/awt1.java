import java.awt.*;
import java.awt.event.*;

public class awt1 {
/*
 GUI��� : (Java 7) AWT(abstract window ����Ʋ), SWING(AWT - �׷��� ���� )
 CUI��� : Scanner (X)
 
 SWING : JFrame -> JPanel -> JObject
*/
	public static void main(String[] args) {
		//AWT ���� ���
		//Frame -> Panel -> Object(���� ����)
		//Object-> Panel -> Frame (���� ����)
		
		//String notice = "���� 00�ú��� ���������� ���۵˴ϴ�.";
		
		popclose pc = new popclose();
		Frame Fr = new Frame();//������ â �����
		Fr.setTitle("����� �α���"); //â ��ܿ� �ߴ� �̸�
		Fr.setSize(500, 500); //â ũ��
		Fr.setVisible(true);	//ȭ�鿡 ���� ���� ����
		Fr.addWindowListener(pc); // awt �޼ҵ带 ��ӹ޾� ó��
		
		Panel Pa = new Panel(); //�г�������
		
		CheckboxGroup radio = new CheckboxGroup(); //üũ�ڽ� �׷� ����

		TextField id = new TextField(10);//Textfield 10�ڱ���
		TextField pw = new TextField(10);
		TextField sa = new TextField("�����ȣ�� �Է��ϼ���");//�Է� �����Ͱ� �̸� �����
		Button b1 = new Button("�α���");//object ��ư
		Checkbox c1 = new Checkbox("�ڵ� �α���");
		
		Checkbox c2 = new Checkbox("������",false,radio);
		Checkbox c3 = new Checkbox("���� ����",true,radio);
		
		Pa.add(id);// add �߰� ������Ʈ�� �гο� ����
		Pa.add(pw);
		Pa.add(sa);
		Pa.add(b1);
		Pa.add(c1);
		Pa.add(c2);
		Pa.add(c3);
		//System.out.println(notice);
		Fr.add(Pa); //�г� > ������
	}

}
class popclose extends WindowAdapter {
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
}