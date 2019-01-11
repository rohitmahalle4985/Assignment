package StringOperation;

import java.util.Scanner;

public class Sort_String_Array {
public static void main(String[] args) {
	int i;
	int j;
	String temp;
	
	Scanner scan=new Scanner(System.in);
	String names[]=new String[5];//create an array of String
	System.out.println("Enter the five names/words");
	
	for(i=0;i<5;i++)
	{
		names[i]=scan.nextLine();
	}
	
	System.out.println("\nSorting Words/Names in Alphatical Order...\n");
	for(i=0;i<5;i++)
	{
		for( j=1;j<5;j++)
		{
			if(names[j-1].compareTo(names[j])>0)
			{
				temp=names[j-1];
				names[j-1]=names[j];
				names[j]=temp;
			}
		}
	}
	System.out.println("Words/names sorted in alphabetical order successfully...!!");
	System.out.println("\n now the list is :\n");
	for(i=0;i<5;i++)
	{
		System.out.println(names[i]);
	}
}
}
