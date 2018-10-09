package com.wh.until;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class TimeSeven {
	public static List<Object> time(int t) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		String currentDate = dateFormat.format(new Date());

		//System.out.println(currentDate);

		Date dt = new Date();
		long time = dt.getTime();
		long sevenTime = t * 24 * 60 * 60 * 1000;
		long times = time - sevenTime;
		Date dat = new Date(times);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dat);
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");

		String sb = format.format(gc.getTime());
		//System.out.println(sb);
		
		List<Object> list = new ArrayList<Object>();
		list.add(currentDate);
		list.add(sb);
		return list;
	}
}
