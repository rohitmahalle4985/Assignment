package StringOperation;

import java.util.Scanner;

public class Count_Occurance {
	public static void main(String[] args) 
	{
		String s;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a String");
		s=scan.nextLine();
		
		System.out.println("Word=:"+wordCount(s));
		}
	
	public static int wordCount(String str)
	{
	int count=1;
	for(int i=0;i<=str.length()-1;i++)
	{
	if(str.charAt(i)==' ' &&str.charAt(i+1)!=' ')
	{
		count++;
	}
	}
	return count;
	}
	
	

}
