import java.util.Arrays;

/*�迭 �ű� �������� ��Ȯ�ϰ� �����Ͽ� �űԹ迭�� �����ϱ�*/
public class oop2 {

	public static void main(String[] args) {
		array1 ar = new array1();
	}

}
class array1{
	private int ar1[];
	private int i;
	public array1() {
		this.ar1 = new int[] {1,2,3,4,5,6,7}; // class array1�� �ʵ忡 �����ϰ� ����� ���� �̷��� �����
		i = this.ar1.length;// �̷��� ����� �׳� �ٷ� �迭 ��ŭ ���� �� ����
		//<5�̻� �迭 �� �̾ƺ���>
		int w = 0;
		String newdata="";
		while(w<i) {
			if(this.ar1[w]>=5) {
				//System.out.print(this.ar1[w]);
				newdata += this.ar1[w]+","; //�ش� ������ ���� ���ڿ��� ��ȯ�Ͽ� ����
			}
			w++;
		}
		String ar2[] = newdata.split(","); //�ش� ����� ���ڿ��� split���� �����Ͽ� �迭�� �ӽ���ȯ (split : ���� ��� �Ұ�)
		int ar2_i= ar2.length;
		int oridata[] = new int [ar2_i];//���ڿ� ������ŭ �迭 ������ ���� �߰���
		
		int ii=0;
		while(ii<ar2_i) {
			oridata[ii]=Integer.parseInt(ar2[ii]); 
			//Integer.parseInt : String->int�� ��ȯ!! �� �űԹ迭 �����ڿ� ���� ������
			ii++;
		}
		System.out.println(Arrays.toString(oridata));
	}
}