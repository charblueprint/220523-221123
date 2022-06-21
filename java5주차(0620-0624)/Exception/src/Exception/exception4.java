package Exception;

import java.io.IOException;

public class exception4 {

	public static void main(String[] args) {
		try {
//			ex E = new ex();
//			E.loader("data"); // 여기서 loader로 냅다 던져버림
			Exception exception = new Exception(); //throw : 자신을 호출하여 예외가 발생하면 자신dmf 호출한 class return.
			throw exception; //try의 맨 마지막줄에 삽입 
			
//			} catch (IOException e) {
//			System.out.println(e);
			// } catch (Exception | NumberFormatException e1) { //이렇게도 이중선언 할 수 있음!
		} catch (Exception e) {
			System.out.println(e);
		}
		// IOException : FileReader,FileWriter등 파일을 로드하거나 관리할때 / SQL 등등 특수한 것을 구축하여 사용할
		// 때
		// (평문) Exception : 전범위에 사용
	}

}

class ex {
	Exception ep = null;

	// IOException IO = null;
	public void loader(String a) throws Exception { // throws는 try~catch문을 받기위한 class를 로드함.
		//잘못된 문법 사항(자신의 오류를 자기의 main class에 모두 전달하는 상황임)
		if (a == "ok") {
			int keycode = Integer.valueOf(a); //정상적이지만, loader class 자체적인 오류가 발생
		} else {
			System.out.println("test"); //해당 문법은 자신의 오류사항에 대한 예외처리가 잘못된 경우
			try {
//			} catch (Exception e) {
//				this.ep = new Exception();
//				// this.IO = new IOException();
//				throw this.ep;
			}catch (Exception e) {
				System.out.println(e.getMessage()); //자신의 오류를 리턴받아서 확인함
				this.ep = new Exception();
				throw this.ep;
			}
		}

	}
}