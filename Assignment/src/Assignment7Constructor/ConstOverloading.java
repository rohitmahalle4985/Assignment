package Assignment7Constructor;
//Program for Constructor  with this()
//main---MainConstructorOverlaoding
public class ConstOverloading {
	public int Rollno=150;
	
	ConstOverloading()
	{
		Rollno=100;
	}
	ConstOverloading(int num)
	{
		this();
		Rollno=Rollno+num;
	}
	
	public int getRollNum()
	{
		return Rollno;
	}
	
	public void setRollNum(int rollnum)
	{
		this.Rollno=rollnum;
	}
	
		
	}



