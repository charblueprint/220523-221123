import java.util.Arrays;

public class Method4 {

	public static void main(String[] args) {
		//return에 값 2개 사용하기
		per p = new per();
		String info = p.userinfo();
		String info2[] = info.split(","); // 가끔 오류나는 기호들이 있어서 유의해서 쓰도록 하자.  /나 ,등은 먹음
		//System.out.println(Arrays.toString(info2));
		System.out.println(info2[1]);
		
		/*return에 값 2개 사용하기(배열 사용)*/
		String myinfo[] = p.userinfo2();
		System.out.println(myinfo[0]+myinfo[1]);
	}

}
class per {
	public String userinfo() {
		String user_name = "홍길동";
		String user_id = "hong";
		String user_info = user_name  + "," + user_id;
		return user_info;
	}
	public String[] userinfo2() {
		String user_name = "홍길동";
		String user_id = "hong";
		//String user_array[] = {user_name,user_id};
		//return user_array;	
		//위에 두 줄처럼 따로 배열 만들어도 되지만.. 너무 길어서 아래처럼 하나로 줄인다.
		return new String [] {user_name,user_id}; 
		//해당 1개 이상의 값을 return으로 보낼 경우
	}
}