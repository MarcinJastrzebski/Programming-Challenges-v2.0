package main.calculator.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import main.menu.Menu;

//#23
public class DateCalc implements Menu {

	public long calculateDaysBetween(final LocalDate startDate, final LocalDate finishDate) {
		return ChronoUnit.DAYS.between(startDate, finishDate);
	}

	public long calculateDaysBetween(final LocalDateTime startDate, final LocalDateTime finishDate) {
		return Duration.between(startDate, finishDate).toDays();
	}

	@Override
	public void show() {
		System.out.println("Duration between two dates:");
		System.out.print("Type the first date: (dd-MM-yyyy) : ");
		final Scanner keyboard = new Scanner(System.in);
		final String firstDate = keyboard.next();
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		final LocalDate startDate = LocalDate.parse(firstDate, formatter);
		System.out.print("Type the second date: (dd-MM-yyyy) : ");
		final String secondDate = keyboard.next();
		final LocalDate finishDate = LocalDate.parse(secondDate, formatter);
		System.out.println("The difference between is " + calculateDaysBetween(startDate, finishDate) + " day/days");
		keyboard.close();
	}

	@Override
	public void showDescription() {
		System.out.print(this.getClass()
				+ " is obliged to show you a difference between 2 dates which you use in calculateDaysBetween(final LocalDate startDate, final LocalDate finishDate) method");
	}

}
