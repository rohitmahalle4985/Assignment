package StringOperation;

public class replace_String {
public static void main(String[] args) {
	String s1="JAVA BY KIRAN";
	char oldchar='A';
	char newchar='B';
	
	int length=s1.length();
	System.out.println("String length:-"+length);
	
	char a[]=new char[length];
	
	s1.getChars(0,length, a, 0);
	System.out.println("String before replace:-"+s1);
	
	int i=0;
	while(i<length)
	{
		if(a[i]==oldchar)
		{
			a[i]=newchar;
		}i++;
	}
	
	String news1=new String(a);
	System.out.println("String after replace:-"+news1);
}
}
