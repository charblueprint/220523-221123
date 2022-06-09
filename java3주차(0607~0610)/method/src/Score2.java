
public class Score2 {
	//사용자 정보 확인 및 데이터 검수 파트	
	private String name; 
	private String subject; 
	private String score=null;
	private String sign="false"; 
	
	public void datas(String nm,String sub) { //setter
		this.name = name;
		this.subject = subject;
		this.sign = sign;
		this.score = score;
	}
	public String datas() {
		String userdata[][] = {
			 {"박은경","이경훈","장운","조기현","김진수"},
			 {"80","78","92","67","40"},
			 {"40","80","80","92","100"},
			 {"95","30","55","90","65"},
			 {"20","80","100","95","30"}
		};
		
		int i=0;
		int idx=0;
		while (i<userdata[0].length) {
			if(this.subject==null || this.name!=null) {
				if(this.name.equals(userdata[0][i])) {
					this.sign="true";
					idx=i;
				} return this.sign;
			} else if(this.subject!=null) {
				if(this.name.equals(userdata[0][i])) {
					idx=i;
				}
				switch(this.subject) {
					case "국어" :
						this.score = userdata[1][idx];
						break;
					case "수학" :
						this.score = userdata[2][idx];
						break;
					case "과학" :
						this.score = userdata[3][idx];
						break;
					case "역사" :
						this.score = userdata[4][idx];
						this.sign= this.sign+idx;
						break;
					default :
						this.score = userdata[1][idx]+","+userdata[2][idx]+","+userdata[3][idx]+","+userdata[4][idx];
						break;
				}
			}
			i++;
	} 
	return this.score;	
}

}