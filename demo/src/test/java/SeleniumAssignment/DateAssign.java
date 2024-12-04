package SeleniumAssignment;

import java.time.LocalDate;

import org.testng.annotations.Test;

public class DateAssign {
	@Test
	public void test() {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate tomorrowDate = currentDate.plusDays(1);
		System.out.println(tomorrowDate);
		
		
	}

}
