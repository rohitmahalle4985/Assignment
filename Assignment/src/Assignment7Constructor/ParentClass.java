package Assignment7Constructor;
//program for super variable
//Main---ParentClass
public class ParentClass {
	int num=100;
}
class SubClass extends ParentClass
{
	int num=110;
void printNumber()
  {
	System.out.println(super.num);
	}
}

