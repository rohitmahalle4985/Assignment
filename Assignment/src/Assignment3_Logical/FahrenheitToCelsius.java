package Assignment3_Logical;

import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	float temprature=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Temprature in farehn");
	temprature=((temprature-32)*5)/9;
	System.out.println("temp.to Celsius="+temprature);

	scan.close();
}
}
