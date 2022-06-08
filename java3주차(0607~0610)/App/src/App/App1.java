/*응용문제 <공용프로젝트>
여러명의 점수 데이터가 존재합니다.
프로그램 실행시 해당 사용자 이름을 입력합니다.
해당 점수 데이터 중 사용자 이름과 동일한 데이터만 출력되도록 합니다.

[프로세서 실행 결과]
검색할 데이터 학생명을 입력해 주세요? 홍길동
검색할 과목 점수 [전체] ? 전체
검색데이터 학생명 : 홍길동
점수데이터 : 국어:55 수학:60 과학:77 역사:90

데이터 값 String Grade[][]=~
{
{"박은경","이경훈","장운","조기현","김진수"},
{"80","78","92","67","40"},
{"40","80","80","92","100"},
{"95","30","55","90","65"},
{"20","80","100","95","30"}
};
A파트 :  
사용자가 해당질문을 입력할 수 있는 프로세서를 제작하고, 최종결과 값을 return받아서 처리해야 합니다.
단, 해당 데이터에 없는 사용자를 입력할 경우 데이터를 찾지 못했습니다.라고 입력되어야 합니다.
또한 과목을 전체로 입력할 경우 국어~역사까지 
모두 출력합니다. 해당 특정 과목을 입력할 경우 해당 과목 점수만 출력 되도록 합니다.


*/
package App;

import java.util.Scanner;

public class App1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 데이터 학생명을 입력해 주세요? >>");
		String name = sc.next();
		String realname = name.replace(" ", "");
		
		App.App2 A =new App.App2();
		A.sdatas(realname,null);//공백 제외 검색하고싶은 이름 보냈음
		String result = A.datas();
		
		
		String msg = "검색데이터 학생명 : ";
		String msg2 = "점수데이터 : ";
		if(result=="true") {
			System.out.print("검색할 과목 점수? >> ");
			String subject = sc.next();
			String realsubject = subject.replace(" ", "");
			A.sdatas(realname, realsubject); //이름, 보고싶은 과목 넘김
			String answer = A.datas(); //성적 받음
			
			if(subject.equals("전체")) {
				String S[]= answer.split(",");
				System.out.println(msg + realname);
				System.out.printf("%s국어:%s 수학:%s 과학:%s 역사:%s",msg2,S[0],S[1],S[2],S[3]);
			} else {
				System.out.println(msg + realname);
				System.out.println(msg2 + realsubject + " " + answer);
			}
		} else if(result=="false") {
			System.out.println("데이터를 찾지 못했습니다.");
			System.exit(0);
		} 
		

//		name=null;
//		sc.close(); //검색창 초기화 및 종료
//		
	}
	
}

	
	
	

	
	
