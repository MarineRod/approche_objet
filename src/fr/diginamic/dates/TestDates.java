package fr.diginamic.dates;


import java.text.SimpleDateFormat;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String formatDate = format1.format(d1);
		System.out.println(formatDate);
		
		Date d2 = new Date (116, 4, 19, 23, 59,30);
	    SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    String formatDate2 = format2.format(d2);
	    System.out.println(formatDate2);
	    
	    String formatDate3 = format2.format(d1);
	    System.out.println(formatDate3);
		
		
		
	
	}

}
