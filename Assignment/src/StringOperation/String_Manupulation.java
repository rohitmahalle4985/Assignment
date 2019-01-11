package StringOperation;

public class String_Manupulation {
public static void main(String[] args) {
	String st="byKiran";
	String st1="Classes For Java and Selenium";
	
//This Fnction is find out the length
	System.out.println("Length of a given first String:"+st.length());
	System.out.println("\nLength of a given second String:"+st1.length());
	
//Convert String in to uppercase
	
	System.out.println("\nString st Convert into upperCase:"+st.toUpperCase());
	System.out.println("\nString st1 Convert into upperCase:"+st1.toUpperCase());
	
	
	System.out.println("\nSTring st Convert in to LowerCase:"+st.toLowerCase());
	System.out.println("\nString st1 Convert into LoverCase:"+st1.toLowerCase());
	
	System.out.println("\nConcatination of String st and st1:"+st.concat(st1));
	
	System.out.println("\nCompare both Strings are equal or not:s"+st.equals(st1));
	
	System.out.println("\nSubstring of st:"+st.substring(4));	
	System.out.println("\nSubstring of st1:"+st1.substring(4));
	
	System.out.println(st.toCharArray());
}
}
