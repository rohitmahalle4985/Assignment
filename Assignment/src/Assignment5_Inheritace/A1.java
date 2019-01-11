package Assignment5_Inheritace;
//program for hierarchical Inheritance
//main---MainA1
public class A1 {
	public void methodA1()
	{
		System.out.println("Method of class A1");
	}
}
class P extends A1{
	public void methodP()
	{
	System.out.println("Method of class P");	
	}
}
class Q extends A1{
	public void methodQ()
	{
	System.out.println("Method of class Q");	
	}
}
class R extends A1{
	public void methodR()
	{
		System.out.println("Method of class R");
	}
}