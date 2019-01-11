package StringOperation;

public class String_Buffer {
	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Java");
	System.out.println(sb);
	sb.append("ByKiran");
	
	System.out.println(sb);
	sb.insert(0, "Pune");
	System.out.println(sb);
	
	//Repplace String from 1 to 3rd index
	
	sb.replace(1,3,"Nagpur");
	System.out.println(sb);
	
	//count Capacity of String
	System.out.println(sb.capacity());
	
	sb.append("Java Programming Language");
	System.out.println(sb);
	
//After appending new String Capacity will be (16*2)+2=34 i.e(oldcapapcity*2)+2	
	System.out.println(sb.capacity());
	StringBuffer sb1=new StringBuffer("Java By Kiran");
	sb1.reverse();
	System.out.println(sb1);
	
	
	
	
	
	
}
}
