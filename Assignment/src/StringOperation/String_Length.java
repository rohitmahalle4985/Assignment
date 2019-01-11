package StringOperation;

import java.util.Scanner;

public class String_Length {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your Name:- ");
	String ab=scan.nextLine();
	char[]ac=ab.toCharArray();
	
	int i=0,k=0;
	try{
		for(i=0;ac[i]!='\0';i++)
			k++;
		
	}
	catch(Exception e)
	{
		System.out.println("String Lenght is:"+k);
	}
	scan.close();
}
}
