package Java_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll pl = new payroll();
		pl.start();
		
		int result[] = pl.check();
		System.out.println("총 이체한 금액은 "+result[0]+"원이고, 총 잔고금액은 "+result[1]+"원입니다.");
	}

}

class payroll extends pay_abstract {
	String filename = null;
	int total =0;
	int all_money = this.money;//현재 통장에 있는 잔고금액을 가져옴
	
	//입금 파트
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int f=0; // 반복문
		int input =0; //재무과 담당자가 입력하는 급여
		
		while(f<this.em_name.size()) {
			System.out.println("이체를 시작합니다.["+this.em_name.get(f)+"]에게 입금하실 금액을 입력하세요. >>");
			input =sc.nextInt();
			this.total+=input; //이체된 
			this.all_money-=input;
			f++;
		}
	}
	
	@Override
	public void start() {
		try {
			this.filename = "C:\\javatest\\javatest\\src\\paylist.txt";
			this.db2();
			this.input_sc();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public int[] check() {
		return new int [] {this.all_money,this.total};
		//리턴할때 Pair 절대 쓰지마라 
		//사유 : Pair은 값을 랜덤으로 넘기기 때문. 실무에서는 이 값을 예측할 수 없기 때문에 죽어도 안씀. 
	}

	@Override
	void db2() throws IOException {
		this.em_name = new ArrayList<>();
		this.fr = new FileReader(this.filename, Charset.forName("UTF8")); // 이것도 종류 맞춰서 넣어둬야 함
		// System.out.println((char) this.fr.read()); //+) .getEncoding() : 인코더 형식을 알아내는
		// 함수
		BufferedReader br = new BufferedReader(fr);
		// System.out.println(br.readLine());
		String data = br.readLine();
		// 항상 말하지만 BufferedReader를 한번 사용하면 다음 줄 부터는 사용이 불가능하기 때문에 저렇게 String이나
		// ArraysList같은 명령어로 복사한 애들 가지고 진행을 해야 한다.
		String DD[] = data.split(",");
		int i = 0;
		while (i < DD.length) {
			this.em_name.add(DD[i]);
			i++;
		}
		br.close();

	}

}