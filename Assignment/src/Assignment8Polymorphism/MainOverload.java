package Assignment8Polymorphism;

public class MainOverload {
		 public static void main(String[] args) {
	Overload obj=new Overload();
	double result;
	int add;
	obj.demo(10);
	obj.demo(10,20);
	result=obj.demo(5.5);
	System.out.println("op:"+result);
	add=obj.demo(5,5,5);
	System.out.println("o/p:"+add);
	}
	}

