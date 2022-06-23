package javatest2nd;

public class test1answer {

	public static void main(String[] args) {
		fs f = new fs();
		f.load();
	}

}
abstract class data{
	public abstract int indexs(int[] data2);
	public abstract void load();
}
class fs extends data{

	@Override
	public int indexs(int[] data2) {
		int z = 0;
		int s = 0;
		while(s<data2.length) {
			if(data2[s] < data2[s]) {
				z=s;
			}
		}
		return z;
	}

	@Override
	public void load() {
		String[] nm = { "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"};
		String[] sc = {"65","74","23","75","68","96","88","98","54"};
		int sc2[] = new int [sc.length];
		
		int w=0;
		while(w<sc.length) {
			sc2[w] = Integer.parseInt(sc[w]);
			w++;
		}
		int ck = indexs(sc2);
		System.out.printf("1µî : %s %sÁ¡",nm[ck],sc2[ck]);
		//for each¹® 

	}
	
}