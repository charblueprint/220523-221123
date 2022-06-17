package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//{이름,통신사,전화번호,나이,주소,이메일,포인트}
public class Example2 {
	/*
	 * DB에서 naver.com 메일 주소를 사용하는 총 고객 인원 수 출력 DB 로드 시 추상 클래스에서 로드가 되도록.
	 */
	public static void main(String[] args) {
		findemail FE = new findemail();
		FE.setDATA("naver.com");
		
	}

	class findemail extends Example2_abstract {
		

		@Override
		public void setDATA(String email) {
			data();
			int i=0;
			do {
				if(this.REAL[i][5].indexOf(email)!=-1) {
					/*원시형태의 배열사항으로 카운팅을 하게됨*/
					this.count+=1;
				}
				/*ArrayList로 생성시 메모리 할당 오버되는 상황이 발생할 수 있음*/
//				this.REAL = new ArrayList<>(Arrays.asList(this.REAL[i][5])); //
//					if(Arr.get(0).indexOf(email)!=-1) {
//						this.count+=1;
//					}
				i++;
			} while(i<this.REAL.length);
		}
		@Override
		public int getDATA() {
			return this.count;
		}
	@Override
	public void data() {
		this.REAL= new String[][]
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
}