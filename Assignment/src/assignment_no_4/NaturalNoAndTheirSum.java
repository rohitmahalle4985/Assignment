package assignment_no_4;

import java.util.Scanner;

//Display n terms of natural number and their sum
public class NaturalNoAndTheirSum {
public static void main(String[] args) {
	{
		int i,n,sum=0;
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("Input number");
			n=scan.nextInt();
scan.close();			
		}
System.out.println("The first natural number are :"+n);
for(i=1;i<=n;i++){
	System.out.println(i);
	sum+=i;
	
}
System.out.println("\n"+"The sum of natural number up to n terms:"+sum);
}
}}
