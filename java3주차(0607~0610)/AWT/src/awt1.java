import java.awt.*;
import java.awt.event.*;

public class awt1 {
/*
 GUI모드 : (Java 7) AWT(abstract window 도구틀), SWING(AWT - 그래픽 업글 )
 CUI모드 : Scanner (X)
 
 SWING : JFrame -> JPanel -> JObject
*/
	public static void main(String[] args) {
		//AWT 생성 방식
		//Frame -> Panel -> Object(제작 순서)
		//Object-> Panel -> Frame (적용 순서)
		
		//String notice = "금일 00시부터 정기점검이 시작됩니다.";
		
		popclose pc = new popclose();
		Frame Fr = new Frame();//프레임 창 만들기
		Fr.setTitle("사용자 로그인"); //창 상단에 뜨는 이름
		Fr.setSize(500, 500); //창 크기
		Fr.setVisible(true);	//화면에 뜰지 말지 결정
		Fr.addWindowListener(pc); // awt 메소드를 상속받아 처리
		
		Panel Pa = new Panel(); //패널페이지
		
		CheckboxGroup radio = new CheckboxGroup(); //체크박스 그룹 설정

		TextField id = new TextField(10);//Textfield 10자까지
		TextField pw = new TextField(10);
		TextField sa = new TextField("사원번호를 입력하세요");//입력 데이터가 미리 적용됨
		Button b1 = new Button("로그인");//object 버튼
		Checkbox c1 = new Checkbox("자동 로그인");
		
		Checkbox c2 = new Checkbox("동의함",false,radio);
		Checkbox c3 = new Checkbox("동의 안함",true,radio);
		
		Pa.add(id);// add 추가 오브젝트를 패널에 적용
		Pa.add(pw);
		Pa.add(sa);
		Pa.add(b1);
		Pa.add(c1);
		Pa.add(c2);
		Pa.add(c3);
		//System.out.println(notice);
		Fr.add(Pa); //패널 > 프레임
	}

}
class popclose extends WindowAdapter {
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
	}
}