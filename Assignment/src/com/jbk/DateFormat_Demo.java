package com.jbk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_Demo {
public static void main(String[] args) {
	Date date=new Date();
	String strDateFormat="HH:mm:ss a";
	SimpleDateFormat stf= new SimpleDateFormat(strDateFormat);
	
	String Date_Format="MM:dd:yyyy";
	SimpleDateFormat sdf= new SimpleDateFormat(Date_Format);
	System.out.println("Todays Date is =="+sdf.format(date));
	System.out.println("Todays time is =="+stf.format(date));
}
}
