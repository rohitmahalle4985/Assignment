package Assignment7Constructor;
//Program for constructor chaining Demo
public class ChainningDemo {
	public ChainningDemo()
	{
		System.out.println("Default Constructor");
	}
	public ChainningDemo(String str)
	{
		this();
		System.out.println("Parameterized constructor with Single param");
	}
	public ChainningDemo(String str,int num)
	{
		this("Hello");
		System.out.println("Parameterized constructor with double args");
	}
	
	public ChainningDemo(int num1,int num2,int num3)
	{
		this("Hello",2);
		System.out.println("Parameterized constructor with Three args");
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ChainningDemo obj=new ChainningDemo(5,5,15);
		
	}

}
