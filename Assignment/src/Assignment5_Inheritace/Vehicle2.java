package Assignment5_Inheritace;
//Single Inheritance with getter and setter Method
//Main---MainVehicle2
public class Vehicle2 {

	String color;
	private int speed;
	private int size;

	public int getSize()
	{
	return size;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSize(int i)
	{
		size=i;
	}
	public void setSpeed(int i)
	{
		speed=i;
	}
	
}

 class Car2 extends Vehicle2{
	 int cc;
	 int gear;
	 int color;
	 
	
}