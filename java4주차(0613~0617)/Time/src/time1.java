
public class time1 {

	public static void main(String[] args) {
		/* try - catch문 (예외 처리 기능 문법)*/
		int i = 1;
		do {
			try { //예외 발생할 코드를 적용
				Thread.sleep(1000); //1000 = 1초
				//Thread.sleep : 일시정지 상태를 의미
			}catch (InterruptedException e) {
				//InterruptedException : 해당 예외 발생이 되었을 경우 처리하기 위한 문법
			}
			System.out.println(i);				
			i++;
		} while (i<=10);
	}

}
