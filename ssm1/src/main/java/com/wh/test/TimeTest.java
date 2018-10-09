package com.wh.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTest {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(" yyyy-MM-dd ");

		String currentDate = dateFormat.format(new Date());
		
		System.out.println(currentDate);
		
		 Date dt= new Date();
	     long time= dt.getTime();
	     long sevenTime = 7*24*60*60*1000;
	     long times = time - sevenTime;
	     Date dat=new Date(times); 
	     GregorianCalendar gc = new GregorianCalendar(); 
	     gc.setTime(dat); 
	     java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");

	     String sb=format.format(gc.getTime()); 
	     System.out.println(sb); 


//	     System.out.println(time);
	}
}
