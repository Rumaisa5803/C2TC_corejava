package DateTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		DayOfWeek DayOfWeek = currDate.getDayOfWeek();
		int DayOfMonth = currDate.getDayOfMonth();
		int DayOfYear = currDate.getDayOfYear();
		System.out.println("Date:"+currDate);
		System.out.println("Day of week:"+DayOfWeek);
		System.out.println("Day of Month"+DayOfMonth);
		System.out.println("Day of Year:"+DayOfYear);
		
	}

}
