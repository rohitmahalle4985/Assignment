package Patterns;

public class _1_121_12321_1232_123_12 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		for(int k=i-1;k>=1;k--){
			System.out.print(k+" ");
		}	
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		
		for(int k=i-1;k>=1;k--)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	
}

}
}