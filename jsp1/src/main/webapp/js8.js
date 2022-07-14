function data_c(index) {
	var datac = ["S", "V", "N", "N"];

	var level = null;
	switch (index) {
		case 1:
			level = datac[1];
		case 2:
			level = datac[2];
		case 3:
			level = datac[3];
		case 4:
			level = datac[4];
		default:
			level = "해당 값이 올바르지 않습니다.";
	} return level;
}