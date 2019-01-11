package Patterns;

import java.util.Scanner;

public class Simpl_oddno_pyramid_from_user {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enetr the no of one u want:");
	
	int n =scan.nextInt();
	int count =1;
	for(int i=0;i<n;i++)
	{
		for(int j=n-i;j>0;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=0;k<count;k++)
		{
			System.out.print("# ");
		}
		count=count+2;
		
		/*for(int l=2;l<=i;l++)
		{
			System.out.print("# ");
		}*/
		System.out.println();
}
}
}