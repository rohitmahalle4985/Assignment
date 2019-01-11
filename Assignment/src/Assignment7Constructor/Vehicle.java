package Assignment7Constructor;
//Program for cunstructor(parameterized)calling 
public class Vehicle {

	int wheels;
	private Vehicle(int wheels)
	{
		wheels=wheels;
		System.out.println(wheels+" Wheeler vehicle created");
	}
	
	
	public static void main(String[] args) {
		Vehicle v1=new Vehicle(2);
		Vehicle v2=new Vehicle(3);
		Vehicle v3=new Vehicle(4);
		
	}
}
