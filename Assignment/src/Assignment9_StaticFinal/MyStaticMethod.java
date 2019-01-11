package Assignment9_StaticFinal;
//progrm for static variable and methods
public class MyStaticMethod {
	private String name;
	private static String staticStr="Static String";
	
	public MyStaticMethod(String n)
	{
		this.name=n;
	}
	public static void testStaticMethod()
	{
		System.out.println("hey...I am in Static method");
		System.out.println(MyStaticMethod.staticStr);
	}
	public void testObjectMethod()
	{
		System.out.println("hey i am in non static method");
		System.out.println(MyStaticMethod.staticStr);
	}
	
	public static void main(String[] args) {
		MyStaticMethod.testStaticMethod();
		MyStaticMethod m=new MyStaticMethod("java2novise");
		m.testObjectMethod();
	}

}
