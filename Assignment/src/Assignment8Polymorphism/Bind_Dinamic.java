package Assignment8Polymorphism;
//simple method overriding(Dynamic Binding)
//main--MainBind_Dinamic
public class Bind_Dinamic {
	protected String val;
	void display(String str)
	{
		val="Base Class function";
		System.out.println(val);
	}}

/*class Subclass extends Bind_Dinamic
{
	void display(String str)
	{
		if (val==null)
				{
			str="Derived class Function".concat(str);
			System.out.println(str);
			
				}
	}
}*/
class SubClass extends Bind_Dinamic
{ 
		void display(String str)
		{
			super.display(str);
			if (val==null)
			{
				str="Derived class fumction".concat(str);
				System.out.println(str);
			}
		}
	}
