package Assignment3_Logical;

public class DayMonthDemo {
public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int days=num%30;
	int month=num/30;
	System.out.println(num+"days="+month+"Month and"+days+"days");
}
}
