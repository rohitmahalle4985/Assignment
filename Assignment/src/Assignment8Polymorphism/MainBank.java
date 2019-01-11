package Assignment8Polymorphism;

public class MainBank {
public static void main(String[] args) {
	Bank b=new Bank();
	System.out.println("bank Rate of Interest:"+b.getRateOfInterest()+"%");
	
	Bank b1=new SBI();
	Bank b2=new ICICI();
	Bank b3=new Axis();
	System.out.println("SBI rate of interest:"+b1.getRateOfInterest()+"%");
	System.out.println("ICICI rate of interest:"+b2.getRateOfInterest()+"%");
	System.out.println("Axis rate of interest:"+b3.getRateOfInterest()+"%");
}
}
