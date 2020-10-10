package mason.app;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class BootcampCountdownApp {

	public static void main(String[] args) {
		
		LocalDate bootcampStart = LocalDate.of(2020, Month.AUGUST, 10);
		LocalDate bootcampEnd = LocalDate.of(2021, Month.FEBRUARY, 24);
		LocalDate currentDate = LocalDate.now();
		
		long daysSinceStart = bootcampStart.until(currentDate, ChronoUnit.DAYS);
		System.out.println("Bootcamp started " + daysSinceStart + " days ago.");
		System.out.println();
		
		long daysUntilEnd = currentDate.until(bootcampEnd, ChronoUnit.DAYS);
		System.out.println("We have " + daysUntilEnd + " days until graduation.");
		System.out.println();

		long totalBootcampDays = daysSinceStart + daysUntilEnd;
		double percentComplete = (double) daysSinceStart / totalBootcampDays;
		
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		
		System.out.println("We are " + percentFormatter.format(percentComplete) + " complete!");
		
	}

}
