
package Assignment9_StaticFinal;
//program for static variable demo
public class variable_Demo {
static int count=0;
public void increment()
{
	count++;
}
public static void main(String[] args) {
	variable_Demo obj1=new variable_Demo();
	variable_Demo obj2=new variable_Demo();
	obj1.increment();
	obj2.increment();
	System.out.println("obj1:count is="+obj1.count);
	System.out.println("obj1:count is="+obj2.count);
}
}
