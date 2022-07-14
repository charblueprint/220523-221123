function call1(){
	var i;
	var j=5;
	var total=0;
	for(i=1;i<10;i++){
		var k=i*j;
		total+=k;
	}
	var result = return1(total);
	console.log(result);
}