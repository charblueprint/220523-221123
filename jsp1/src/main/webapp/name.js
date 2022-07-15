function searchname(intext) {
	var name = [{ "person": "김수빈", "email": "kim@nate.com" },
	{ "person": "김정민", "email": "jungmin@gmail.com" },
	{ "person": "오유나", "email": "ouna123@gmail.com" },
	{ "person": "김진수", "email": "kimjsu@nate.com" },
	{ "person": "김창순", "email": "soon0707@naver.com" },
	{ "person": "이유림", "email": "limlee@gmail.com" },
	{ "person": "하윤성", "email": "hayounsong@naver.com" }
	];

	var i;
	var searched = 0;
	for (i = 0; i < name.length; i++) {
		if (intext == name[i]["person"]) {
			console.log("고객명: " + name[i]["person"] + " 이메일: " + name[i]["email"]);
			searched++;
		}
	}
	if (searched == 0) {
		console.log("해당 사용자는 검색대상에 없습니다.");
	}

}





