package assignment_no_4;

import java.util.Scanner;

//Swapping without using third variable
public class SwappingWithoutThird {
	public static void main(String[] args) {
	Scanner scan= new Scanner (System.in);
	System.out.println("Enter the value of two Integer that is a and b");
	int a= scan.nextInt();
	int b= scan.nextInt();
	System.out.println("before Swapping of two number");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping of two values ");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	scan.close();
	
	
	}

}
