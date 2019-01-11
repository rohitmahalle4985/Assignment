package Patterns;

public class A_ABA_ABCBA_ABCBDCBA {
	public static void main(String[] args) {
	int count=0;
	
	for(int i='A';i<='D';i++)
	{
		for(int spc=4;spc>=1;spc--)
		{
			System.out.print(" ");
		}
		for(int j='A';j<=i;j++)
		{
			System.out.print((char)j+" ");
			 
		}
		//System.out.println();
		
		for(int k=i-1;k>='A';k--)
		{
		System.out.print((char)k+" ");
		}
	System.out.println();
	
}

}
}