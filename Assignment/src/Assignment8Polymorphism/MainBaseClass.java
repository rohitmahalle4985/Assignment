package Assignment8Polymorphism;

public class MainBaseClass {
		 public static void main(String[] args) {
			DerivedClass der =new DerivedClass();
			der.method();
			
			BaseClass base=new BaseClass();
			base.method();
			
			BaseClass base1=new BaseClass();
			base1.method();
		}
	}

