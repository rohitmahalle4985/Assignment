package Assignment9_StaticFinal;
//Program fir final method demo
public class Finalex1 {
	Finalex1()
	{
		System.out.println("This is default constructor of final ex2");
	}
	final int a=100;
	 void show()
	{
		System.out.println(a);
	}
	
	void welcome()
	{
		System.out.println("Welcome to java by kiran");
	}

}

class FinalexTest extends Finalex1
{
	void show()
	{
	System.out.println("This is method of finalexTest");	
	}
	public static void main(String[] args) {
		Finalex1 s= new Finalex1();
		s.show();
	}
}