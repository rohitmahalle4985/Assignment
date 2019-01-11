package Patterns;

public class _1_121_12321 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int spc=4;spc>=i;spc--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
				
			}
			//System.out.println();
			
			for(int k=i-1;k>=1;k--)
			{
			System.out.print(k+"");
			}
		System.out.println();
		
	}

}
}