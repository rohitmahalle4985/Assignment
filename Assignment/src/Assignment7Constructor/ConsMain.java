package Assignment7Constructor;
//Program for Constructor Calling
public class ConsMain {

	private int x;
	
	private ConsMain()
	{
		System.out.println("Consrtuctor Called");
		x=5;  //it declared as a private at global
	}
	public static void main(String[] args) {
		ConsMain obj=new ConsMain();
		System.out.println("Value of x="+obj.x);
		
	}
	
	
	
}
