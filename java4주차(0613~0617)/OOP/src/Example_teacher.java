/*0614 시작점*/
public class Example_teacher {
	public static void main(String[] args) {
		arr1 ar = new arr1();
	}
}
abstract class vdata{
	public abstract void sender();
}
class arr1 extends vdata{
	private final int arr[]= {6,13,22,9,12,64,32,47,39};
	
	public arr1(){
		this.sender();
	}
	
	@Override
	public void sender() {
		int w = 0;
		int total =0;
		while(w<this.arr.length) {
			total+=this.arr[w];
			w++;
		} System.out.println("총 합계 : " + total);
	}
}