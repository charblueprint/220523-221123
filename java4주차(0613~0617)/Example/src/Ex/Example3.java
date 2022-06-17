package Ex;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		/* 응용문제(숙제) */
		/*
		 1)가입된 회원 정보 중 현재 데이터 포인트가 적은 순서대로 사용자 이름을 정렬하여 출력합니다. //이거 따로 만들기 
		 2) 가입된 모든 회원의 포인트 총 합을 구하시오.->결과 : "회원 전체의 포인트 합계는 : 34390입니다."
		 */
		sorting ST = new sorting();
		ST.setter();
	}

}

abstract class sort {
	public abstract int getter();

	public abstract void setter();

	public abstract void data();

	String DDD[][];
	// 이름 뽑는 칸
}

class sorting extends sort {
	ArrayList<Integer> PO = new ArrayList<Integer>();
	protected int total = 0;

	@Override
	public void setter() {
		data();

		int i = 0;
		int j = 0;
		do {
			this.PO.add(Integer.parseInt(this.DDD[i][6]));
			i++;
		} while (i < this.DDD.length);
		do {
			this.total += this.PO.get(j);
				j++;
			} while (j < this.PO.size());

		System.out.printf("회원 전체의 포인트 합계 : %d", getter());

	}

	@Override
	public void data() {
		this.DDD = new String[][] { { "홍길동", "SKT", "010-1236-4879", "45", "종로구", "hong@gmail.com", "2200" },
				{ "김도형", "LG", "010-1267-5879", "25", "강남구", "kim@nate.com", "2100" },
				{ "서한솔", "LG", "010-1267-4112", "37", "종로구", "soso4112@naver.com", "1200" },
				{ "정재성", "SKT", "010-3221-8871", "41", "강남구", "jsung_kks@naver.com", "700" },
				{ "한울", "KT", "010-2455-4879", "22", "금천구", "han1004@nate.com", "920" },
				{ "강은형", "SKT", "010-3770-4009", "34", "종로구", "kans32@gmail.com", "1250" },
				{ "김실", "KT", "010-1606-3137", "20", "은평구", "kimsil_love@nate.com", "4505" },
				{ "서한결", "SKT", "010-3412-0902", "31", "금천구", "hanso12@nate.com", "2125" },
				{ "정재혁", "LG", "010-4557-8282", "30", "은평구", "jehyuk@naver.com", "8160" },
				{ "이선영", "KT", "010-3738-4800", "55", "강서구", "sunyoung@nate.com", "4510" },
				{ "차은우", "SKT", "010-5242-0879", "42", "강남구", "chreey@gmail.com", "6720" } };
	}

	@Override
	public int getter() {
		return this.total;
	}

}