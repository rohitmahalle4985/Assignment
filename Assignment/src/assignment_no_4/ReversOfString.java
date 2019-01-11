package assignment_no_4;
//import java.util.Arrays;

//how t reverse a String without using any direct method
public class ReversOfString {
	public static void main(String[] args) {
		String s="Rohit Mahalle";
		int n = s.length();
		char[] ch=s.toCharArray();  
		for(int i = n - 1; i >= 0; i--){  
		System.out.print(ch[i]); 
		}
	/*String rev=new String(a);
	System.out.println(rev);*/
	}
}
