package StringOperation;

public class Print_String_in_Pyramid_Form {
public static void main(String[] args) {
	char[] s=new char[]{'R','o','h','i','t','M','a','h','a','l'};
	int a=s.length;
	int b=0;
	for(int i=0;i<=a;i++)
	{
		for(int j=a;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(" "+s[b]);
			b=b+1;
		}
		System.out.println();
	}
}
}
