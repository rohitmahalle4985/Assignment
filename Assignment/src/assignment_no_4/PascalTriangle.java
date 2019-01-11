package assignment_no_4;

import java.util.Scanner;

public class PascalTriangle 
{
public static void main(String[] args) 
{
	int no_row,c=1,blk,i,j;
	System.out.println("Input no of rows");
	Scanner scan=new Scanner(System.in);
	no_row=scan.nextInt();
	for(i=0;i<no_row;i++)
	{
		for(blk=1;blk<=no_row-i;blk++)
		System.out.println("");
		for(j=0;j<=i;j++){
			if(j==0||i==0)
				c=1;
				else
				c=c*(i-j+1)/j;
				System.out.println(""+c);
	}
			System.out.println("\n");
			scan.close();
}
		
}
}	
	


