function partA(a, b) {

	var id = ["hong", "park", "kim", "jang", "lee"];
	var mpass = ["ahong", "bpark", "kkim123", "jang1234", "lee0909"];
	var ea = id.length;
	var f;
	var ck = false;
	var okk;



	for (f = 0; f < ea; f++) {
		if (a == id[f] && b == mpass[f]) {
			ck = true;
			okk = f;
			break;
		}
		else {
			console.log("회원정보를 확인해 주세요.")
		}
	}
	return okk;
}
function bb(PartBt, PartBe, PartBm) {
	if (PartBm != null) {
		console.log("탈퇴회원입니다");
	}
}
