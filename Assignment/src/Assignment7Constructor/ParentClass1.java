package Assignment7Constructor;
//Program for child class constructor call parent class constructor implicitly 
//main---MainParentclass1
public class ParentClass1 {
ParentClass1()
{
	System.out.println("Constructor of super class1");
}
}

class SubClass1 extends ParentClass1
{
	SubClass1()
	{
		System.out.println("Constructor of SubClass1");
	}
	
	SubClass1(int n)
	{
		System.out.println("Constructor with Arg");
	}
	
	void display()
	{
		System.out.println("Hello");
	}
	
}
