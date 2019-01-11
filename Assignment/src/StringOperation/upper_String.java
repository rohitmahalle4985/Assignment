package StringOperation;

import java.util.Scanner;

public class upper_String {
public static void main(String[] input) {
char ch;
int temp;

Scanner scan=new Scanner(System.in);
{
	System.out.println("Enter a Character in lowercase");
	
	 ch=scan.next().charAt(0);
	temp=(int)ch;
	temp=temp-32;
	ch=(char)temp;
	System.out.println("Character in uppercase:-"+ch);
	
}
scan.close();
}
}
