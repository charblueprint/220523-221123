/*���빮�� #3(0607)*/
/*���� ���α׷��Ӱ� �ش� DB�� (Database) ���� Ȧ������ ���� �� ������ �ް��� �մϴ�.
 *������ => int odata[] = {15,22,17,14,32,35,19,33};
 *�ش� ������ ��� �� �� �ֵ��� �ڵ带 �ۼ� �Ͻÿ�.*/
public class Method8 {

	public static void main(String[] args) {
		odbc OD = new odbc();
		System.out.println(OD.Nums());
	}

}
class odbc{
	private int count = 0; //odbc��� Ŭ���� �ʵ忡 ������ count�� ��(���⿡ final �����ϸ� �ȹٲ�)
	private int ori[];// �迭 ���� ������� �ʵ��� ���
	/*private�� ��� ���Ŀ� ���� ���� �޶��� >> ���ȿ��� ������ ��ģ��.*/
	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.ori = odata;
		
	}
	public int Nums() { //int Nums() ���� ���⼭ �޾Ƽ� �� ���ư������� ��ĭ���� ����
		int i=0;
		while(i<this.ori.length) {
			if(this.ori[i]%2==1) {
				this.count++;
			}
			i++;
		}
		return this.count;//(���� ���� ����) + ���ϸ� �ȵǴ� ���� this ������
		/* <�߿�> return��
		public int Nums()��
		public String Nums()������ ������
		�׸��� return�� ������ ()�� �ƹ��͵� ��������
		******�׸��� static void�� this.___ ����ϸ� �� ������.******
		*/
	}
}