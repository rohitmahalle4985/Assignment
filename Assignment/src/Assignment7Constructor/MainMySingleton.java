package Assignment7Constructor;

public class MainMySingleton {
public static void main(String[] args) {
	MySingleton1 a= new MySingleton1();
	MySingleton1 b= new MySingleton1();
	
	a.x=a.x+10;
	System.out.println("Value of a.x="+a.x);
	System.out.println("value of b.x="+b.x);

}
}
