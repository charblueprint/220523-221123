package ClassTime;

public class For1 {

	public static void main(String... args) {
		/* ������ 2~3�� ����ϱ� */
		int F, FF; // �ݺ����� ����� ���� ������ �̸� �Ͽ���
		for(F=2;F<=3;F++) { //ū for�� 2~3������ ȸ����
			for(FF=1;FF<=9;FF++) {//���� for�� 1~9���� ȸ��
				//System.out.print(F+"*"+FF+" ");
			}
			
		}
		
		/* ���빮�� #12
		 * ������ 5~7�� ����� �ϵ� 4������ ���������� ������ ���ı��� ����Ͻÿ� */
		int i,j;
		int total=0;
		for(i=5;i<=7;i++) {
			for(j=1;j<=4;j++) {
				total+=(i*j);
			}	
		}
		System.out.printf("%d ",total);
	}

}
