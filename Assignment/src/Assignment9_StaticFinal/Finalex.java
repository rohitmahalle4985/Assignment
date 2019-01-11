package Assignment9_StaticFinal;
//Program final variable Demo
public class Finalex {
	final int a=10;
	final void jbk()
	{
		//final int i=0;---Compile time errors final variable cant be change
		for(int i=0;i<5;i++)
			System.out.println("value of i=n"+i);
		}
	
	public static void main(String[] args) {
		Finalex e=new Finalex();
		e.jbk();
	}

}
