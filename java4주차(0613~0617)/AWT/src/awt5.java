import java.util.ArrayList;
import java.util.Arrays;

// �ߺ� ���̵� üũ �ý��� ����� : awt5_abstract ���� ���
//������ : hong,lee,park
public class awt5 {

	public static void main(String[] args) {
		handle hand = new handle();
		hand.design();
	}

}
class handle extends awt5_abstract{
	protected ArrayList <String> Arr = null; 
	private String ID;//awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ��
	private String return_ID;//awt�� �ٽ� ���� �����ϴ� ��������
	//awt�� �ٽ� ���� �����ϴ� �������� : null�� ��� ���̵� ��밡��
	//���̵��� ���� : �ش� ���̵�� ����� �� ����
	
	@Override
	public void Search(String ID) { //setter
		//awt���� �ߺ���ư�� Ŭ���� �ش� ������ �������� �ʱ�ȭ �ϴ� �κ�
		this.return_ID = "";
		this.ID = ID;
		this.dataload(); //���������� �����Ͱ� �Ѿ� ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ���ϰ� ��.
		int i=0;
		do {
			if(this.ID.equals(this.Arr.get(i))) {
				this.return_ID = this.Arr.get(i);
				break;
			}
			i++;
		} while (i<this.Arr.size()); 
	}
	@Override
	public String signalok() { //getter
		return this.return_ID;
	}

	@Override
	public void dataload() {
		String ori[] = {"hong","lee","park","jong","kim","he","seo"};
		this.Arr = new ArrayList<>(Arrays.asList(ori)); 
	}

	
	
}