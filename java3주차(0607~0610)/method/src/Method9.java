import java.util.Arrays;

/*���빮�� #4*/
/* �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�. 
�ش� �޴� Ȱ��ȭ�� 2���迭�̸�, �޴���� Ȱ��ȭ�ϴ� (Y,N)���� �����մϴ�.
�ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 
1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�. 
[���] : [���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]
��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
*/
public class Method9 {

	public static void main(String[] args) {
		Menus M = new Menus();
		String result[] = M.menu();
		System.out.println(Arrays.toString(result));
	}

}
class Menus{
	private String choose[]=new String[5];
	private String origin[][];
	public Menus(){
		String Ms[][] = {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}};
		this.origin=Ms;
	}
	public String menu[]() {
		int i=0;
		do {
			if(this.origin[1][i].equals("Y")) {
				this.origin[0][i] = this.choose[i];
			} i++;
		}while(i<this.origin[0].length);
		
		return this.choose;
	} 
}