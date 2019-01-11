package Assignment7Constructor;
//Program for Overloading with Getter and setter with this keyword

//main----MainStudentData
public class StudentData 
{
	private int stuID;
	private String stuName;
	private int stuAge;

StudentData()
	{
	stuID=100;
	stuName="Rohit";
	stuAge=18;
	}

StudentData(int num1,String str, int num2)
	{
	stuID=num1;
	stuName=str;
	stuAge=num2;
	}

//getter and setter Methods
public int getStudID()
	{
		return stuID;
	}
public void setStuID(int stuID)
	{
		this.stuID=stuID;
	
	}
public String getStuName()
	{
		return stuName;
	}
public void setStuName(String stuName)
	{
		this.stuName=stuName;
	}
public int getStuAge()
	{
		return stuAge;
	}
public void setStuAge()
	{
		this.stuAge=stuAge;
	}
}

