package com.jbk;

public class ReverseNo_Demo {
	public static void main(String[] args) {
		int number=1234;
		int reverse = 0;
		int temp = 0;
		
		while(number>0)
		{
			temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
		}
		System.out.println("reverse no is "+reverse);
	}

}
