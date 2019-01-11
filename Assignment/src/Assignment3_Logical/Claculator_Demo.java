package Assignment3_Logical;

import java.util.Scanner;
//c concept
public class Claculator_Demo {
public static void main(String[] args) {
	double rate1=0.1;
	double rate2=0.15;
	double rate3=0.2;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Entern the purchase price:");
	double total=scan.nextDouble();
	System.out.printf("10%%:%.2f\n",(total*rate1));
	System.out.printf("15%%:%.2f\n",(total*rate2));
	System.out.printf("20%%:%.2f\n",(total*rate3));
	scan.close();
}
}
