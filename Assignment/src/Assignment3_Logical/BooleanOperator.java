package Assignment3_Logical;

public class BooleanOperator {
public static void main(String[] args) {
	boolean A=true;
	boolean B=false;
	
	System.out.println("A|B="+(A|B));
	System.out.println("A&B="+(A&B));
	System.out.println("!A="+(!A));
	System.out.println("A^B="+(A^B));
	System.out.println("(A|B)&A="+((A|B)&A));
}
}
