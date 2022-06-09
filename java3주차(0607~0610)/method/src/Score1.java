/*0609 시작점*/
import java.util.Scanner;

public class Score1 {
	public static void main(String[] args) {
		String[] msg = {"검색할 데이터 학생명을 입력해 주세요? >> ",
				"검색할 과목[전체/국어/수학/과학/역사] >> ","검색데이터 학생명 : ","점수데이터 : ","해당 사용자는 존재하지 않습니다."};
		// 사용자 정보 입력 및 결과 정보 출력
		//System.gc();//=>예전에는 가비지 콜렉션을 쓰긴 했으나 최근 버전 오면서 안 쓰게 됨.
		//같은 패키지로 묶인 곳에도 해야한다.
		Scanner sc = new Scanner(System.in);
		System.out.print(msg[0]);
		String name = sc.next();
		String realname = name.replace(" ", "");
		Score2 d = new Score2();
		d.datas(realname,null);//보내는 곳
		
		String result = d.datas();//받는 곳
		if(result=="true") {
			System.out.println(msg[1]);
			String subject = sc.next();
			String realsubject = subject.replace(" ", "");
			d.datas(realname, realsubject);
			String score = d.datas();
			
			if(realsubject.equals("전체")) {
				String score2[] = score.split(",");
				System.out.printf("%s %s\n%s 국어:%s 수학:%s 과학:%s 역사:%s ",
						msg[2],realname,msg[3],score2[0],score2[1],score2[2],score2[3]);
				
			} else {
				System.out.println(msg[2]+realname+"\n"+msg[3]+realsubject+" "+score);
			}
		}
		else {
			System.out.println(msg[4]);
			System.exit(0); //0:정상종료 1:강제종료
		}
		sc.close();
		System.gc();
	}
	
	}
