package Assignment5_Inheritace;
//illustrate protected variable use  in java using shape class 
public class Shape {

	protected int sides;
	public Shape()
	{
		sides=3;
	}
	public int getSides()
	{
		return sides;
	}
	
	public void printSides()
	{
		System.out.println("This object has "+sides+" sides");
	}
}

 class Square extends Shape{
	public Square(int nSides){
		sides=nSides;
	}
}
