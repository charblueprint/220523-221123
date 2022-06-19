//{이름,통신사,전화번호,나이,주소,이메일,포인트}
/* DB에서 naver.com 메일 주소를 사용하는 총 고객 인원 수 출력 DB 로드 시 
 추상 클래스에서 로드가 되도록.
 epdlxj : */
public class example1 {

	public static void main(String[] args) {
		find FD = new find();
		FD.setemamil();
		
	}
}
abstract class dataload{
	public abstract void setemamil();
	public abstract int getemail();
	public abstract void datas();
}
class find extends dataload{
	protected String DATA[][];
	protected int count=0;
	protected String email="";
	
	@Override
	public void setemamil() {
		datas(); // this.DATA 로드 시작
		this.count = 0;
		this.email = "gmail.com";
		// this.email에 들어있는 것만 분류!
		int i=0;
		do {
			if(this.DATA[i][5].indexOf(this.email)!=-1) {
				this.count+=1;
			} i++;
		}while(i<this.DATA.length);
		System.out.println("사용자 수 : " + getemail());
	}
	@Override
	public int getemail() {
		return this.count; //사람 수를 받아서 메인으로 토스
	}

	@Override
	public void datas() {
		this.DATA = new String [][]
				{{"홍길동","SKT","010-1236-4879","45","종로구","hong@gmail.com","2200"},
			 {"김도형","LG","010-1267-5879","25","강남구","kim@nate.com","2100"},
			 {"서한솔","LG","010-1267-4112","37","종로구","soso4112@naver.com","1200"},
			 {"정재성","SKT","010-3221-8871","41","강남구","jsung_kks@naver.com","700"},
			 {"한울","KT","010-2455-4879","22","금천구","han1004@nate.com","920"},
			 {"강은형","SKT","010-3770-4009","34","종로구","kans32@gmail.com","1250"},
			 {"김실","KT","010-1606-3137","20","은평구","kimsil_love@nate.com","4505"},
			 {"서한결","SKT","010-3412-0902","31","금천구","hanso12@nate.com","2125"},
			 {"정재혁","LG","010-4557-8282","30","은평구","jehyuk@naver.com","8160"},
			 {"이선영","KT","010-3738-4800","55","강서구","sunyoung@nate.com","4510"},
			 {"차은우","SKT","010-5242-0879","42","강남구","chreey@gmail.com","6720"}};
	}
	
}