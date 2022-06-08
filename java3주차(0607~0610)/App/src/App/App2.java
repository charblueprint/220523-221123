package App;

public class App2 {
	private int ea;
	private String data_usernm = null;
	private String data_subject = null;
	public String signs = "false";
	private int idx = 0;
	private String msg=null;
	private String score = null;
	
	public static void main(String[] args) {		
		
	}
	
	public void sdatas(String unm,String sub) {
		this.data_usernm = unm;
		this.data_subject = sub;
	}
	
	public String datas(){
		String userdata[][] = {
			 {"박은경","이경훈","장운","조기현","김진수"},
			 {"80","78","92","67","40"},
			 {"40","80","80","92","100"},
			 {"95","30","55","90","65"},
			 {"20","80","100","95","30"}
		};
	
		if(this.data_subject==null) {
		int ws=0;
		this.ea = userdata[0].length;
		while(ws < ea) {
			if(this.data_usernm.equals(userdata[0][ws])) {
				this.idx = ws;
				this.signs="true";			
			}
			ws++;
		}
		return this.signs;
		}
		else {
			switch(this.data_subject) {
				
			case "국어":
				this.score = userdata[1][idx];
			break;
			
			case "수학":
				this.score = userdata[2][idx];
			break;
				
			case "과학":
				this.score = userdata[3][idx];
			break;
				
			case "역사":
				this.score = userdata[4][idx];
			break;
			
			default:
				this.score = userdata[1][idx]+","+userdata[2][idx]+","+userdata[3][idx]+","+userdata[4][idx];
			break;
			}
			return this.score;
		}
	}
	
}
