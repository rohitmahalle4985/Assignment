package Abstraction;

public class mainabstarctclassdemo extends AbstractClassdemo{
	public void disp2()
	{
		System.out.println("I am obverrriding abtract class method");
	}
public static void main(String[] args) {
	mainabstarctclassdemo a= new mainabstarctclassdemo();
	{
		a.disp1();
		a.disp2();
		
	}
}
}