package Assignment7Constructor;
//program for constructor Demo
public class ConstructorDemo {
	public ConstructorDemo()
	{
	System.out.println("Constructor Running");	
	}
	
	public  ConstructorDemo(int a)
	{
		System.out.println("Constructor Running"+a);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo(5);
					
	}
}
