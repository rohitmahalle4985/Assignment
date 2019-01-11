package StringOperation;

public class Reverse_String {
	public static void main(String[] args) {
		
String str="JAVA BY KIRAN";
String[] s=str.split("");

System.out.println("reverse String of"+str+":");
	for(int i=s.length-1;i>=0;i--)
	{
		char temp[]=s[i].toCharArray();
		for(int j=temp.length-1;j>=0;j--)
		{
			System.out.print(temp[j]);
		}
	System.out.print("");
	
}

	}
}
