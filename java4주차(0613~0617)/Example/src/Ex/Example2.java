package Ex;

import java.util.ArrayList;
import java.util.Arrays;

//{�̸�,��Ż�,��ȭ��ȣ,����,�ּ�,�̸���,����Ʈ}
public class Example2 {
	/*
	 * DB���� naver.com ���� �ּҸ� ����ϴ� �� �� �ο� �� ��� DB �ε� �� �߻� Ŭ�������� �ε尡 �ǵ���.
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
					/*���������� �迭�������� ī������ �ϰԵ�*/
					this.count+=1;
				}
				/*ArrayList�� ������ �޸� �Ҵ� �����Ǵ� ��Ȳ�� �߻��� �� ����*/
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
				{{"ȫ�浿","SKT","010-1236-4879","45","���α�","hong@gmail.com","2200"},
					 {"�赵��","LG","010-1267-5879","25","������","kim@nate.com","2100"},
					 {"���Ѽ�","LG","010-1267-4112","37","���α�","soso4112@naver.com","1200"},
					 {"���缺","SKT","010-3221-8871","41","������","jsung_kks@naver.com","700"},
					 {"�ѿ�","KT","010-2455-4879","22","��õ��","han1004@nate.com","920"},
					 {"������","SKT","010-3770-4009","34","���α�","kans32@gmail.com","1250"},
					 {"���","KT","010-1606-3137","20","����","kimsil_love@nate.com","4505"},
					 {"���Ѱ�","SKT","010-3412-0902","31","��õ��","hanso12@nate.com","2125"},
					 {"������","LG","010-4557-8282","30","����","jehyuk@naver.com","8160"},
					 {"�̼���","KT","010-3738-4800","55","������","sunyoung@nate.com","4510"},
					 {"������","SKT","010-5242-0879","42","������","chreey@gmail.com","6720"}};		 
		}

		

	}
}