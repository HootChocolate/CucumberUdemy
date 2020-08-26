package utils;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {

	public static Date getCalendarMaisQuantidadeDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		
		return calendar.getTime();
	}

}
