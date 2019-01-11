package Assignment5_Inheritace;

public class MainVehicle2 {
public static void main(String[] args) {
	Car2 c2=new Car2();
	c2.color=500;
	c2.setSpeed(200);
	c2.setSize(22);
	c2.cc=1000;
	c2.gear=5;
	
	System.out.println("Color of car"+c2.color);
	System.out.println("speed of car"+c2.getSpeed());
	System.out.println("size of car"+c2.getSize());
	System.out.println("CC of car"+c2.cc);
	System.out.println("No of gears of cars"+c2.gear);
	
	
}
}
