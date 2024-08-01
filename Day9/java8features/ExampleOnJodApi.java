package com.training.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class ExampleOnJodApi {
public static void main(String[] args) {
	
	LocalDate dt =LocalDate.now();
	System.out.println("Today Date is : "+dt);
	Month m=dt.getMonth();
	int yer =dt.getYear();
	int day =dt.getDayOfMonth();
	System.out.println("Month and year and Day extracted from Date");
	System.out.println(m+" "+yer+" "+day);
	
	LocalTime lt =LocalTime.now();
	System.out.println("Current Time today is : "+lt);
	int mi =lt.getMinute();
	int h=lt.getHour();
	int s=lt.getSecond();
	System.out.println("Hours:minutes:seconds");
	System.out.println("C style Syntax");
	System.out.printf("%d:%d:%d",h,mi,s);
	System.out.println("");
	System.out.println("Hours:"+h+" "+"minutes: "+mi+" "+"Seconds: "+s);
	
	//to get the Date and Time at a time
	LocalDateTime dti = LocalDateTime.now();
	System.out.println("LocalDate and Time : "+dti);
	
	
	///using java1.7 Date
	Date d = new Date();
	System.out.println("Date using util package : "+d);
	
	//creating custom date using of()
	LocalDateTime dt2 = LocalDateTime.of(2911,5,05,12,45);
	System.out.println("Custom Date is : "+dt2);

}
}
