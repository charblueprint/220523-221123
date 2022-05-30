/*응용문제 #1 (0530)
 *다음 결과값이 출력되도록 for문으로 작성하시오.
 *5+2=7
 *5+3=8
 *5+4=9
 *5+5=10
 *6+2=8
 *6+3=9
 *6+4=10
 *6+5=11
 *....
 *9+5=14
 */
/* 응용문제 #2 더블 while문으로 제작
		 * 9*7=63
           9*6=54
		   9*5=45
		   8*7=56
		   8*6=48
		   8*5=40
		   7*7=49
		   7*6=42
		   7*5=35 */
/*응용문제 #3 다음 결과값을 보고 do~while문으로 제작하시오
5+4=9
5+5=10
5+6=11
5+7=12
4+4=8
4+5=9
4+6=10
4+7=11
3+4=7
3+5=8
3+6=9
3+7=10 */
package Questions0530;

public class Double_loop3 {

	public static void main(String[] args) {
		// 응용문제#1
		int i, j;
		for (i = 5; i <= 9; i++) {
			for (j = 2; j <= 5; j++) {
				// System.out.println(i + "+" + j + "=" + (i + j));
			}
		}
		// #2
		int x = 9;
		while (x >= 7) {
			int y = 7;
			while (y >= 5) {
				System.out.println(x + "*" + y + "=" + (x * y));
				y--;
			}
			x--;
		}
		// #3
		int a = 5;
		do {
			int b = 4;
			do {
				System.out.println(a + "+" + b + "=" + (a + b));
				b++;
			} while (b <= 7);
			a--;
		} while (a >= 3);

	}

}
