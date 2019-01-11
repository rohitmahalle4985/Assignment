package Assignment3_Logical;

import java.util.Scanner;

public class Seconds {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the no. of seconds:");
	int input=scan.nextInt();
	
	int hour=input/3600;
	int minutes=(input%3600)/60;
	int seconds=(input%3600)%60;
	System.out.println("Hours:"+hour);
	System.out.println("Minutes:"+minutes);
	System.out.println("Seconds:"+seconds);
	scan.close();
}
}
