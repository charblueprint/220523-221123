function searchid(intext) {
	var users = [
		{ "aperson": "김수빈", "auserid": "kimsubin" },
		{ "aperson": "김정민", "auserid": "min1004" },
		{ "aperson": "오유나", "auserid": "yuna0809" },
		{ "aperson": "김진수", "auserid": "jinsulove" },
		{ "aperson": "김창순", "auserid": "soon777" },
		{ "aperson": "이유림", "auserid": "lim_lee79" },
		{ "aperson": "하윤성", "auserid": "hayunsung1313" }];

	var w;
	var ck = false;
	while (w < users.length) {
		// console.log("해당 사용자가 없습니다. ")   else {ck = ture;}
		if (intext == users[w]["auserid"]) {
			console.log("이름 : " + users[w]["aperson"] + "아이디 : " + users[w]["auserid"]);
			ck = true;
		}
		w++;
	}
	if (ck == false){
		console.log("해당 사용자는 검색대상에 없습니다. ");
	}
}