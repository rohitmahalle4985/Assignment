package StringOperation;

import java.util.Scanner;

public class remove_char {
	public static void main(String[] args) {
		//String input=new String("Rohit");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		String input=scan.next();
		
		System.out.println("String before remove:"+input);
		
		String output=new String();
		
		for( int i=0;i<input.length();i++)
		{
			for(int j=0;j<output.length();j++)
			{
				if(input.charAt(i)!=output.charAt(j))
				{
				output=output+input.charAt(i);	
				}
			}
		}
		System.out.println(output);
		System.out.println("Mahalle");
	}

}
