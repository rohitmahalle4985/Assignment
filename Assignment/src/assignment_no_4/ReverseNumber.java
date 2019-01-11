package assignment_no_4;

public class ReverseNumber {
	public static void main(String[] args) {
		
int number=1234;
int reverse_number=0;
int temp=0;
while(number>0)
{
	temp=number%10;
	
	reverse_number=reverse_number*10+temp;
	number=number/10;
}
System.out.println("Reverse number is "+reverse_number );
}
}