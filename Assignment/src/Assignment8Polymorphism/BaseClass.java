package Assignment8Polymorphism;
//Example of method override
////MainBaseclass
public class BaseClass {
public void method()
{
	System.out.println("I,m the method of base class");
}
}

 class DerivedClass extends BaseClass
{
public void method()
{
	System.out.println("I amthe method driver class");
}
}
 