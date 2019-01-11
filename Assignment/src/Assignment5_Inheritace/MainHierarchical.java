package Assignment5_Inheritace;

public class MainHierarchical { 
	public void methodB(){
		System.out.println("Method of class B");
		
	}
	public static void main(String[] args){
		B1 obj1=new B1();
		C obj2=new C();
		D obj3=new D();
		
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();
}
}
