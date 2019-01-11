package Assignment3_Logical;

public class RelationalProg {
public static void main(String[] args) {
	int i=37;
	int j=42;
	int k=42;
	
	//Greater than
	System.out.println("Greater than");
	System.out.println("i>j="+(i>j));//false
	System.out.println("j>i="+(j>i));//true
	System.out.println("k>j="+(k>j));//false
	
	//Greater than or equal to
	System.out.println("Greater than or equal to");
	System.out.println("i>=j="+(i>=j));//false
	System.out.println("j>=i="+(j>=i));//true
	System.out.println("k>=j="+(k>=j));//false
	
	// less than
	
	System.out.println("Less than");
	System.out.println("i<j="+(i<j));//true
	System.out.println("j<i="+(j<i));//false
	System.out.println("k<j="+(k<j));//false
	
	//less than equal to
	System.out.println("Less than equal to");
	System.out.println("i<=j="+(i<=j));//true
	System.out.println("j<=i="+(j<=i));//false
	System.out.println("k<=j="+(k<=j));//true
	
	//equal to
	System.out.println("equal to");
	System.out.println("i==j="+(i==j));//false
	System.out.println("k==j="+(k==j));//True
	
	//Not equal to
	System.out.println(" Not equal to");
	System.out.println("i!=j="+(i!=j));//True
	System.out.println("k!=j="+(k!=j));//false

}
}
