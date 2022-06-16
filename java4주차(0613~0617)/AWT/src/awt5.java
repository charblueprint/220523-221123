import java.util.ArrayList;
import java.util.Arrays;

// 중복 아이디 체크 시스템 만들기 : awt5_abstract 연동 사용
//데이터 : hong,lee,park
public class awt5 {

	public static void main(String[] args) {
		handle hand = new handle();
		hand.design();
	}

}
class handle extends awt5_abstract{
	protected ArrayList <String> Arr = null; 
	private String ID;//awt에서 넘어온 인수값을 클래스에서 활용
	private String return_ID;//awt로 다시 값을 전달하는 전역변수
	//awt로 다시 값을 전달하는 전역변수 : null일 경우 아이디 사용가능
	//아이디값이 전달 : 해당 아이디는 사용할 수 없음
	
	@Override
	public void Search(String ID) { //setter
		//awt에서 중복버튼을 클릭시 해당 변수를 지속적을 초기화 하는 부분
		this.return_ID = "";
		this.ID = ID;
		this.dataload(); //정상적으로 데이터가 넘어 왔을 경우 해당 메소드를 로드하여 확인하게 됨.
		int i=0;
		do {
			if(this.ID.equals(this.Arr.get(i))) {
				this.return_ID = this.Arr.get(i);
				break;
			}
			i++;
		} while (i<this.Arr.size()); 
	}
	@Override
	public String signalok() { //getter
		return this.return_ID;
	}

	@Override
	public void dataload() {
		String ori[] = {"hong","lee","park","jong","kim","he","seo"};
		this.Arr = new ArrayList<>(Arrays.asList(ori)); 
	}

	
	
}