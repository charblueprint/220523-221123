/*
 js9.html
 사용자 아이디와 패스워드를 전송
 var mid="hong";
 var mpw = "1234";
 a파트에 전송

 A파트 js9.js (아이디 및 패스워드)
 ['hong','park','kim','jang','lee']
 ['ahong','bpark','kkim123','jang1234','lee0909']
 제대로 넣었을 경우 인덱스값을 b파트에 보냄

 B파트 js9.js  (연락처 및 이메일) (나)
 ['Y','N','Y','Y','Y];
 ['01012345678','01055994411','01035370132','01078015457','01031374882']
 ['hong@naver.com','park@nate.com','kim_001@gmail.com','jang_go@gmail.com','lee09@naver.com'];
 n은 탈퇴회원(a에게 탈퇴회원이라고 보냄)
y면 전화번호,이메일을 다시 a에게
 
 * js9.html에서 아이디와 패스워드를 A파트에게 전달을 하며
 A파트 사용자는 아이디와 패스워드가 맞을 경우
 B파트 사용자에게 index값을 전달 합니다.
 B사용자는 index값을 받아서 연락처 및 이메일을 전달 하게 됩니다.
 단 B사용자는 회원탈퇴(N)일 경우 연락처와 이메일을 전달하지 않으며,
 탈퇴 회원이라고 A파트 사용자에게 전달 합니다.
 A파트 사용자는 B사용자에게 탈퇴회원 값을 받을 경우
 즉시, console에 탈퇴회원 입니다. 라고 메세지를 처리합니다.
 */
 
 function PartB(index){
	var mem =  ['Y','N','Y','Y','Y'];
	var tel = ['01012345678','01055994411','01035370132','01078015457','01031374882'];
 	var email = ['hong@naver.com','park@nate.com','kim_001@gmail.com','jang_go@gmail.com','lee09@naver.com'];
 	
 	var restel;
 	var resemail;
 	var msg=null;
 	if(mem[index]=='Y'){
		restel = tel[index];
		resemail = email[index];
	}else if(mem[index]==='N'){
		msg = "탈퇴회원";
	}
	
	//console.log("partb");
	return [restel,resemail,msg];
	
}

function aa2(nm,pw){
	 var names = ['hong','park','kim','jang','lee'];
 	var pws = ['ahong','bpark','kkim123','jang1234','lee0909'];
	var w=0;
	var al = names.length;
	var ck=false;
	var res=null;
	while(w<al){
		if(names[w]==nm && pws[w]==pw){
			//console.log("있음");
			ck=true;
			break;
		}
		w++;
	}
	if(ck==true){
		res = w;
	}
	return res;
	
}

function bb2(PartBt,PartBe,PartBm){
	 if( PartBm!=null){
	 //console.log( PartBm);
	 console.log("탈퇴회원입니다다다");
 }else{
	 console.log( PartBt);
	 console.log( PartBe);
	 console.log("회원입니다다다");
	 
 }
}