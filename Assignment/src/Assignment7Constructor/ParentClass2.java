package Assignment7Constructor;
//call super Explicitly too
//Main--MainParentClass2
public class ParentClass2 {
  ParentClass2() {
System.out.println("Constructr of Super class");
}
}

class SubClass2 extends ParentClass2
{
	SubClass2()
	{
		
		System.out.println("Constructor of subclass");
		
	}
	
	SubClass2(int a)
	{
		
		super();
		System.out.println("Constructor of  para");

	}
	void display()
	{
		System.out.println("Rohit");
	}
}
