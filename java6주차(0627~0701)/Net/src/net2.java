import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*���� ������ ��������*/
public class net2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է��� �ּ��� >>");
		String Url = sc.nextLine();
		//URL
		URL u = new URL(Url); 
		URLConnection con = u.openConnection();
		//.openConnection() �ش� ��θ� ����
		//System.out.println(con); //���� Ȯ�α�����
		
		//.getContentLength()
		int imgsize = con.getContentLength();
		//System.out.println(imgsize); // ���� ���� ���
		String imgtype = con.getContentType();
		//.getContentType()
		//System.out.println(imgtype);
		long date = con.getDate();
		//System.out.println(date);
		
		//.openStream()
		InputStream is = u.openStream();// URL���� ������ �о�ö� �����
		//URL���� ���� ������ 
		BufferedInputStream bi = new BufferedInputStream(is); 
		FileOutputStream fo = new FileOutputStream("wonwoo.jpg"); //�������� ����
		byte data[] = new byte[1024]; //1024=1KB �ش� ������ ������
		
		int imgdata=0;
		int cnt=0; //�ݺ���
		
		while ((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata); 
			cnt += imgdata;
			System.out.println("�ٿ�ε� ��...." + (cnt*100)/imgsize  + "%");
		} fo.flush();
		fo.close();
		System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�.");
	}

}
