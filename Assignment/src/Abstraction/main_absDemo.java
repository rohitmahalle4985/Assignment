package Abstraction;


public class main_absDemo  {

	
	/*void m2()
	{System.out.println("Ravindra");
		
	}*/
	public static void main(String[] args) {
		//abs_Demo a=new main_absDemo();
		abs_Demo a=new abs_Demo()//annonymous inner class
		{
			void m1() {
				System.out.println("mahalle");		
					}
		};
	
	a.m1();
	a.m2();
}
}
