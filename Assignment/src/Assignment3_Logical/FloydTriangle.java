package Assignment3_Logical;

import java.util.Scanner;

public class FloydTriangle {
public static void main(String[] args) {
	int n,num=1,c,d;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	System.out.println("Floyd's Triangle:-");
	
	for(c=1;c<=n;c++)
	{
		for(d=1;d<=c;d++)
		{
			System.out.println(num+"");
			num++;
		}
		System.out.println();
	}
	scan.close();
}
}
