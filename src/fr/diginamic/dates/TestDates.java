package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TestDates {

	public static void main(String[] args) {
		
		//date d = new Date(91,7, 22);
		
		Calendar cal = Calendar.getInstance();
		Date d2 = cal.getTime();
		System.out.println(d2);
  
	 SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
	 String formatDate = format1.format(d2);
	 System.out.println(formatDate);
	 
	 //Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30 
	 //secondes
	 Calendar cal2 = Calendar.getInstance();
	 cal2.set(2016,4,19, 23,59,30);
	 Date d3 =cal2.getTime();
	 System.out.println(d3);
	 SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 String formatDate2 = format2.format(d3);
	 System.out.println(formatDate2);
	 String formatDate3 = format2.format(d2);
	 System.out.println(formatDate3);
	 
	 // Date date = new Date(116, 4, 19, 23, 59, 30);
	}

}
