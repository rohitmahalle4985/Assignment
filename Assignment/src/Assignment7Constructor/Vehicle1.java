package Assignment7Constructor;
//Program for super vehicle
//main--MainVehicle1

public class Vehicle1 {
int maxSpeed=120;
}

class Car extends Vehicle1
{
	int maxSpeed=180;
	
	void display()
	{
	System.out.println("Maximum Speed:"+super.maxSpeed);	
	System.out.println("Maximum Speed:"+maxSpeed);
	}
}


