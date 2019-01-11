package Patterns;

import java.util.Scanner;

public class Square_Patterns {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your lines n:");
	int n=scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		for (int j=1;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
