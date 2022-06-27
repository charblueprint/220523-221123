import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//crawling »ç¿ë
public class net3 {

	public static void main(String[] args) throws Exception {
		String url ="http://www.ultrafashion.net/?enlipleMBDCEnc=bm89MCZrbm89MCZrd3JkU2VxPTQwNDM2ODYyJnM9MjIzNzAmYWRndWJ1bj1HRyZnYj1HRyZzYz02OWFiNWE4Mjg1M2E0MzNjODU2YjcyYTQ2MDA2MGFiNCZtYz0yMjM3MCZ1PXJhYmJpdGJveSZwcm9kdWN0PW5jdA==&gclid=EAIaIQobChMIwbugp6bN-AIVUNCWCh2cJwYUEAAYASAAEgIIW_D_BwE";
		URL urls = new URL(url);
		URLConnection con = urls.openConnection();
		int size = con.getContentLength();
		System.out.println(urls.getProtocol());
		System.out.println(urls.getPort());
		System.out.println(urls.getFile());
		InputStream is = urls.openStream();
		InputStreamReader isr = new InputStreamReader(is,"UTF8");
		BufferedReader br = new BufferedReader(isr);
		FileWriter write = new FileWriter("login.html");
		//FileOutputStream fs = new FileOutputStream("login.html");
		byte html[] = new byte[1024];
		String str =  "";
		
		while ((str=br.readLine())!=null) {
			write.write(str);
		//	fs.write(html,0,size);
		}
		br.close();

	}

}
