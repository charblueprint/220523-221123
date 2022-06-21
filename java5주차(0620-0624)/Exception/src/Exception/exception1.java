package Exception;
/*Exception: try,catch와 함께 사용을 하게 됩니다.(예외 처리 사항)
 -RuntimeException : Error 발생시 예외처리 체크를 안함 => Null,class,Arraysize
 -OtherException : 예외 처리 체크 사항 모두 함
 <Exception의 종류>
 Arithmetic : 0으로 나눌 때 발생
 Nullpointer : Null 객체를 참조할 때
 ClassCast : 클래스형 변환
 NumberFormat : 숫자형으로 변환
 ArrayIndexOutOfBound : 배열 참조시 인덱스 번호 오류
 IOException : 입출력 문제 발생 O
 Exception : 전체 예외처리 현황 O
 */
//배열,통신,파일에서 자주 사용
public class exception1 {

	public static void main(String[] args) {
		int a;
		String b="a1";
		try { // 시작 점(1)
			a= Integer.valueOf(b); //error원인 : a1이라는 문자인데, 강제로 숫자로 변환시 a라는 문자로 인하여 오류(2)
		} catch (Exception e) { //걍 Exception으로만 던져줘도 되긴하지만.. 남들이랑 개발하면서 상대방에게 오류 원인을 알려주기 위해서!
			System.out.println(e); //(3)
		} finally { //고칠 방안+ 데이터 재 처리(4)
			b = b.replaceAll("[a-z][A-Z]", "");
			a = Integer.valueOf(b); //다시 던짐(5)
		}
		System.out.println(a); //최종 출력(6)
	}

}
