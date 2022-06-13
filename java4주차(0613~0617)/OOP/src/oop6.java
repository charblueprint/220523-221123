
public class oop6 {

	public static void main(String[] args) {
		// 배열 형태의 생성자 객체 추상클래스 만들기
		box[] b = {new Abox(), new Abox2(), new Abox3()}; //이런 방식은 abstract말고 일반의 경우에도 쓸수있다
		/*
		b[0].dataload();
		b[1].dataload(); */
		/*for(box z : b) { //이건 배열을 다 돌리겠다는 의미
			z.dataload();
		} => for each의 단점 : 특정 class를 골라서 중지하거나 작동하지 못함*/
		int w=0;
		while (w<b.length) {
			if(w!=1) { // 인덱스 1번 클래스는 사용하지 않음
				b[w].dataload();
			} w++;
		}
		
	}
}
abstract class box {
	public abstract void dataload();
}
class Abox extends box{
	@Override
	public void dataload() {
		System.out.println("test1");
	}
}
class Abox2 extends box{
	@Override
	public void dataload() {
		System.out.println("test2");
	}
}
class Abox3 extends box{
	@Override
	public void dataload() {
		System.out.println("test3");
	}
	
}