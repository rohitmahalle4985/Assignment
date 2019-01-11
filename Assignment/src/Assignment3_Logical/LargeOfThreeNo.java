package Assignment3_Logical;

import java.util.Scanner;

public class LargeOfThreeNo {
public static void main(String[] args) {
	int x,y,z;
	System.out.println("Enter Three Int");
	Scanner in = new Scanner(System.in);
			 x=in.nextInt();
			 y=in.nextInt();
			 z=in.nextInt();
			
			if(x>y&&x>z)
				System.out.println("First no is largest="+x);
			else if(y>x&&y>z)
				System.out.println("second no. is largest="+y);
			else if(z>x&&z>y)
				System.out.println("third no. is largest="+z);
			in.close();			
}
}
