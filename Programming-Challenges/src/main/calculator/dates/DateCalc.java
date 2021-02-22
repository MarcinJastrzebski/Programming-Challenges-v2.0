package main.calculator.dates;

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
		// TODO Auto-generated method stub
		System.out.println("DateCalc");
	}

}
