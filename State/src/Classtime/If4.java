package Classtime;
import java.util.Scanner; 
// import : java�� �ִ� ������ �ε��Ҷ� ����ϴ� ���
// export : java�� �ִ� ������ ������ ������ �� �ִ� ���
// java.util ��Ű�� �ȿ�  Scanner Ŭ���� �κ��� �ε��ϰ� �˴ϴ�.
// java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��Ͽ� �����ڸ� ����ؾ� �մϴ�.
// ��, �ش��ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �ȵ˴ϴ�.
public class If4 {

	public static void main(String[] args) {
				// new : ��ü�� ������
		Scanner sc = new Scanner(System.in);
		//System.in != System.out
		System.out.print("���̵� �Է��ϼ��� >> ");
		String id = sc.next();
		//next(): ����ڰ� �Է��ϴ� ���¸� ���մϴ�. (����, ���ڸ� �Է¹޴� ����)
		System.out.println(id+"��, ȯ���մϴ�.");
		
		sc.close();
	}

}
