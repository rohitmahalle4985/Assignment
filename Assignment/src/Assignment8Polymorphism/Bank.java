package Assignment8Polymorphism;
//Method Overriding in Hierarchical type
//Main---MainBank
public class Bank {
int getRateOfInterest()
{
	return 0;
}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
	
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}

}

class Axis extends Bank
{
	int getRateOfInterest()
	{
		return 11;
	}

}

