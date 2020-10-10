package mason.app;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		System.out.println();
		
		LocalDate dateFromParse = LocalDate.parse("2020-01-01");
		System.out.println(dateFromParse);
		System.out.println();
		
		LocalDate weddingDate = LocalDate.of(2017, Month.NOVEMBER, 04);
		System.out.println(weddingDate);
		System.out.println(weddingDate.getMonthValue());
		System.out.println(weddingDate.getMonth());
		System.out.println(weddingDate.getDayOfWeek());
		System.out.println();
		
		System.out.println("Is weddingDate before currentDate: " + weddingDate.isBefore(currentDate));
		System.out.println("currentDate compareTo weddingDate: " + currentDate.compareTo(weddingDate));
		System.out.println();
		
		LocalDate halloween = LocalDate.of(2020,  Month.OCTOBER, 31);
		LocalDate february = halloween.withMonth(2);
		System.out.println(february);
		System.out.println();
		
		LocalDate nextMonth = currentDate.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth + " " + nextMonth.getDayOfWeek());
		LocalDate fourWeeks = currentDate.plus(4, ChronoUnit.WEEKS);
		System.out.println(fourWeeks + " " + fourWeeks.getDayOfWeek());
		
		long yearsMarried = weddingDate.until(currentDate,  ChronoUnit.YEARS);
				System.out.println("Married for " + yearsMarried + " years");
				System.out.println();
				
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("No formatter " + curDateTime + "\n");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("Medium format " + dtf.format(curDateTime) + "\n");
		
		
	}
}
