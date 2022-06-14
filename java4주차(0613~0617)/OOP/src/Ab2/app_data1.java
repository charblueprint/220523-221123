package Ab2;

public interface app_data1 {
	String a = null;
	int b = 0; //필드에 자료형을 비어있는값을 사용하는 경우 적용 자체가 안됨(무조건 값 적용)
	public void user_join(); //선언형태의 메소드는 this 사용 못함
	default void aaa() { //default에는 this 사용이 가능함(값이 있을 경우)
		System.out.println(this.a);
	}
}
