package Assignment3_Logical;

public class ReverseNo {
public static void main(String[] args) {
	int number=1234;
	int reverseno=0;
	int temp=0;
	
	while(number>0)
	{
		temp=number%10;
		reverseno=reverseno*10+temp;
		number=number/10;
	}
	System.out.println("Reverse no. is="+reverseno);
}
}
