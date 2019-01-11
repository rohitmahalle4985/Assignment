package Assignment7Constructor;
//program for calling super class method using super
//Main--MainParentClass3Method
public class ParentClass3 {
	void display()
	{
	System.out.println("Parent class method");
	}
}

class SubClass3 extends ParentClass3{
	void display()
	{
		System.out.println("Child class method");
	}
	
	void printMsg()
	{
		display();
		super.display();
	}
}