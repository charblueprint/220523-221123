package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 8700000;
	public abstract void start(); 
	abstract void db2() throws IOException; // abstract여서 IOException 적용이 어차피 안됨=> 적용하려면 public 지우고 해야함
	public abstract int[] check(); //getter (다중리턴 이용시)
	public void start(String a) {};
	//소수의 사람만 필요하고 나머지는 필요가 없다? 그러면 오버라이드 말고 오버로딩을 하자. 그 소수만 쓸 수 있도록
}
