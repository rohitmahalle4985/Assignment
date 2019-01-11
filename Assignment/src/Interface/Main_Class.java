package Interface;

public class Main_Class implements A,B {
	
	public void myMethod()//Implementation of myMethod from A,B 
	{
		System.out.println("Multiple Inheritance example using Interfaces");
	}
	public static void main(String[] args) {
	Main_Class a=new Main_Class();
	a.myMethod();
	}

}
