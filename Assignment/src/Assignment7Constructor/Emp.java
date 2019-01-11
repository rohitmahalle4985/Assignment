package Assignment7Constructor;
//program for this in java
public class Emp {
	int e_id;
	String name;
	
	Emp(int e_id,String name)
	{
		this.e_id=e_id;
		this.name=name;
	}
void show()
{
System.out.println(e_id+" "+name);
}

public static void main(String[] args) {
	Emp e1=new Emp(1006,"Rajasa");
	Emp e2=new Emp(1007,"Rohit");
	
	e1.show();
	e2.show();
	
	
}
}

