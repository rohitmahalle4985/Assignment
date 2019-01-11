package Assignment5_Inheritace;
//Inheritance program
//Main==MainHierarchical
public class Hierarchical {
	public void methodA()
	{
	System.out.println("Method of class A");
	}
}

class B1 extends Hierarchical{
	public void methodB()
	{
	System.out.println("Mehtod of class B");
	}
}

class C extends Hierarchical{
	public void methodC()
	{
	System.out.println("Method of class C");
	}
}

class D extends Hierarchical{
	public void methodD(){
		System.out.println("Method of class D");
	}
}