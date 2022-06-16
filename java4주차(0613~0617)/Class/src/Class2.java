
public class Class2 {

	public static void main(String[] args) {
		/*응용문제
		더블 클래스를 이용하여 자식클래스에 결과값을 출력하는 프로세서를 제작하시오.
		클래스는 2가지가 있습니다.
		부모 클래스 : mother
		자식 클래스 : child
		메인 클래스에서 mother클래스로 값을 전달 값은 30 50 
		숫자 값 적용
		child에서 부모 클래스에 있는 값을 받아 두개의 숫자를 곱한 결과 값을 출력하시오.
		*/
		mother mo = new mother();
		mo.momo(30, 50);;
		mother.child Birth= mo.new child();
		Birth.Multi();
		
	}
}
class mother{
	int Nums1,Nums2;
	public void momo(int Num1,int Num2) {
		this.Nums1 = Num1;
		this.Nums2 = Num2;
	}	
		class child{
			int A = mother.this.Nums1;
			int B = mother.this.Nums2;
			public void Multi() {
				int total = A*B;
				System.out.println("A*B="+total);
			}
		}
	
}