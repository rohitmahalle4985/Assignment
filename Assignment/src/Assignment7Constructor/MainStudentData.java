package Assignment7Constructor;

public class MainStudentData {
public static void main(String[] args) {
	StudentData obj=new StudentData();
	System.out.println("student Name is:"+obj.getStuName());
	System.out.println("student age is:"+obj.getStuAge());
	System.out.println("student ID is:"+obj.getStudID());
	
	StudentData obj2=new StudentData(555,"chaitanya",25);
	System.out.println("student Name is:"+obj2.getStuName());
	System.out.println("student age is:"+obj2.getStuAge());
	System.out.println("student ID is:"+obj2.getStudID());
	StudentData obj3=new StudentData();
	
	obj3.setStuName("sumit");
	System.out.println(obj3.getStuName());
	System.out.println(obj3.getStuAge());
	
}
}
