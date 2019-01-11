package Assignment5_Inheritace;

//Example of single Inheritance
//Main--MainVehicle1
public class Vehicle1 {
String vehicleType;
}

class Car1 extends Vehicle1{
	String modelType;
	public void showDetails()
	{
		vehicleType="Car";
		modelType="Sports";
		System.out.println(modelType+""+vehicleType);
	}
	
}
