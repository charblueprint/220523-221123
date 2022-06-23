package javatest2nd;

public class test2  {

	public static void main(String[] args) {
		price pr = new price();
		pr.datas();
		
		System.out.println("구매하시고자 하는 총 결제 금액은: "+pr.total+"원입니다.");
	}
}
class price extends test2_data { //split
	static int total = 0; //중요
	public void datas() {
		String [] usershipping = {"사과=2","양파=1","마늘=1","파=1","참치캔=6","라면=8"};
		//구조가 동일하니까 글자부분을 비교해가면서 split 돌리기
	
	}
	
}