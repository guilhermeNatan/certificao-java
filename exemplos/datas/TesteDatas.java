import java.time.*;
import java.time.temporal.*;
class TesteDatas{

	public static void main(String ...args)
	{
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();

		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(ldt);

		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		System.out.println(natal);
		
		ldt = LocalDateTime.of(2015, Month.FEBRUARY,25,13,45); 
		System.out.println(ldt);
		

		System.out.println("-----------------------------------");
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getYear());
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getMonth());
		System.out.println(ldt.get(ChronoField.MINUTE_OF_HOUR));


		System.out.println("-----------------------------------");
		System.out.println(ldt);
		System.out.println(ldt.withMonth(5));
		System.out.println(ldt.withDayOfYear(300));
		System.out.println(ldt.withDayOfMonth(20));
		
		System.out.println("-----------------------------------");
		System.out.println(LocalDateTime.of(1800,Month.DECEMBER,20,20,0));

		System.out.println("-----------------------------------");
		System.out.println(Period.between(LocalDate.now().minusDays(1000), LocalDate.now()));
	}
}

