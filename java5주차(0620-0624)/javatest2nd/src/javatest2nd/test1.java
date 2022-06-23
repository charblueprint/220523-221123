package javatest2nd;

public class test1 {

	public static void main(String[] args) {
		highgrade H1 = new highgrade();
		H1.data();

		System.out.println("1µî : " + H1.getNamedata()+"("+H1.getGradedata()+")");
	}
}
abstract class grade {
	public abstract void setData();
	public abstract String getNamedata();
	public abstract int getGradedata();
	public abstract void data();
}
class highgrade extends grade {
	private String rdata[][] = null;
	private String name = null;
	private int grade =0;
	private int i = 0;

	@Override
	public void data() {
		this.rdata = new String[][] {
				{ "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" },
				{ "65", "74", "23", "75", "68", "96", "88", "98", "54" } };

		setData();
	}

	@Override
	public void setData() {
		int max = Integer.parseInt(this.rdata[1][0]);
		//for¹® 1
//		for(i=0; this.i<this.rdata[0].length; this.i++) { 
//			if(Integer.parseInt(this.rdata[1][this.i]) > max) {
//				max = Integer.parseInt(this.rdata[1][this.i]);
//				this.name=this.rdata[0][this.i];
//			}
//		}

		//do~while¹® 2
		do { 
			if (Integer.parseInt(this.rdata[1][this.i]) > max) {
				max = Integer.parseInt(this.rdata[1][this.i]);
				this.name = this.rdata[0][this.i];
				this.grade = max;
			}
			this.i++;
		} while (this.i < this.rdata[0].length);
	}

	@Override
	public String getNamedata() {
		return this.name;
	}
	@Override
	public int getGradedata() {
		return this.grade;
	}

}