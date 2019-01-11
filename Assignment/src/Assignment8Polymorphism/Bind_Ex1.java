package Assignment8Polymorphism;
//Complex method Overriding(Dynamic Binding)example
//main--Bind_Ex1
public class Bind_Ex1 {
	String text="Bind_ex1's";
	void display()
	{
		System.out.println(text+"Function called");
	}}
class SubClass1 extends Bind_Ex1
{
	void display()
	{
		super.display();
		text="subclss1's";
		
		System.out.println(text+"Function called");
	}
}

class SubClass2 extends SubClass1
{
	void display()
	{
		super.display();
		text="subClass2's";
		System.out.println(text+"function called");
	}
}
