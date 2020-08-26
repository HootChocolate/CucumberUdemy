package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static SimpleDateFormat format;
	
	public static String formatddMMyyyy(Date dias) {
		format = new SimpleDateFormat("dd/MM/yyyy");
		
		return format.format(dias);
	}
}
