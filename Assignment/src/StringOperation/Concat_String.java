package StringOperation;

import Assignment3_Logical.Char;
import Assignment6.Print;

public class Concat_String {
	public static void main(String[] args) {
		String s1="Rohit";
		String s2="Mahalle";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		System.out.print("c1 length:"+c1.length);
		System.out.print("\nc2 length:"+c2.length);
		int counter=c1.length+c2.length;
		System.out.print("\nTotal Length:"+counter);
		System.out.println("\n");
		
		char[] charContainer=new char[counter];//main point
		
		int i=0;
		for(;i<c1.length;i++)
			{
				charContainer[i]=c1[i];
				System.out.print(charContainer[i]);
			}
		System.out.println("\n 1st Container having char "+i);
		
		for(int j=0;j<c2.length;j++)
			{
				charContainer[i]=c2[j];
				System.out.print(charContainer[i]);
				i++;
			}
		System.out.println("\n 2nd Total char contain charContainer is:"+i);
		
		
		
		String concat=new String(charContainer);//This is for conversion of char array to string
		System.out.println("String Container:"+concat);
	}

}
