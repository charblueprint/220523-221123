import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//인증번호 발송 시스템 awt6_abstract 연계
/**/
public class awt6 {

	public static void main(String[] args) {
		start st = new start();
		st.setting();
	}

}
class start extends awt6_abstract{
	private Boolean operate= false;
	private int Password=0;
	protected String realvaild;
	private String result="";
	@Override
	public void doublecheck() {
//		this.Password = userpass;
		
	}
	@Override
	public void data() {
		Random R = new Random();
		int i=1;
		int A;
		do {
			A = R.nextInt(10);
			this.result = A+" ";
			System.out.println(result);//컴퓨터가 가진 숫자
			i++;
		} while (i<3);
		
		return this.result;
		
	}
	@Override
	public int Num() {
		// TODO Auto-generated method stub
		return 0;
	}}