/*���빮�� #1(0607)*/
/* �μ��� 2���� ���ڸ� �����Ͽ� ��� �ǵ��� �մϴ�.
 * ���� ����� �޾Ƽ� ����� ����Ͻÿ�.
 * 157, 45
 * 157*45
 * ���� ����� ��� : 7065 */
/*#2*/
/*���� ���� �ϳ��� �ش� �޼ҵ�� ���� �ϰ� �˴ϴ�.
 * �ش� �޼ҵ忡���� ������ ���� ó�� �մϴ�.
 * ���� 3�� �����ϸ� 3*1~3*9���� ��� ������� ���Ͽ� sysout���� ��� �ǵ��� �Ͻʽÿ�.*/
public class Method3 {

	public static void main(String[] args) {
		cal C = new cal();
		int result = C.Num(157, 45);
		//System.out.println(result);
		//C.Num2();
		
		/*#2*/
		int result2 = C.M1(3);
		System.out.println(result2);
		
		String ck = C.mb("park");
		System.out.println(ck);
	}
}
class cal {
	public int Num(int A, int B) {
		int Multi = A * B;
		return Multi;
	}
	public void Num() { 
		//������ ���������� ���� �ִµ� ���� �������� �������� �򰥷��� �Ⱦ��� ���ϻ�, 
		System.out.println("�����Դϴ�.");
	}
	public void Num2() {
		int z = Num(100,200);
		System.out.println(z);
	}
	public int M1(int A) {
		/*#2 ����*/
		int i = 1;
		int total = 0;
		do {
			total+=(A*i);
			i++;
		} while(i<=9);
		return total; //�ݺ��� �ȿ��� return ��� �Ұ� / ���ǹ��̶� ����� return ��� �Ұ�
	}
	public String mb(String mid) {
		String msg = "";
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		} return msg; 
		/* �ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ */
	}

}