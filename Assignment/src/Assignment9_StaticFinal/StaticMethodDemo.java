package Assignment9_StaticFinal;
//Static method Demo
public class StaticMethodDemo {
public static void copyArg(String str1,String str2)
{
	str2=str1;
	System.out.println("First String arg is:"+str1);
	System.out.println("Second String arg is:"+str2);
}
public static void main(String[] args) {
	StaticMethodDemo.copyArg("PQR","DEF");
	copyArg("XYZ","ABC");
}
}
