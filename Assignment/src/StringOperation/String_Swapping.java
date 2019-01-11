package StringOperation;

import java.util.Scanner;

public class String_Swapping {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first String:\t");
	String s1=scan.nextLine();
	
	System.out.println("Enter the Second Stirng:");
	String s2=scan.nextLine();
	
	System.out.println("\nString before Swapping:");
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	
	
	System.out.println("\nString After Swapping:");
	
	String Temp=s1;
			s1=s2;
			s2=Temp;
		System.out.println("s1:"+s1);	
		System.out.println("w2:"+s2);
}
}
