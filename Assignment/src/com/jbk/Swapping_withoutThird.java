package com.jbk;

import java.util.Scanner;

public class Swapping_withoutThird {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value for x");
	int x=scan.nextInt();
	
	System.out.println("Enter the value for y");
	int y=scan.nextInt();
	
	System.out.println("Before Swapping of values x="+x+"and y="+y);
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("After Swapping of values x="+x+"and y="+y);
	scan.close();
	
}
}
