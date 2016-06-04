var global = 20;

function findMax()
{
	var a = 30;
	if(a > global) {
		alert(a+ " is greater than " +global);
		console("I am in max");
	} else {
		alert(a+" is smaller than " +global);
	}
}

function findiMin()
{
	var b = 12;
	if(b < global) {
		alert(b+ " is smaller than " +global);
		console("I am in min");
	} else {
		alert(b+ " is greater than "+global);
	}
}