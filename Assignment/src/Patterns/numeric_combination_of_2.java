package Patterns;

public class numeric_combination_of_2 {
public static void main(String[] args) {
	//int count=1;
	for(int i=1;i<=5;i++)
	{
		
	
		for(int j=1;j<=i;j++)
		{
		//	count=count+1;
			System.out.print(j);
			
		}
	System.out.println();
	}
	
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
