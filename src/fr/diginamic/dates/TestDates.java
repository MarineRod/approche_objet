package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1996,4,22);
		Date d1 =cal1.getTime();
		System.out.println(d1);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String formatDate = format1.format(d1);
		System.out.println(formatDate);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2016,4,19, 23,59,30);
		Date d2=cal2.getTime();	
	    System.out.println(d2);
	    
	    SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    String formatDate2 = format2.format(d2);
	    System.out.println(formatDate2);
		
		Calendar cal3 = Calendar.getInstance();
		Date d3 = cal3.getTime();
		System.out.println(d3);
		String formatDate3 = format2.format(d3);	
		System.out.println(formatDate3);
		
		
	
	}

}
