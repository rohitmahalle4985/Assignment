package Assignment7Constructor;

public class MySingleton {

	private static MySingleton myobj;
	
	private MySingleton()
	{
		
	}
	
	public static MySingleton getInstance()
	{
		if(myobj==null)
		{
			myobj=new MySingleton();
		}
		return myobj;
	}
	public void getSomeThing()
	{
		System.out.println("I am here...");
	}
	
	public static void main(String[] args) {
		MySingleton st=new MySingleton();
		st.getSomeThing();
	}
}
