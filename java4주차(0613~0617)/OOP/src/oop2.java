import java.util.Arrays;

/*배열 신규 생성값을 정확하게 설정하여 신규배열로 생성하기*/
public class oop2 {

	public static void main(String[] args) {
		array1 ar = new array1();
	}

}
class array1{
	private int ar1[];
	private int i;
	public array1() {
		this.ar1 = new int[] {1,2,3,4,5,6,7}; // class array1의 필드에 선언하고 사용할 경우는 이렇게 써야함
		i = this.ar1.length;// 이렇게 만들면 그냥 바로 배열 만큼 만들 수 있음
		//<5이상 배열 값 뽑아보기>
		int w = 0;
		String newdata="";
		while(w<i) {
			if(this.ar1[w]>=5) {
				//System.out.print(this.ar1[w]);
				newdata += this.ar1[w]+","; //해당 조건의 값만 문자열로 변환하여 저장
			}
			w++;
		}
		String ar2[] = newdata.split(","); //해당 저장된 문자열을 split으로 구분하여 배열로 임시전환 (split : 숫자 사용 불가)
		int ar2_i= ar2.length;
		int oridata[] = new int [ar2_i];//문자열 갯수만큼 배열 생성자 값을 추가함
		
		int ii=0;
		while(ii<ar2_i) {
			oridata[ii]=Integer.parseInt(ar2[ii]); 
			//Integer.parseInt : String->int로 변환!! 후 신규배열 생성자에 값을 저장함
			ii++;
		}
		System.out.println(Arrays.toString(oridata));
	}
}