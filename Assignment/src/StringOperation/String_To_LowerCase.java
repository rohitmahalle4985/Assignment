package StringOperation;

import java.util.Scanner;

public class String_To_LowerCase {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the Character in Upper case");
		 char ch=scan.next().charAt(0);
		 //Calledd as Method Chaning because both having Same Return Type
		 int temp=(int)ch;
		 temp=temp+32;
		 ch=(char) temp;
		 System.out.println("Equivalent character in lower case=\n"+ch);
		 
	}

}
