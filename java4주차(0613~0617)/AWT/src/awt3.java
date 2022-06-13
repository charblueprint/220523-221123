import java.awt.Frame;

public class awt3 {

	public static void main(String[] args) {
		popup p = new popup();
		p.design("awt 연습 타이틀");
//		popup p2 = new popup();
//		p2.design("awt 연습 타이틀 2번째");
	}

}
abstract class design {
	Frame fr = new Frame();
	public void design(String title) {
		this.fr.setTitle(title);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(0, 0, 300, 300);
	}
	public abstract void page();
}
class popup2 extends design{
	@Override
	public void page() {
		
	}
}
class popup extends design{

	@Override
	public void page() {
		
	}
		
}