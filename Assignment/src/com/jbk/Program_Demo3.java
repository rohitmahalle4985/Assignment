package com.jbk;

import java.util.Scanner;

public class Program_Demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		String word1;
		System.out.println("Enter a no:");
		num1=input.nextInt();
		System.out.println("Enter a word");
		word1=input.next();
		System.out.println("Your input are...");
		System.out.println("The no. you have eneterd is "+num1);
		System.out.println("The word you have eneterd is "+word1);
	input.close();
	}

}
