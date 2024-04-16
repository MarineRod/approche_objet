package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);

		Date d1 = cal1.getTime();

		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String formatDate = format1.format(d1);
		System.out.println(formatDate);

		Calendar cal2 = Calendar.getInstance();
		Date d2 = cal2.getTime();

		String formatDate2 = format1.format(d2);
		System.out.println(formatDate2);

		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formatDate3 = format2.format(d2);
		System.out.println(formatDate3);

		SimpleDateFormat French = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.FRENCH);
		SimpleDateFormat Russian = new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("ru", "RU"));
		SimpleDateFormat Chinese = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.CHINESE);
		SimpleDateFormat German = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.GERMAN);
		
		String formatDate4 = French.format(d2);
		System.out.println(formatDate4);
		
		String formatDate5 = Russian.format(d2);
		System.out.println(formatDate5);
		
		String formatDate6 = Chinese.format(d2);
		System.out.println(formatDate6);
		
		String formatDate7 = German.format(d2);
		System.out.println(formatDate7);
	}

}
