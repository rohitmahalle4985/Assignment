package com.jbk;

import java.util.Scanner;

public class SwitchCase_Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int day;
	System.out.println("Enterthe day no");
	day=scan.nextInt();
	switch(day)
	{
	case 1:
		System.out.println("sunday");
		break;
		
	case 2:
		System.out.println("Monday");
		break;
	
	case 3:
		System.out.println("tuesday");
		break;
	
	case 4:
		System.out.println("wednesday");
		break;
	
	case 5:
		System.out.println("thusday");
		break;
		
	case 6:
		System.out.println("Friday");
		break;
	
	case 7:
		System.out.println("Saturday");
		break;
		
	default:
		System.out.println("Invlid input");
	
	}
	scan.close();
}
}
