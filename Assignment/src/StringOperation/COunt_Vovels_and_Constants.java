package StringOperation;

import java.util.Scanner;

public class COunt_Vovels_and_Constants {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in)	;
	System.out.println("Enter a String");
	String s=scan.nextLine();
	int count=0;
	int num=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
			
		}
		else
		{
		num++;	
		}
	}
	System.out.println("There are "+""+count+""+" vovels and "+num+" constant");
}
}

