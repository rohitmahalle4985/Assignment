package Abstarction_Within_Packakage_1;

public class MainClass extends AbstClass {
	
	String name;
	void getVal(String name)
	{
		this.name=name;
	}
	void display()
	{
		System.out.println("Hello\n"+name);
	}
	@Override
	void getVal() {
		// TODO Auto-generated method stub
		
	}

}
