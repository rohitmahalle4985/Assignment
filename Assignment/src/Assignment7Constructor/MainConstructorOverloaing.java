package Assignment7Constructor;

public class MainConstructorOverloaing {
			public static void main(String[] args) {
			ConstOverloading obj=new ConstOverloading(35);
			System.out.println(obj.getRollNum());
			
			ConstOverloading obj1=new ConstOverloading();
			obj1.setRollNum(50);
			System.out.println(obj1.getRollNum());
			
			System.out.println(obj1.Rollno);
		}
	}

