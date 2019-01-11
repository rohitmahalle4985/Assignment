package Patterns;
/*  1 2 3 4 5
 *1	1
  2	1 0
  3	1 0 1
  4	1 0 1 0
  5	1 0 1 0 1	*/
public class binary_pyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print(0);
				}
			else
				{
				System.out.print(1);
				}
			}
			System.out.println();
			
		}
}
	}
