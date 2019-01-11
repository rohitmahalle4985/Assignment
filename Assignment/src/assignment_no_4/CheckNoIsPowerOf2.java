package assignment_no_4;
//To check no is power of 2
public class CheckNoIsPowerOf2 {
public static boolean main(String[] args) {
	int num=14;
	if(num<=0){
		return false;
	}
	while(num>1){
		if(num%2!=0){
			return false;
		}
		num=num/2;
	}
	return true;
}
}
