package Patterns;

public class numeric_Rhombus {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	for(int i=1;i<=3;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int k=3;k>=i;k--)
		{
			System.out.print(k);
			
		}
		System.out.println();
	}
	}
}
