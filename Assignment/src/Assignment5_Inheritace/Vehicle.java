package Assignment5_Inheritace;
//Program for single Inheritance
//main method--MainVehicle
public class Vehicle {
String color;
int speed,size;
void display(){
	System.out.println("Color:"+color);
	System.out.println("speed:"+speed);
	System.out.println("size:"+size);
}
}
class Car extends Vehicle{
	int cc;
	int gears;
	
	void displayCar(){
		System.out.println("color of car"+color);
		System.out.println("speed of car"+speed);
		System.out.println("Size of car"+size);
		System.out.println("cc of car"+cc);
		System.out.println("no. of gears of car"+gears);
	}
}

