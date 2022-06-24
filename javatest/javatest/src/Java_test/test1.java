package Java_test;
//이거 사실 공통된것만 추리면 더 줄일 수도 있을거 같은데 헛짓을 한거같은 느낌ㅎㅎ;;
import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		process pc = new process();
		pc.menu();
	}
}

class process extends test1_abstract {
	static ArrayList<String> Subj = new ArrayList<String>();
	private String sub = "";
	private String Num = "";
	protected Scanner search=new Scanner(System.in);

	 
	public void menu() {
		Subj.add("국어");
		Subj.add("영어");
		Subj.add("수학");
		Subj.add("과학");
		Subj.add("사회");
	
		while (true) {
			System.out.println("과목추가[1], 과목삭제[2], 과목리스트 확인[3]을 선택해 주세요?(숫자만)");
			this.Num = this.search.nextLine();

			if (this.Num.equals("1")) {
				process P = new process();
				P.NUM1();
			} else if (this.Num.equals("2")) {
				process P = new process();
				P.NUM2();
			} else if (this.Num.equals("3")) {
				process P = new process();
				P.NUM3();
			} else if(this.Num.equals("종료")) {
				close();
			} else {
				System.out.println("잘못된 입력입니다.");
				menu();
			}
			
		}
	}

	@Override
	public void NUM1() {
		System.out.println("추가할 과목명을 입력하세요?");
		String msg = "";
		this.sub = this.search.nextLine();
		int j = 0;
		do {
			if (Subj.get(j).equals(this.sub)) {
				msg ="이미 등록된 과목명이 있습니다.";
			} else {
				Subj.add(this.sub);
				msg = "정상적으로 등록 되었습니다.";
			}
			j++;
		} while (j < Subj.size());
		System.out.println(msg);
		this.sub = null;
		menu();
	}

	@Override
	public void NUM2() {
		System.out.println("삭제할 과목명을 입력하세요?");
		this.sub = this.search.nextLine();
		String msg = "";
		int j;
		for(j=0; j < Subj.size(); j++) {
			if (Subj.get(j).equals(this.sub)) {
				Subj.remove(this.sub);
				msg = "정상적으로 삭제 되었습니다.";
			} else {
				msg = "해당 과목명이 없습니다.";
			}
		}
		System.out.println(msg);
		this.sub = null;
		menu();
	}

	@Override
	public void NUM3() {
		System.out.println(Subj);
		menu();
	}
	public void close() {
		search.close();
		System.exit(0);
	}

}