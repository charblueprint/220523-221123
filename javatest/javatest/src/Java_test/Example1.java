package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*응용문제 */
/*사용자가 6개의 숫자를 입력하는 로또 프로그램 입니다. 
 프로세서 시작시 "숫자를 입력해 주세요" 총 6번의 숫자를 입력받게 됩니다.
 그리고 lotto.txt 결과를 가진 파일을 로드하여 사용자가 입력한 값과 
 결과를 비교하여 몇개를 맞췄는지 검토하는 프로그램 코드를 작성하시오.
 [결과예시]
 로또 결과 : 총 3개의 번호를 맞추셨습니다.*/
//lotto.java연동
public class Example1 {

	public static void main(String[] args) {
		pick PP = new pick();
		PP.ooopen();
	}
}

class pick extends lotto {
	private ArrayList<String> Number=null;

	@Override
	public void ooopen(){
		try {
			this.LLL = new LinkedList<>();
			this.Fr = new FileReader(this.URL, Charset.forName("UTF8"));

			BufferedReader Buff = new BufferedReader(Fr);
			String full = Buff.readLine();
			String custom[] = full.split(" ");

			for (int d = 0; d < custom.length; d++) {
				this.LLL.add(custom[d]); //this.LLL = 문서로 되어있는 숫자
			}
			pickNum();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public LinkedList<String> tose() {
		return this.LLL;
	}
	@Override
	public void pickNum()  {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int i = 0;
		this.Number = new ArrayList<String>(); //유저가 뽑은 숫자
		do {
			System.out.print("숫자를 입력해 주세요. ("+(i+1)+"번째)");
			String user =sc.next();
			this.Number.add(user);
			i++;
		} while (i < 6); //

		for(int l=0; l<this.LLL.size();l++) {			
			if(this.LLL.contains(this.Number.get(l))) {
				count++;
			}
		}
	System.out.printf("로또 결과 : 총 %d개의 번호를 맞추셨습니다",count);
	}
	

}