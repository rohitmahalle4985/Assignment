package Assignment5_Inheritace;
//multilevel Inheritance
//Main--MainCar3
public class Car3 {
	
	public void car()
	{
	System.out.println("Constructor of class Car");
	}
	
	public void vehicleType()
	{
		System.out.println("vehicle type:Car");
	}
}
class Maruti extends Car3{
	public Maruti()
	{
		System.out.println("Brand:Maruti");
	}
	
	public void brand()
	{
		System.out.println("Brand:Maruti");
	}
	public void speed()
	{
		System.out.println("Max Speed:90 kmph");
	}
}
class Maruti800 extends Maruti{
	 public Maruti800()
	{
	System.out.println("Constructor of class Maruti800");	
	}
	public void speed()
	{
	System.out.println("Max speed:80kmph");	
	}
}


