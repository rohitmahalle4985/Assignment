package StringOperation;

import java.util.Scanner;

public class reverse_String1 {
public static void main(String[] args) {
	String reverse="";
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=scan.nextLine();
	
	for(int i=s.length()-1;i>=0;i--)
	{
		 reverse=reverse+s.charAt(i);
	}
	System.out.println(reverse);
	
}
}
