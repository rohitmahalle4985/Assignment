package com.jbk;

public class DoWhileLoop_Demo {
	public static void main(String[] args) {
		int year=2016;
		if((year%400==00)||((year%4==0)&&(year%100!=0)))
			System.out.println("year "+year+" is a leap year");
		else
			System.out.println("year"+ year +" is not a leap year");
	}

}
