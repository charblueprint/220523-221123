package Java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr = null;
	ArrayList<String> em_name = null;
	protected final int money = 8700000;
	public abstract void start(); 
	abstract void db2() throws IOException; // abstract���� IOException ������ ������ �ȵ�=> �����Ϸ��� public ����� �ؾ���
	public abstract int[] check(); //getter (���߸��� �̿��)
	public void start(String a) {};
	//�Ҽ��� ����� �ʿ��ϰ� �������� �ʿ䰡 ����? �׷��� �������̵� ���� �����ε��� ����. �� �Ҽ��� �� �� �ֵ���
}
