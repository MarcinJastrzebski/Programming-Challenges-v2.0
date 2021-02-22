package test.calculator.dates;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import main.calculator.dates.DateCalc;

public class DateCalcTestSuite {
	
	@Test
	public void testCalculateDay() {
		//given
		DateCalc dateCalc = new DateCalc();
		LocalDate startDate = LocalDate.of(2021, 1, 1);
		LocalDate finishDate = LocalDate.of(2021, 1, 2);
		long result = dateCalc.calculateDaysBetween(startDate, finishDate);
		//when
		
		//then
		Assert.assertEquals(1l, result);
	
	}

}
