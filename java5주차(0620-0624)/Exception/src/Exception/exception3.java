package Exception;

import java.util.ArrayList;

//응용문제#1

/*data[] = {"hong45","lee90","kang100","park70","kima72"};
  해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
  해당 값을 던질때에는 예외 처리를 무조건 발생시켜야 하며, 최초값을 던질때에는 가공없이 던지게 됩니다.
  main2에서는 해당배열 값을 받은 후 해당 덤수를 모두 합산 한 결과가 나와야 됩니다. 
  단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 main2메소드로 다시 호출하여 정상적을 데이터가 나오도록 하십시오.
 */

public class exception3 {

	public static void main(String[] args) {
		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		exception3 e3 = new exception3();
		
			try {
				e3.main2(data);
			} catch (Exception e) {
				System.out.println(e); // System.out.println(e); 이 상태는 e.toString()과 똑같다!
			} finally {
				ArrayList<String> AR = new ArrayList<String>();
				int j=0;
				String modify; // 이게 문제였음
				do {
					modify= data[j].replaceAll("[a-z][A-Z]", "");
					AR.add(modify);
					j++;
				} while (j<data.length);
				String Data[] = new String [AR.size()];
				int l=0;
				while(l<AR.size()) {
					Data[l] = AR.get(l);
					l++;
				}
				try {
					e3.main2(Data);
				} catch (Exception e2) {
					if(e2.getMessage()==null) {
						System.exit(0);
					} else {
						System.out.println(e2.getMessage());
					}
					//printStackTrace()은 실제로 잘 안 쓴다. 어느 줄에서 오류가 났는지 출력하는 함수인데 이거 쓰다 무한루프 걸리면 저 메세지도 루프를 돌아 과부하 걸려 꺼진다.
//					System.out.println(e2.getMessage()); //차라리 .getMessage() 쓰기
				}
			}
	}

	public void main2(String data[]) throws Exception{
		int i=0;
		int vaild;
		int total=0;
		do {
			vaild = Integer.valueOf(data[i]);
			total += vaild;
			i++;
		}while(i<data.length);
		System.out.println(total);
		Exception ck = new Exception();
		throw ck;
	}
}
