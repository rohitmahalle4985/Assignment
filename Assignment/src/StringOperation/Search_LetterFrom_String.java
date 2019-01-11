package StringOperation;

import java.util.Scanner;

public class Search_LetterFrom_String {
public static void main(String[] args) {
	int First=0;
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter a String what u Want:");
	String word=scan.nextLine();
	
	System.out.println("You enterd String are: "+word);
	
	char[] wordArr=word.toLowerCase().toCharArray();
	for(int i=1;i<wordArr.length;i++)
	{
		if(Character.isWhitespace(wordArr[i]))
		{
			continue;
		}
		else
		{
		if(wordArr[i]<wordArr[First])
		{
			First=i;
		}
		}
		System.out.println("First letter of Enterd String :"+word.charAt(First));
	}
}
}
