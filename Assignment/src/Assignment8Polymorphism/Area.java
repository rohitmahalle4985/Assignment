package Assignment8Polymorphism;
//method overloading by changing of arguments
//main--MainArea
public class Area {
	public void find(int l,int b)
		{
			System.out.println("Area is:"+(l*b));
		}
		public void find(int l,int b,int h)
		{
			System.out.println("Area is "+(l*b*h));
		}
	}

