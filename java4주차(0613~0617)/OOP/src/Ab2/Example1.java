package Ab2;

public class Example1 {
	public static void main(String[] args) {
		home h[] = { new computer(), new moniter(),  };
		home2 h2[] = {new phone()}; //extends로 home을 로드하였음
		h[0].broken(40);
		h[1].broken(89);
		h2[0].broken(40);
//		h[2].broken(10);
	}
}
class computer implements home {
	@Override
	public void poweron() {
		System.out.println("컴퓨터 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("컴퓨터 전원 중단 ");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("컴퓨터 고장!");
		} else if ((this.bk > n) && (n > 0)) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}
class moniter implements home {
	@Override
	public void poweron() {
		System.out.println("모니터 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("모니터 전원 중단 ");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("모니터 고장!");
		} else if (this.bk > n && n > 0) {
			this.poweron();
		} else {
			this.poweroff();
		}
	}
}
/* 휴대폰에 추가 기능이 필요합니다. 휴대폰 고장시 최소 전원(20) -> 정상 전원 (40~79) / 80 이상 : 고장
 1.화면 즉 전원은 공급되지만 화면이 고장(공급 중 작동이 안되는 경우) - 20부터 39까지
 2.전원을 공급시키지만, 배터리 충전이 안 될 경우.(공급이 아예 안되는 경우) - 20이하 숫자일 경우
 */
class phone implements home2 {
	@Override
	public void poweron() {
		System.out.println("휴대폰 전원 공급중!!");
	}
	@Override
	public void poweroff() {
		System.out.println("휴대폰 전원 중단!!");
	}
	@Override
	public void broken(int n) {
		if (this.bk <= n) {
			System.out.println("휴대폰 고장!!");
		} else if (this.bk > n && n >= 0) {
			if (n >= 40) { this.poweron();} 
			else if(n >= 20 && n<= 39) { this.powerchk1();}				
			else if(n < 20) { this.powerchk2();}
			else { this.poweroff(); }
		}
	}
	@Override
	public void powerchk1() {
		System.out.println("화면 고장. 서비스 센터를 방문하세요");
	}
	@Override
	public void powerchk2() {
		System.out.println("배터리 충전 지연");
	}
}