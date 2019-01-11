package Assignment8Polymorphism;
//Method overloading by changing its datatypes

public class Calculate 
{

	void sum(int a,int b)
	{
		System.out.println("Sum  is "+(a+b));
	}
	
	void sum(float a,float b)
	{
		System.out.println("sum is "+(a+b));
	}
	
	public static void main(String[] args) {
		Calculate c= new Calculate();
		c.sum(8,5);//sum(int a,int b)
		c.sum(4.6f,3.8f);//sum(float a,float b)
	}
}
