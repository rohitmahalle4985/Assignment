package Patterns;

import java.util.Scanner;

public class Right_Triangle_from_right {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the no of rows:");
	int n=scan.nextInt();
	
	for(int i=0;i<n;i++)
	{
		for(int j=n-i;j>0;j--)
		{
			System.out.print("  ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("@ ");
		}
		System.out.println();
	}
}
}
