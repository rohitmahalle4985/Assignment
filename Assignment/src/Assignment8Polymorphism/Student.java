package Assignment8Polymorphism;

public class Student {
	String name;
	int age;
	String email;
	public void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setData(String name,int age,String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		
		
	}
	public void display(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	public static void main(String[] args) {
		{
			Student s1=new Student();
			s1.setData("Rohit",20);
			s1.display();
			
			Student s2=new Student();
			s2.setData("Rajasa", 24,"rajasa@gamail.com");
			
			s2.display();
			
			
		}
	}

}
